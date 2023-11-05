package arrays.interview;

public class MaxProduct {



    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        int [] intArrray = {10, 60, 30, 40, 50};
        String pairs = maxProduct(intArrray);
        System.out.println(pairs);
    }

    public static String maxProduct(int [] intArray){
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct){
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + ", " + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }


}
