public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOS = 1;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2023;

        if (year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + "год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + "год является високосным");
        } else
            System.out.println(year + "год не является високосным");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int timeToDelivery = 0;

        if (deliveryDistance < 20) {
            timeToDelivery =+ 1;
            System.out.println("Delivery need days: " + timeToDelivery);
        } else if (deliveryDistance < 60) {
            timeToDelivery =+ 2;
            System.out.println("Delivery need days: " + timeToDelivery);
        } else if (deliveryDistance < 100) {
            timeToDelivery =+ 3;
            System.out.println("Delivery need days: " + timeToDelivery);
        } else  System.out.println("Delivery disable");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("WTF");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
            }
        }
    }
}