//Brandon Vo
//CS 1400
//Assignment 4
//10/30/21
import java.util.Scanner;
public class TriviaGame 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int pointsp1 = 0;
        int pointsp2 = 0;
// hello this is a new comment

        Question[] qarray = new Question[10];
        qarray[0] = new Question("What is the biggest island in the world?", "1) Hawaii", "2) Iceland", "3) Greenland", "4) Vancouver Island", 3);
        qarray[1] = new Question("What is the capital of Kansas?", "1) Topeka", "2) Wichita", "3) Kansas City", "4) Des Moines", 1);
        qarray[2] = new Question("Which Super Bowl did Tom Brady NOT win?", "1) XXXIX", "2) XLIX", "3) LII", "4) LV", 3);
        qarray[3] = new Question("Is a tomato a fruit or vegetable?", "1) Fruit", "2) Vegetable", "3) Both", "4) Neither", 1);
        qarray[4] = new Question("How many times can a person legally change their name?", "1) 1", "2) 2", "3) 3", "4) As many times as they like", 4);
        qarray[5] = new Question("Who was the 3rd man on the moon", "1) Buzz Aldrin", "2) James Irwin", "3) Pete Conrad", "4) Neil Armstrong", 3);
        qarray[6] = new Question("What language is this?: 你好", "1) Japanese", "2) Chinese", "3) Malay", "4) Lao", 2);
        qarray[7] = new Question("Which one of these colors is NOT a real iPhone 11 color?", "1) Yellow", "2) Green", "3) Purple", "4) Blue", 4);
        qarray[8] = new Question("Which of these states have the most ocean coastline?", "1) Maine", "2) California", "3) Florida", "4) Louisiana", 3);
        qarray[9] = new Question("Who painted the Mona Lisa", "1) Van Gogh", "2) Picasso", "3) Da Vinci", "4) Monet", 3);

        System.out.println("Welcome to Trivia Game! Players 1 and 2 will be given 5 questions each, starting with Player 1. Please enter a number 1-4 to lock in your choice.");

        for (int x = 0; x < 5; x++)
        {   
            System.out.println(qarray[x].getTriviaQuestion());
            System.out.println(qarray[x].getAnswer1());
            System.out.println(qarray[x].getAnswer2());
            System.out.println(qarray[x].getAnswer3());
            System.out.println(qarray[x].getAnswer4());

            int response = scan.nextInt();

            if (response == qarray[x].getCorrectAnswer())
            {
                System.out.println("Correct! You have earned 1 point.");
                pointsp1++;
            }
            else
            {
                System.out.println("Wrong! You have earned 0 points. The correct answer was " + qarray[x].getCorrectAnswer());
            }
            System.out.println(" ");
        }

        System.out.println("Now it is player 2's turn!");

        for (int x = 5; x < 10; x++)
        {   
            System.out.println(qarray[x].getTriviaQuestion());
            System.out.println(qarray[x].getAnswer1());
            System.out.println(qarray[x].getAnswer2());
            System.out.println(qarray[x].getAnswer3());
            System.out.println(qarray[x].getAnswer4());

            int response = scan.nextInt();

            if (response == qarray[x].getCorrectAnswer())
            {
                System.out.println("Correct! You have earned 1 point.");
                pointsp2++;
            }
            else
            {
                System.out.println("Wrong! You have earned 0 points.");
            }
            System.out.println(" ");
        }

        System.out.println("Game Over!");
        System.out.println("Player 1's Score: " + pointsp1);
        System.out.println("Player 2's Score: " + pointsp2);

        if (pointsp1 > pointsp2)
        {
            System.out.println("Congratuations Player 1, you have won the game!");
        }
        else if (pointsp2 > pointsp1)
        {
            System.out.println("Congratuations Player 2, you have won the game!");
        }
        else
        {
            System.out.println("You have both tied in points!");
        }
    }
}
