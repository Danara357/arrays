import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] salaryDay = generateRandomArray();
        System.out.println(Arrays.toString(salaryDay));
        int sumSalary = 0;
        for (int salary : salaryDay) {
            sumSalary += salary;
        }
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] salaryDay = generateRandomArray();
        System.out.println(Arrays.toString(salaryDay));
        int minSalary = 300_000;
        int maxSalary = 99_000;
        for (int salary : salaryDay) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
            if (salary < minSalary) {
                minSalary = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary +
                " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
        Arrays.sort(salaryDay);
        System.out.println("Минимальная сумма трат за день составила " + salaryDay[0] +
                " рублей. Максимальная сумма трат за день составила " + salaryDay[salaryDay.length - 1] + " рублей");
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] salaryDay = generateRandomArray();
        System.out.println(Arrays.toString(salaryDay));
        int allSalary = 0;
        for (int salary : salaryDay) {
            allSalary += salary;
        }
        double midlSalary = (double) allSalary/salaryDay.length;
        System.out.println("Средняя сумма трат за месяц составила "+midlSalary+ " рублей");
    }
    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}




