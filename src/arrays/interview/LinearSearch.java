package arrays.interview;

import java.util.Random;

public class LinearSearch {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int [] array = {1,2,3,4,5,6,7,8,9};
        linearSearch.linearSearch(array,5);
    }

    public void linearSearch(int [] array,int value){
        for (int i = 0; i <array.length; i++) {
            if (array[i] == value){
                System.out.println("Value Found at the index " + i );
                return;
            }
        }
        System.out.println("Value NOT FOUND!!");
    }
}
