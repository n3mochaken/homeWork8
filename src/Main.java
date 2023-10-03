import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        //task 1
        int[] firstArray = new int[3];
        for (int i = 0; i < 3; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = new double[3];
        secondArray[0] = 1.57;
        secondArray[1] = 7.654;
        secondArray[2] = 9.986;
        boolean[] thirdArray = {true, false, false};

        //task 2
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));

        //task 3
        for (int i = 2; i != -1; i--) {
            if (i < 3 && i > -1) {
                System.out.print(firstArray[i]);
            }
            if (i < 3 && i > 0) {
                System.out.print(",");
            } else {
                System.out.println(" ");
            }

        }
        for (int i = 2; i != -1; i--) {
            if (i < 3 && i > -1) {
                System.out.print(secondArray[i]);
            }
            if (i < 3 && i > 0) {
                System.out.print(",");
            } else {
                System.out.println(" ");
            }

        }
        for (int i = 2; i != -1; i--) {
            if (i < 3 && i > -1) {
                System.out.print(thirdArray[i]);
            }
            if (i < 3 && i > 0) {
                System.out.print(",");
            } else {
                System.out.println(" ");
            }
        }

        //task 4
        for (int i = 0; i < 3; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] = firstArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}









