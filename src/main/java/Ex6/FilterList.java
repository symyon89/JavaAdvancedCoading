package Ex6;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    // Implementare Singelton
    private static FilterList filterList;

    public synchronized static FilterList getFilterList() {
        if (filterList == null) {
            filterList = new FilterList();
        }
        return filterList;
    }
    private FilterList(){

    }


    public String filterList(List<Integer> list) {
        if( list == null || list.isEmpty()){
            return "";
        }
      // return list.stream().filter(text -> text.matches("^a{3}$")).collect(Collectors.toList());
       return list.stream()
        .map(value -> value % 2 == 0 ? "e" + value : "o" + value)
               .collect(Collectors.joining(", "));
    }

}
