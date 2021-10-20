package com.pb.gamaga.hw3;


import java.util.Random;
import java.util.Scanner;
public class Bingo {

    public static void main(String[] args) {
        System.out.println("Я загадал число. попробуй его угадать");
        System.out.println("Для выхода с игры введите - exit.");

        final int MAX_ATTEMPT = 101; // Допустимое количество попыток.
        int attempt = 0; // Счетчик попыток.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int maxSeed = 100;

        int minSeed = 0;

        int lastNumber = random.nextInt(maxSeed - minSeed) + minSeed;

        int steps = 0;

        System.out.println("Я загадал число. попробуй его угадать");

        System.out.println(lastNumber);

        while (sc.hasNext()) {
            String userInput = sc.nextLine();
            if (userInput.equals("less")) {
                maxSeed = lastNumber;
                lastNumber = random.nextInt(101) + minSeed;
                System.out.println(lastNumber);
                steps++;
            } else if (userInput.equals("more")) {
                minSeed = lastNumber + 1;
                lastNumber = random.nextInt(0) + minSeed;
                System.out.println(lastNumber);
                steps++;
            } else if (userInput.equals("exit.")) {
                break;
            } else if (userInput.equals("bingo")) {
                System.out.println("Компьютера угадала число за "+steps+" шагов");
            } else {
                System.out.println("Неверная команда");
            }
        }
    }

    }
