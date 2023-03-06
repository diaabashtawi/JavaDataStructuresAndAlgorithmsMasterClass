package arrays.interview;

import java.util.Arrays;

public class Paris {

    public static void main(String[] args) {
        Paris p = new Paris();
        int [] paris = {2,3,6,10,4,6,9,20};
       int [] result =  p.twoSum(paris, 9);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int [] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j< nums.length; j++)
            if (nums[i] + nums[j] == target){
                return new int [] {i, j};
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}
