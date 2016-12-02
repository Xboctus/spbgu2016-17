package com.exigenservices.lectures;

import com.exigenservices.lectures.util.InMemoryStorage;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName = "Topic1")
public class Consumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            putToStorage(((TextMessage) message).getText());
        } catch (JMSException ex) {
            putToStorage(ex.toString());
        }
    }
    
    protected void putToStorage(String message) {
        InMemoryStorage.add(getClass().getName() + " > " + message);
    }
}
