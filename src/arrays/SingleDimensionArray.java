package arrays;

public class SingleDimensionArray {

    int [] singleDimensionArray = null;

    public SingleDimensionArray(int arraySize){
        this.singleDimensionArray = new int[arraySize];
        for (int i = 0; i < singleDimensionArray.length; i++) {
            singleDimensionArray[i] = Integer.MIN_VALUE;
        }
    }

    public void insertElement(int index, int value){
        try {
            if (singleDimensionArray[index] == Integer.MIN_VALUE){
                singleDimensionArray[index] = value;
                System.out.println("Value inserted Successfully");
            }else {
                System.out.println("This index is occupied");
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid index!!!!");
        }
    }

    public void traverseArray(){
        try {
            for (int i = 0; i < singleDimensionArray.length; i++) {
                System.out.println(singleDimensionArray[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array is no longer exist!!");
        }
    }

    public void serachForElement(int value){
        for (int i = 0; i < singleDimensionArray.length; i++) {
            if (singleDimensionArray[i] == value){
                System.out.println("Value found at index :" + i);
            }else {
                System.out.println(value + " is NOT FOUND");
            }
        }
    }

    public void deleteElemet(int index){
        try {
            singleDimensionArray[index] = Integer.MIN_VALUE;
            System.out.println("Element has been successfully deleted");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid Index value");
        }
    }


}