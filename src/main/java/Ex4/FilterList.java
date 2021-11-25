package Ex4;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList implements Filter {

    @Override
    public List<String> upperList(List<String> list) {
       return list.stream().map(text -> text.toUpperCase()).collect(Collectors.toList());
    }

    public void showAllresults(List<String> list) {
        list.forEach(System.out ::println);
    }
}
