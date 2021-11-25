package Ex2;

import java.util.Scanner;

public class ReadArrayDimension {
    public int readDimension() {
        System.out.print("Type the dimension of array: ");
        Scanner scannerNumber = new Scanner(System.in);
        int dimensionOfArray = scannerNumber.nextInt();
        return dimensionOfArray;
    }
}
