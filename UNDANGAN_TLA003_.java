package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.util.Stack;

public class UNDANGAN_TLA003_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Prompts the user to enter a random sentence
        
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        
        //Splits the entered sentence into words
        String[] words = sentence.split(" ");
        
        //Creates a stack to hold the words
        Stack<String> stack = new Stack<>();
        
        //Pushes each word into a stack
        for(String word : words) {
            stack.push(word);
        }
        
        //Pop the words from the stack to reverse the order of the words
        StringBuilder reversedSentence = new StringBuilder();
        while(!stack.isEmpty()) {
            reversedSentence.append(stack.pop());
            if(!stack.isEmpty()) {
                reversedSentence.append(" ");
            }
        }
        
        //To print out the reversed version of the entered sentence
        System.out.println("Here is your reversed sentence: ");
        System.out.println(reversedSentence.toString());
        
        //To clsoe the scanner
        scanner.close();
    }
}
