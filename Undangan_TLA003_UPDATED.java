package com.mycompany.undangan_tla003;

import java.util.Scanner;
import java.util.Stack;
public class Undangan_TLA003_UPDATED {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Creates a stack to hold the words that were entered.
        StackH<String> stack = new Stack<>();
        
        System.out.println("Please enter some words you would like to enter:");
        
        //The next few lines will continually prompt the user to enter the words until the type 'exit'
        while(true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break; //This exits the loop as long as the user enters 'exit'
            }
            stack.push(word); //Pushes each word into the stack.
        }
        
        //Pop the words from the stack to reverse the order of the words.
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop());
            if (!stack.isEmpty()) {
                reversedSentence.append(" ");
            }
        }
        
        //To print out the reversed entered order of the word that were entered
        System.out.println("Here is your reversed sentence output: ");
        System.out.println(reversedSentence.toString());
    }
}
