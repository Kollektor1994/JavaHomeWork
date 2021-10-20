package com.pb.gamaga.hw3;
import java.util.Scanner;
import java.util.Random;

public class l {
    public static void main(String[] args) {
    //creates a new scanner object
        try (Scanner input = new Scanner(System.in)) {
            Scanner sc = new Scanner(System.in);

            // randomly generates a number from 1-100
            Random rand = new Random();
            int myNumber = rand.nextInt(100) + 1;

            String tooWarm = "Слишком высоко. Попробуйте снова!";
            String tooCold = "Слишком низко. Попробуйте снова!";
            String bingo = "bingo!";

            System.out.printf("Как тебя имя? ");
            String name = sc.nextLine();
            System.out.println("вот уж не догадываюсь, о каком номере я думаю! \\ nПодсказка: от 1 до 100\n...");

            final int MAX_ATTEMPT = 5; // Допустимое количество попыток.
            int attempt = 0; // Счетчик попыток.




            while (true) {
                int value = sc.nextInt();


                if (value > myNumber) {
                    System.out.println(tooWarm);
                } else if (value < myNumber) {
                    System.out.println(tooCold);
                } else {
                    System.out.println(bingo);
                    return;
                }
                while (sc.hasNext()) {
                    System.out.println("Для выхода с игры введите - exit.");
                    String userInput = sc.nextLine();
                    if (userInput.equals("exit.")) ;
                    break;
                }
            }
        }
    }
}