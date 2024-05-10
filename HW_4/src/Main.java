public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 90;
        int b = 100;
        int sumAb = a + b;
        if (sumAb >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
