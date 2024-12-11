package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 12;
        System.out.println("Ввидите имя: ");
        String name = scanner.nextLine();

//        System.out.println("Я загадал число отгадай: ");
//        int userNumber = scanner.nextInt();
        boolean status = true;
//        while (status) {
//            if (userNumber == number) {
//                System.out.println("Уррааа");
//                status = false;
//            } else {
//                System.out.println("Сиз тпкан жоксуз. Кайра аркакет кылыныз: ");
//                userNumber = scanner.nextInt();
//            }
//        }

        do {
            System.out.println("Я загадал число отгадай: ");
            int userNumber = scanner.nextInt();

            if (number == userNumber) {
                System.out.println(" ураа");
                status = false;
            }
        } while (status);


//        int count = scanner.nextInt();
//        for (int i = 0; i <= count; i++) {
//            System.out.println("trtr");
//            if (i == 2) {
//                continue;
//            }
//            System.out.println("Hello forld");
//        }

//        boolean status = true;
//        int count = 0;
//        while (status) {
//            System.out.println("Hello ");
//            count++;
//            if (count >= 10) {
//                status = false;
//            }
//        }

//        boolean status = false;
//        int count = 0;
//        do {
//            status = true;
//            if (count == 1) {
//                continue;
//            }
//            System.out.println("Hello");
//            if (count == 3) {
//                break;
//            }
//            count++;
//            if (count >= 10) {
//                status = false;
//            }
//        } while (status);

    }
}