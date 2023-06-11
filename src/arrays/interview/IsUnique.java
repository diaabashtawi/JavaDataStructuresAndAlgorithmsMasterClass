package arrays.interview;

public class IsUnique {

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        int [] intArray = {10, 60, 60, 30, 40, 50};
        boolean result = isUnique.isUnique(intArray);
        System.out.println(result);
    }


    public boolean isUnique(int [] intArray){
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]){
                    return false;
                }
            }

        }
        return true;
    }
}
