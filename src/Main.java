import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Задача 1------------------");
        task1();
        System.out.println();
        System.out.println("------------------Задача 2------------------");
        task2();
        System.out.println();
        System.out.println("------------------Задача 3------------------");
        task3();
        System.out.println();
        System.out.println("------------------Задача 4------------------");
        task4();
        System.out.println();

    }

    public static void task1() {
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = new double[]{1.57, 7.654, 9.986};
        boolean[] arrayThree = {true, false, true, true, true, false};
    }

    public static void task2() {
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = new double[]{1.57, 7.654, 9.986};
        boolean[] arrayThree = {true, false, true, true, true, false};
        System.out.println("Значение элементов первого массива");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i < arrayOne.length - 1) {
                System.out.print( ", ");
            }

        }
        //первый способ распечатки без запятой ниже приведен второй способ распечатки без запятой
        //воторлой способ прегружен лишним оператором но все равно осталю как пример плохого кода
        System.out.println();
        System.out.println("Значение элементов второго массива");
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < arrayTwo.length - 1) {
                System.out.print(arrayTwo[i] + ", ");
            } else {
                System.out.print(arrayTwo[i]);
            }
        }
        System.out.println();
        System.out.println("Значения элементов третьего массива");
        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayThree.length - 1) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.print(arrayThree[i]);
            }
        }

    }

    public static void task3() {
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = new double[]{1.57, 7.654, 9.986};
        boolean[] arrayThree = {true, false, true, true, true, false};
        System.out.println("Значение элементов первого массива");
        for (int i = (arrayOne.length - 1); i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Значение элементов второго массива");
        for (int i = (arrayTwo.length - 1); i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Значение элементов третьего массива");
        for (int i = (arrayThree.length - 1); i >= 0; i--) {
            System.out.print(arrayThree[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        int[] arrayOne = new int[]{1, 2, 3};
        for (int i = 0; i < arrayOne.length; i++) {
            if ( arrayOne[i] % 2 != 0){
                arrayOne[i] = arrayOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));

            }
}


