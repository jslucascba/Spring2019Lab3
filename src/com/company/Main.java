package com.company;
//import system Scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Declare Variables
        String question;
        String choiceA;
        String choiceB;
        String choiceC;
        String answer;
        String correctAnswer;
        int correct = 0;

        //Ask question 1
        question = "What is the result of 9+6/3?";
        choiceA = "5";
        choiceB = "11";
        choiceC = "15/3";
        correctAnswer = "b";

        answer = askQuestion(question, choiceA, choiceB, choiceC);

        //Check answer to question 1
        correct = checkAnswer(answer, correctAnswer, correct);

        //Ask question 2
        question = "Passing an argument by ______ means that only a copy of the argument's value is passed into the parameter variable.";
        choiceA = "Reference";
        choiceB = "Variable";
        choiceC = "Value";
        correctAnswer = "c";

        answer = askQuestion(question, choiceA, choiceB, choiceC);

        //Check answer to question 2
        correct = checkAnswer(answer, correctAnswer, correct);

        //Ask question 3
        question = "The method ____ specifies the return data type, name of the method, and the parameter variable(s).";
        choiceA = "Definition";
        choiceB = "Body";
        choiceC = "Header";
        correctAnswer = "c";

        answer = askQuestion(question, choiceA, choiceB, choiceC);

        //Check answer to question 3
        correct = checkAnswer(answer, correctAnswer, correct);

        //Display results
        displayResults(correct);

    }


    //Step 1 - method to ask question and return answer
    // add your code here


    //Step 2 - Check answer and increment correct count if correct.  Return correct count
    // add your code here

    //Step 3 - Display results
    //add your code here

}
