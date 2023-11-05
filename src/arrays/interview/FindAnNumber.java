package arrays.interview;

public class FindAnNumber {

    public static void main(String[] args) {

    }

    public void linearSearch(int [] intArray, int value){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value){
                System.out.println("Value is found at the index of : " + i);
                return;
            }
        }
    }
}
