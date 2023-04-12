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
        try{
            if (singleDimensionArray[index] == Integer.MIN_VALUE){
                singleDimensionArray[index] = value;
                System.out.println("Element Inserted Successfully at index " + index);
            }else {
                System.out.println("Element can't be inserted at this index already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!!");
        }
    }

    public void traverseArray(){
        try{
            for (int i = 0; i < singleDimensionArray.length; i++) {
                System.out.println(singleDimensionArray[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array is NO LONGER EXIST!!!");
        }
    }

    public void serachForElement(int value){
        for (int i = 0; i < singleDimensionArray.length; i++) {
            if (singleDimensionArray[i] == value){
                System.out.println("Element found at index " + i + " " + singleDimensionArray[i]);
            }
        }
        System.out.println("Sorry Element NOT FOUND");
    }

    public void deleteElemet(int value){
        try{
            for (int i = 0; i < singleDimensionArray.length; i++) {
                if (singleDimensionArray[i] == value){
                    singleDimensionArray[i] = Integer.MIN_VALUE;
                    System.out.println("Element Successfully Deleted");
                    return;
                }else {
                    System.out.println("Element Dose NOT EXIST");
                    return;
                }
            }
        }catch (Exception e){
            System.out.println("Invalid Value " + e.getMessage());
        }

    }

}