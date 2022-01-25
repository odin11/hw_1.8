package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void printYear (int  i) {                                     //4_task1
        //return 0;
        boolean checkYear = ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));
        if (checkYear) {
            System.out.println(i + " год является високосным");
        } else {
            System.out.println(i + " год не является високосным");
        }
    }

    public static void printVersion(int i, int clientOS) {                      //for_task2
        int currentYear = LocalDate.now().getYear();
        if (i == currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (i == currentYear && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (i < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if  (i < currentYear && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else{
            System.out.println("Смартфон из будущего");
        }
    }

    public static int getDays (int km) {                                           //for_task3
        int days = 1;
        if (km < 20) {
            //days = days;
        } else if (km >= 20 && km < 60) {
            days = days + 1;
        } else if (km >= 60 && km < 100) {
            days = days + 2;
        } else {
            days = 99999999;
            System.out.println("доставка не возможна");
        }
        System.out.println("Потребуется дней: " + days);
        return days;
    }


    public static void findDoubles(String str) {                                    //task4
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j)  == str.charAt(j + 1)) {
                System.out.println("дубль: " + str.charAt(j));
                break;
            }
        }
    }

    public static void reverseArray(int[] arr1) {                                      //task5
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]+" ");
        }
    }

    public static void main(String[] args) {
	// write your code here
    //task1
        int year = 2007;
        printYear(year);

    //task2
        int clientDeviceYear = 2021;
        int OS = 0;
        printVersion(clientDeviceYear,OS);

    //task3
        int deliveryDistance = 94;
        getDays(deliveryDistance);

    //task4

        String randomString = "aabccddefgghiijjkk";
        findDoubles(randomString);

    //task5
        int[] array1 = {3, 2, 1, 6, 5};
        reverseArray(array1);
    }
}
