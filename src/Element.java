import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        System.out.println("The Array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Input the number:");
        int number = scanner.nextInt();
        System.out.println("Input the index:");
        int index = scanner.nextInt();

        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Can not input " + number + " to array.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            System.out.println("The new Array is:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }

    }

}
