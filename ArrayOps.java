//git add,commit,push
public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i=0; i < arr.length; i++) {
      int num = arr[i];
      sum = sum + num;
    }
    return sum;
  }

  public static int largest(int[]arr) {
    int temp = arr[0];
    for (int i=0; i<arr.length; i++) {
      if (arr[i]>temp) temp = arr[i];
    }
    return temp;
  }

  public static int[] sumRows(int[][] matrix) {
    int arr[] = new int[matrix.length];
    for (int i=0; i<arr.length; i++) {
      int tempsum = sum(matrix[i]);
      arr[i] = tempsum;
    }
    return arr;
  }

  public static int[] largestInRows(int[][] matrix) {
    int arr[] = new int[matrix.length];
    for (int i=0; i<arr.length; i++) {
      int tempsum = largest(matrix[i]);
      arr[i] = tempsum;
    }
    return arr;
  }

  public static int sum(int[][] arr) {
    int newarr[] = new int[arr.length];
    for (int i=0; i<arr.length; i++) {
      newarr[i] = sumRows(arr)[i];
    }
    return(sum(newarr));
  }

  public static int[] sumCols(int[][] matrix) {
    int arr[] = new int[matrix[0].length];
    for (int i=0; i<matrix.length; i++) {
      int columnsum = 0;
      for (int j=0; j<matrix[i].length;j++) {
      arr[j] += matrix[i][j];
      }
    }
    return arr;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int arr[] = sumRows(matrix);
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] != arr[i+1]) return false;
    }
    return true;
  }
  public static boolean isColMagic(int[][] matrix) {
    int arr[] = sumCols(matrix);
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] != arr[i+1]) return false;
    }
    return true;
  }

}
