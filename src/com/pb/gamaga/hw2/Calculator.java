package com.pb.gamaga.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double operand1;
        double operand2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        operand1 = reader.nextDouble();
        operand2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = operand1 + operand2;
                break;
            case '-': ans = operand1 - operand2;
                break;
            case '*': ans = operand1 * operand2;
                break;
            case '/': ans = operand1 / operand2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(operand1 + " " + op + " " + operand2 + " = " + ans);
    }
}