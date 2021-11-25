package Ex2;

public class Main {
    public static void main(String[] args) {

        ReadArrayDimension dimension = new ReadArrayDimension();
        int dimensionOfArray = dimension.readDimension();

        PopulateArray array = new PopulateArray();
        int[] myArray = array.populateArray(dimensionOfArray);

        System.out.print("Initial Array: ");
        ShowArray showArray = new ShowArray();
        showArray.printArray(myArray);

        Sorter sort = new SortArray();
        myArray = sort.sortArray(myArray);

        System.out.print("Sorted Array: ");
        showArray.printArray(myArray);


    }
}
