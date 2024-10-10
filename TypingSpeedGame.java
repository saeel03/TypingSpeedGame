// Author: Saeel Sakhalkar
// Rollno: 38;
// Title: Typing Speed Game in java
// Start Date:
// Modified Date:
// Description: This is the program where oops fundamentals are used. Basically this is simple console based game in java which helps to check your typing speed 

import java.util.Scanner;

public class TypingSpeedGame {

    private static final String SAMPLE_TEXT = "The quick brown fox jumps";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the Typing Speed Game!");
        System.out.println("Type the below sentence:");
        System.out.println(SAMPLE_TEXT);

        System.out.println("\nPress Enter to start typing...");
        scanner.nextLine(); 

        long startTime = System.currentTimeMillis(); 

        System.out.println("\nStart typing now:");
        userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime; 

        double timeInSeconds = timeTaken / 1000.0;

        
        int wordCount = SAMPLE_TEXT.split(" ").length;
        double wpm = (wordCount / timeInSeconds) * 60;

        String noextraSample=SAMPLE_TEXT.trim().replaceAll("\\s+", " ");
        String noextraUser=userInput.trim().replaceAll("\\s+", " ");

        
        int correctChars = 0;
        int totalChars = SAMPLE_TEXT.length();

       
        int length = Math.min(SAMPLE_TEXT.length(), userInput.length());

        for (int i = 0; i < length; i++) {
            if (noextraSample.charAt(i) == noextraUser.charAt(i)) {
                correctChars++;
            }
        }

     
        double accuracy = ((double) correctChars / totalChars) * 100;

        System.out.println("  ");
        System.out.println("  ");

        
        if(timeInSeconds<5){
            System.out.println("You won Gold");
        } else if(timeInSeconds<20){
            System.out.println("You won Silver");
        }
        else {
            System.out.println("you won Brownz, you need to improve your performance");
        }

        System.out.println("  ");
        System.out.println("  ");
        
        System.out.printf("\nTime taken: %.2f seconds\n", timeInSeconds);
        System.out.printf("Words per minute: %.2f WPM\n", wpm);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        
        System.out.println("  ");
        System.out.println("  ");


        

        
        if (accuracy == 100.0) {
            System.out.println("Great job! You typed the sentence perfectly.");
        } else if (accuracy >= 90.0) {
            System.out.println("Good job! Your accuracy is high.");
        } else {
            System.out.println("Keep practicing to improve your accuracy.");
        }

        scanner.close();
    }
}
