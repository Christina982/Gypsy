
/**
 * Write a description of class Jason here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random; 

public class Jason
{
    private String badResponse = "Who da hell you dink you is?";
    private String goodResponse = "Well good day sir";
    private Random random = new Random();
    
    public void askJasonAnyQuestion(String question) {
        int rando = random.nextInt();
        if (rando%2 == 1) {
            System.out.println("Did you ask me " + question + "...." +badResponse);
        } else {
            System.out.println(goodResponse);
        }
    }
}
