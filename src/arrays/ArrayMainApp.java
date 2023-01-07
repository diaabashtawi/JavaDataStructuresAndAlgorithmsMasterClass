package arrays;

import java.util.Arrays;

public class ArrayMainApp {
    public static void main(String[] args) {

        System.out.println("-----------------------Single Dimension Array Section start -----------------------------");
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
        System.out.println("-----------------------Single Dimension Array Section end -----------------------------");
        System.out.println(" ");
        System.out.println("-----------------------Two Dimension Array Section start -----------------------------");
        TwoDimensionalArray twoDimensionalArray =
                new TwoDimensionalArray(3, 3);
        twoDimensionalArray.insertElement(0, 0, 1024);
        twoDimensionalArray.insertElement(0, 1, 2048);
        twoDimensionalArray.accessArrayCell(0, 1);
        System.out.println(Arrays.deepToString(twoDimensionalArray.array));
        System.out.println("-----------------------Two Dimension Array Section end -----------------------------");


    }
}


