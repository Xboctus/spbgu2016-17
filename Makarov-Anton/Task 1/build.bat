md build\classes
javac -d build\classes src\basic\HelloWorld.java

echo Main-Class: basic.HelloWorld>manifest
md build\jar
jar cfm build\jar\helloworld.jar manifest -C build\classes .