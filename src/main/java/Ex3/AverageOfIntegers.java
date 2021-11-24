package Ex3;

import java.util.List;

public class AverageOfIntegers implements Average<Integer>{


    @Override
    public Integer calculateAverage(List<Integer> integerList) {
        //integerList.stream().mapToDouble().average().getAsDouble();
        return integerList.stream().reduce(0, Integer::sum)/integerList.size();
    }


}
