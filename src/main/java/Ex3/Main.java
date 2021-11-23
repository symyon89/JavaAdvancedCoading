package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        List<Integer> list = new ArrayList<>();
        list.add(read.read());
        list.add(read.read());
        list.add(read.read());
        list.add(read.read());
        Average average = new AverageOfIntegers();
        System.out.println(average.calculateAverage(list));

    }
}
