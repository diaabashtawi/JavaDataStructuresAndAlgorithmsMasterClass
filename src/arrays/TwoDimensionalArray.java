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

    public void accessArrayCell(int row, int column){
        System.out.println("Accessing Row number :" + row + " Column number : " + column);
        try {
            System.out.println("Cell value in (Row number " + row + " and Column number " + column +") is : " + array[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index " + e.getMessage());
        }
    }

    public void traverseTwoDimensionalArray(){
        for (int row = 0; row < array.length; row++){
            for (int col =0; col<array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void sreachElement(int value){
        for (int row =0; row<array.length; row++){
            for (int col = 0; col<array[row].length; col++){
                if (array[row][col] == value){
                    System.out.println("Element Found at Row : " + row + " Column " + col);
                }
            }
        }
        System.out.println("Element NOT FOUND!!");
    }

    public void deleteElement(int row, int col){
        try {
            array[col][col] = Integer.MIN_VALUE;
            System.out.println("Element : " + array[row][col] + "Successfully Deleted ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index " + e.getMessage());
        }
    }





}
