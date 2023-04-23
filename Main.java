public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Task One");
        System.out.println("Choose 1 for Android and 0 for iOS!");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Check your OS again");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Task Two");
        System.out.println("Put the year of your OS installation");
        int clientOsYear = 2015;
        System.out.println("Choose 1 for Android and 0 for iOS!");
        int clientOs = 0;
        if (clientOsYear < 2015) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOsYear >= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();

    }
    public static void task3() {
        System.out.println("Task Three");
        int year = 2023;
        if ((year % 4 != 0) || (year % 100 ==0 &&  year % 400 !=0 )){
            System.out.println("год обычный");
        } else {
            System.out.println("год високосный");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Task Four");
        int deliveryDistance = 55;
        int days  = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + days);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 100) {
            if (deliveryDistance >=20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней:" + (days+1));
            } else {
                System.out.println("Потребуется дней:" + (days+2));
            }
        } else {
            System.out.println("Доставки нет.");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Task Five");
        System.out.println("Put the month's number from 1 to 12:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Srring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Check the number");
        }
        System.out.println();
    }
}