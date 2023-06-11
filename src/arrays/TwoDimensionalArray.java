package arrays;

public class TwoDimensionalArray {

    int [][] array = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.array = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertElement(int row, int col, int value){
        try {
            if (array[row][col] == Integer.MIN_VALUE){
                array[row][col] = value;
                System.out.println("The Value has been successsfully inserted");
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid Index");
        }
    }

    public void accessArrayCell(int row, int col){
        System.out.println("Accessing Row " + row + " Column " + col);
        try {
            System.out.println("Cell value is : " + array[row][col]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid Index");
        }
    }

    public void traverse2DArray(){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < row; col++) {
                System.out.println(array[row][col]);
            }
            System.out.println();
        }
    }

    public void searchingValue(int value){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == value){
                    System.out.println("Value Found at Row : " + row + " Column " + col);
                }
            }
        }
        System.out.println("Value is NOT FOUND");
    }

    public void deleteValuefromArray(int row, int col){
        try {
            System.out.println("Value has been Successfully Deleted");
            array[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid Index");
        }
    }

}
