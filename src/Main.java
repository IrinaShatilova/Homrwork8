import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Homework 8");
        //Задание 1
        System.out.println();
        System.out.println("Задание 1");
        System.out.println();
        int[] integerArray = new int [3];
        integerArray [0] = 1;
        integerArray [1] = 2;
        integerArray [2] = 3;
        double[] fractionalArray = {1.57, 7.654, 9.986};
        int[] arbitraryArray = {50, 55, 80, 75, 30}; {
        System.out.println("Массивы заданы, задание 1 выполнено");
        }
    }
    public static void task2() {
        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        int[] integerArray = {1,2,3};
        double[] fractionalArray = {1.57, 7.654, 9.986};
        int[] arbitraryArray = {50, 55, 80, 75, 30};
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i != integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractionalArray.length; i++) {
            System.out.print(fractionalArray[i]);
            if (i != fractionalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arbitraryArray.length; i++) {
            System.out.print(arbitraryArray[i]);
            if (i != arbitraryArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
        public static void task3() {
            //Задание 3
            System.out.println();
            System.out.println("Задание 3");
            System.out.println();
            int[] integerArray = {1, 2, 3};
            double[] fractionalArray = {1.57, 7.654, 9.986};
            int[] arbitraryArray = {50, 55, 80, 75, 30};
            for (int i = integerArray.length - 1; i >=0; i--) {
                System.out.print(integerArray[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = fractionalArray.length-1; i>=0; i--) {
                System.out.print(fractionalArray[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = arbitraryArray.length-1; i>=0; i--) {
                System.out.print(arbitraryArray[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    public static void task4() {
        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        int[] integerArray = {1,2,3};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i] +=1;
            }
            System.out.println(integerArray[i]);
        }
        System.out.println(Arrays.toString(integerArray));
    }
}