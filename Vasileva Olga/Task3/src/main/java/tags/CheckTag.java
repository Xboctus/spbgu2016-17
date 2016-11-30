package tags;

import java.util.Random;

/**
 * Created by olga on 28.11.16.
 */
public class CheckTag{
    public  static boolean check(String num){
        Random r= new Random();
        if ((r.nextInt(99)+1)==Integer.parseInt(num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}