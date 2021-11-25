package Ex5;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        List<String> list = new ArrayList<>();
        list.add(read.read());
        list.add(read.read());
        list.add(read.read());
        list.add(read.read());

        Filter filter = new FilterList();
        filter.showAllResults(filter.filterList(list));


    }
}
