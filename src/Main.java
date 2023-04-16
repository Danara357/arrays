import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task21();
        task22();
        task3();
        task31();
        task32();
        task4();
    }

    public static void task1() {
        System.out.println(" Задача 1");
        int[] array = new int[]{1, 2, 3};
        double[] number = {1.57, 7.654, 9.986};
        int[] cat = {12, 25, 15, 16, 57, 88, 88, 45, 92, 1_000};
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int[] array1 = new int[]{1, 2, 3};
        System.out.print(array1[0]);
        for (int i = 1; i < array1.length; i++) {
            System.out.print(", " + array1[i]);
        }
    }

    public static void task21() {
        System.out.println("   ");
        double[] number = {1.57, 7.654, 9.986};
        System.out.print(number[0]);
        for (int i = 1; i < number.length; i++) {
            System.out.print(", " + number[i]);
        }
    }

    public static void task22() {
        System.out.println("   ");
        int[] cat = {12, 25, 15, 16, 57, 88, 88, 45, 92, 1_000};
        System.out.print(cat[0]);
        for (int i = 1; i < cat.length; i++) {
            System.out.print(", " + cat[i]);
        }
    }


    public static void task3() {
        System.out.println(" ");
        System.out.println(" Задача 3");
        int[] array1 = new int[]{1, 2, 3};
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(", " + array1[i]);
            }
        }
    }

    public static void task31() {
        System.out.println("   ");
        double[] number = {1.57, 7.654, 9.986};
        for (int i = number.length - 1; i >= 0; i--) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
            } else {
                System.out.print(", " + number[i]);
            }
        }
    }

    public static void task32() {
        System.out.println("   ");
        int[] cat = {12, 25, 15, 16, 57, 88, 88, 45, 92, 1_000};
        for (int i = cat.length - 1; i >= 0; i--) {
            if (i == cat.length - 1) {
                System.out.print(cat[i]);
            } else {
                System.out.print(", " + cat[i]);
            }
        }
    }

    public static void task4() {
        System.out.println(" ");
        System.out.println(" Задача 4");
        int[] array1 = {2, 15, 12, 16, 125};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}








