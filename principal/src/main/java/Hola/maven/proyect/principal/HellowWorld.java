package Hola.maven.proyect.principal;

import Hola.maven.proyect.principal.Greeter;

import java.time.LocalTime;

public class HellowWorld{
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
