package arrays.interview;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    public boolean rotateMatrix(int [][] matirx ){
        if (matirx.length == 0 || matirx.length != matirx[0].length){
            return false;
        }
        int n = matirx.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matirx[first][i];
                matirx[first][i] = matirx[last - offset][first];
                matirx[last - offset][first] = matirx[last][last - offset];
                matirx[last][last - offset] = matirx[i][last];
                matirx[i][last] = top;
            }
        }
        return true;
    }
}
