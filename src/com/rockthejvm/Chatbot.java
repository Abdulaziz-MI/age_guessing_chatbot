package com.rockthejvm;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
// instantiating a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I am Tree, the chatbot you programmed");
        System.out.println("May I know your name ");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        System.out.println("I'm going to try guess your age.");
        System.out.println("May I Know the remainder of your age divided by 5?");
        int ageMod5 = scanner.nextInt();
        System.out.println("Thank you, May I Know the remainder of your age divided by 7?");
        int ageMod7 = scanner.nextInt();
        System.out.println("Thanks again, May I Know the remainder of your age divided by 9?");
        int ageMod9 = scanner.nextInt();

        System.out.println("You wrote " + ageMod5 + ", " + ageMod7 + ", and " +ageMod9);
//        deduce user's age
        int age = 0;
        int potentialAge = 1;


        while (potentialAge <=120){

            if (      potentialAge % 5 == ageMod5
              &&      potentialAge % 7 == ageMod7
              &&      potentialAge % 9 == ageMod9)
            {age = potentialAge;}
            potentialAge++;
        }
        if (age == 0) {
            System.out.println("Error, I could not deduce your age, most likely your answer is incorrect");
        }  else{
            System.out.println("I've deduced tha your age is " + age);
        }
    }


}
