package arrays;

public class ArrayMainApp {
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray =
                new SingleDimensionArray(3);
        singleDimensionArray.insertValue(0, 1024);
        singleDimensionArray.insertValue(1, 512);
        singleDimensionArray.insertValue(2, 256);
        singleDimensionArray.insertValue(2, 256);

        System.out.println("----------------------------------------------------");
        singleDimensionArray.traverseArray();

        System.out.println("----------------------------------------------------");
        singleDimensionArray.searchForElement(1024);

        System.out.println("----------------------------------------------------");
        singleDimensionArray.deleteElement(0);

        System.out.println("----------------------------------------------------");
        singleDimensionArray.traverseArray();
    }
}


