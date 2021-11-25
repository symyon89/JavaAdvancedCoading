package Ex4;

import java.util.Scanner;

public class Read {

    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter un text :");
        return scanner.nextLine();
    }
}
