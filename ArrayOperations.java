import java.util.Random;

public class ArrayOperations {
  // (a) Generating random array
  public static int[] generateRandomArray(int size) {
    Random random = new Random();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = random.nextInt(101);
    }
    return arr;
  }

  // (c) Finding the array's minimum
  public static int findMin(int[] arr) {
    int min = arr[0];
    for(int num : arr) {
        if(num < min) {
            min = num;
        }
    }
    return min;
  }

  // (c) Finding the array's maximum
  public static int findMax(int[] arr) {
    int max = arr[0];
    for(int num : arr) {
        if(num > max) {
            max= num;
        }
    }
    return max;
  }
}
