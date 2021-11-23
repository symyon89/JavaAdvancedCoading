package Ex3;

import java.util.List;

public class AverageOfIntegers implements Average<Integer>{


    @Override
    public Integer calculateAverage(List<Integer> integerList) {
        return integerList.stream().reduce(0, Integer::sum)/integerList.size();
    }


}
