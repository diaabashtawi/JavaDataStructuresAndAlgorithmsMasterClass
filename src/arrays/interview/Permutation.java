package arrays.interview;

public class Permutation {

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        int [] arr1 = {10, 60, 60, 30, 40, 50};
        int [] arr2 = {10, 60, 60, 30, 400, 50};
        boolean result = permutation.permutation(arr1, arr2);
        System.out.println(result);
    }

    public boolean permutation(int [] array1, int [] array2){
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 0;
        int mul2 = 0;
        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        if (sum1 == sum2 && mul1 == mul2){
            return true;
        }
        return false;
    }
}
