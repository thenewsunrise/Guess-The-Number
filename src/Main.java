
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the Number Guessing Game!\n" +
            "I'm thinking of a number between 1 and 100.");
    System.out.println("Please select the difficulty level:\n" +
            "1. Easy (10 chances)\n" +
            "2. Medium (5 chances)\n" +
            "3. Hard (3 chances)\n");
    System.out.print("Enter your choice:");
    int choice = s.nextInt();


    switch(choice){
      case 1 :
        System.out.println("Great! You have selected the Easy difficulty level.\n" +
                "Let's start the game!");

        int num1 = (int)(Math.random()*101);
        for(int i = 1 ; i < 11 ; i++){
          System.out.print("Enter your guess:");
          int num = s.nextInt();
          if(num == num1 ){
            System.out.println("Congratulations! You guessed the correct number in  "+ i +"  attempts");
            break;
          }else if(num > num1){
            System.out.println("Incorrect! The number is less than : " + num);
          }else {
            System.out.println("Incorrect! The number is greater than :" + num);
          }
        }
        break;

      case 2 :
        System.out.println("Great! You have selected the Medium difficulty level.\n" +
                "Let's start the game!");
        num1 = (int)(Math.random()*101);
        for(int i = 1 ; i < 6 ; i++){
          System.out.print("Enter your guess:");
          int num = s.nextInt();
          if(num == num1 ){
            System.out.println("Congratulations! You guessed the correct number in  "+ i + " attempts");
            break;
          }else if(num > num1){
            System.out.println("Incorrect! The number is less than : " + num);
          }else {
            System.out.println("Incorrect! The number is greater than :" + num);
          }
        }
        break;
      case 3 :
        System.out.println("Great! You have selected the Hard difficulty level.\n" +
                "Let's start the game!");
        num1 = (int)(Math.random()*101);
        for(int i = 1 ; i < 4 ; i++){
          System.out.print("Enter your guess:");
          int num = s.nextInt();
          if(num == num1 ){
            System.out.println("Congratulations! You guessed the correct number in  "+ i +"  attempts");
            break;
          }else if(num > num1){
            System.out.println("Incorrect! The number is less than : " + num);
          }else {
            System.out.println("Incorrect! The number is greater than :" + num);
          }
        }
        break;
    }
  }
}


