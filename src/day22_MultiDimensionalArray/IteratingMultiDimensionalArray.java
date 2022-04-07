package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

    // index of elements: 0 1 2   0 1 2 3   0 1  2  3  4
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
    // index of arrays:     0        1            2

        for ( int i = 0 ; i < arr2D.length ; i++){ // i: index numbers of single dimensional arrays

            for (int j = 0; j < arr2D[i].length; j++) { // j: index numbers of elements

                System.out.print(arr2D[i][j]+",");

            }

            System.out.println();

        }


    }
}
