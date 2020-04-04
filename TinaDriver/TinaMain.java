/**
 * Write a description of class TinaMain here.
 *
 * @author Christina Martinez
 * @version 1.0
*/

import java.util.Scanner;

public class TinaMain
{
    public static void main(String[] args)
    {
        Tina tina = new Tina("Clooney");
        tina.sayHello();
        Tina tina2 = new Tina("BabyCake");
        Tina tina3;                                     // this is a comment - this line declares a variable tina3 of type Tina
        tina3 = new Tina("Gypsy");                      // this line instantiates tina3
        String margie = "margie";                       // this is the correct way to instantiate a string            
        String steve = new String("steve");             // this works but dont do it this way
        Tina tina4 = new Tina(margie);
        Tina tina75;
        tina75 = new Tina(steve);
        tina.sayHello();
        tina2.sayHello();
        tina3.sayHello();
        tina4.sayHello();
        tina75.sayHello();
        Tina abigail = new Tina("Jason");
        Tina roger = new Tina("7");

        Scanner input = new Scanner(System.in);
        Jason jMan = new Jason();
        
        while (true) {
            System.out.println("Ask me any question");
            String question = input.nextLine();
            if ("exit".equals(question)) break;
            jMan.askJasonAnyQuestion(question);
        }
        
        
        System.out.println("Good Bye, Sucka!!!!");
//        Car color;
//        color = new Car();
//        System.out.println("my car color is " + color.getColor());
//        color.setColor("blue");
//        System.out.println("my car color is " + color.getColor());
//        System.out.println("my car shape is " + color.getShape());
//        color.setShape("truck");
//        System.out.println("my car shape is " + color.getShape());
//        System.out.println("my car door is " + color.getDoors());
//        color.setDoors(2);
//        System.out.println("my car door is " + color.getDoors());

        // "margie" == new String("margie");
    }
}
