import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[][]A = { {1,0,12,-1}, {7,-2,2,1}, {-5,-2,2,-9}};
    int[]B = {1,3,5};
    int[][]C = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}};
    int[][]D = { {1,1,1}, {2,2,2}, {3,3,3}};
    int[][]E = { {2,2,2}, {2,2,2}};

// sum of 1D array
    System.out.println(ArrayOps.sum(B));
// largest element of array
    System.out.println(ArrayOps.largest(B));
// sum of each row in 2D array
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
// largest element in each row
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
// sum of 2D array
    System.out.println(ArrayOps.sum(A));
// sum of each column
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
// does each row have same sum
    System.out.println(ArrayOps.isRowMagic(E));
// does each column have same sum
    System.out.println(ArrayOps.isColMagic(E));
  }

}
