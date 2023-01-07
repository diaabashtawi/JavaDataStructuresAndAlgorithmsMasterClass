package arrays;

public class TwoDimensionalArray {

    int [][] array = null;

    public TwoDimensionalArray(int rows, int columns) {
        this.array = new int[rows][columns];
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertElement(int row, int column, int value){
        try {
            if (array[row][column] == Integer.MIN_VALUE){
                array[row][column] = value;
                System.out.println("Element Inserted Successfully");
            }else {
                System.out.println("Date NOT Inserted, index is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index " + e.getMessage());
        }
    }


}
