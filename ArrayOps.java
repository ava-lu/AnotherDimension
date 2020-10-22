public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i=0; i < arr.length; i++) {
      int num = arr[i];
      sum = sum + num;
    }
    return sum;
  }

}
