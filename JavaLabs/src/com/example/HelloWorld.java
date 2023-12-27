package com.example;
import com.example.*;

public class HelloWorld {
    public static void main(String[] args) {
        
        int x = 10;

        if (x > 5) {

            System.out.print("Hello");

            if (x < 15) {

                System.out.println("World");

            }

        }

      Dog myDog = new Dog("Bosco", 4);  
      System.out.println(myDog.name);

      System.out.println(Constants.MY_NAME);

      User u1 = new User();
      u1.name = "Antony";
      u1.membership = "Gold";
      System.out.println(u1.name);
      System.out.println(u1.membership);

      User u2 = new User();
      u2.name = "Mark";
      u2.membership = "Silver";

      System.out.println(u2.name);
      System.out.println(u2.membership);

        
    }
  

}
