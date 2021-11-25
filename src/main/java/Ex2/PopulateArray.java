package Ex2;

import java.util.Scanner;

public class PopulateArray {
    public int[] populateArray(int dimensionOfArray) {
        Scanner scannerNumber = new Scanner(System.in);
        int[] array = new int[dimensionOfArray];
        System.out.println("Type values of array: ");
        for (int i = 0; i < dimensionOfArray; i++) {
            array[i] = scannerNumber.nextInt();
        }
        return array;

    }
}
