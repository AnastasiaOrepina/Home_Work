import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords(); //1
        checkSumSign(); //2
        printColor(); //3
        compareNumbers(); //4
        checkSumPositive(); //5
        checkNumberPositive(); //6
        checkNumberPositiveTrue(); //7
        printString("Hello", 4); //8
        checkLeapYear(); //9
        arrayChangeOneNull(); //10
        arrayFill(); //11
        arrayMultiplySix(); //12
        createArrayDiagonal(5, 5); //13
        createArray(6, 2); //14
    }

    public static void printThreeWords() { //1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { //2
        int a = 100;
        int b = 100;
        int sumAb = a + b;
        if (sumAb >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() { //3
        int value = 111;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() { //4
        int a = 100;
        int b = 100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void checkSumPositive() { //5
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sumAb = a + b;
        if (sumAb >= 10 && sumAb <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void checkNumberPositive() { //6
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static void checkNumberPositiveTrue() { //7
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
    public static void printString(String a, int b) { //8
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static void checkLeapYear() { //9
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 != 0) {
            System.out.println(false);
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else if (year % 4 == 0) {
            System.out.println(true);
        }
    }
    public static void arrayChangeOneNull() { //10
        int [] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else if (nums[i] == 1) {
                nums[i] = 0;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void arrayFill() { //11
        int [] nums = new int [100];
        for (int i = 1; i < 101; i++) {
            nums[i-1] = i;
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void arrayMultiplySix() { //12
        int [] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            } else {
                continue;
            };
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void createArrayDiagonal(int row, int column) { //13
        int [] [] nums = new int [row] [column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == i || j == row - i - 1) {
                    nums[i][j] = 1;
                }
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void createArray(int len, int initialValue) { //14
        int [] nums = new int [len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = initialValue;
        }
        System.out.print(Arrays.toString(nums));
    }
}

