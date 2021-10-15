package com.pb.gamaga.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double operand1;
        double operand2;
        double ans = 0;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        operand1 = reader.nextDouble();
        operand2 = reader.nextDouble();
        System.out.println("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = operand1 + operand2;
                System.out.println ("The result is given as follows:");
                System.out.println(operand1 + " " + op + " " + operand2 + " = " + ans);
                break;
            case '-': ans = operand1 - operand2;
                System.out.println ("The result is given as follows:");
                System.out.println(operand1 + " " + op + " " + operand2 + " = " + ans);
                break;
            case '*': ans = operand1 * operand2;
                System.out.println ("The result is given as follows:");
                System.out.println(operand1 + " " + op + " " + operand2 + " = " + ans);
                break;
            case '/':  if (operand2 == 0) {
                System.out.println("Деление на ноль не возможно");
                } else
                {
                    ans = operand1 / operand2;
                System.out.println ("The result is given as follows:");
                System.out.println(operand1 + " " + op + " " + operand2 + " = " + ans);
                    }
                break;
            default:
                System.out.println("Error! Enter correct operator"); return;
        }
    }
}