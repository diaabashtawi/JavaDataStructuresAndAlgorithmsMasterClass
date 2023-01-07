package arrays;

public class SingleDimensionArray {

    int [] array = null;

    public SingleDimensionArray(int arraySize) {
        this.array = new int[arraySize];
        for (int i =0; i < array.length; i++){
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValue(int index, int value){
        try {
            if (array[index] == Integer.MIN_VALUE){
                array[index] = value;
                System.out.println("Date Inserted Successfully at index " + index);
            }else {
                System.out.println("Date can't be Inserted index already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
    }

    public void traverseArray(){
        try {
            for (int i =0; i<array.length; i++){
                System.out.println(array[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array is No Longer Exist");
        }
    }

    public void searchForElement(int value){
        for (int i=0;i<array.length;i++){
            if (array[i] == value){
                System.out.println("Element Found at index : " + i + " " +array[i]);
            }
        }
        System.out.println("Element NOT FOUND");
    }

    public void deleteElement(int value){
        try {
            for (int i =0; i<array.length;i++){
                if (array[i] == value){
                    array[i] = Integer.MIN_VALUE;
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