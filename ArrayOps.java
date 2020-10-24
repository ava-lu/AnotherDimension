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

}
