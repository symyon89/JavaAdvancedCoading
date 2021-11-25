package Ex3;

import java.util.List;

public class AverageOfIntegers implements Average<Integer>{


    @Override
    public Integer calculateAverage(List<Integer> integerList) {
        return (int) integerList.stream().mapToInt(x ->x).average().orElse(0.0);
    }

}
