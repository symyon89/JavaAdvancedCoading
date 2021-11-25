package Ex5;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList implements Filter{

    @Override
    public List<String> filterList(List<String> list) {
        if( list == null ){
            return list;
        }
       return list.stream().filter(text -> text.matches("^a.{2,2}$")).collect(Collectors.toList());
      // return list.stream().filter(text -> text.startsWith("a") && (text.length() == 3)).collect(Collectors.toList());
    }

    public void showAllResults(List<String> list) {
        list.forEach(System.out::println);
    }
}
