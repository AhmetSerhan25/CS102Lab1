import java.util.Random;

public class ArrayOperations {
  // (a) Generating random array
  public static int[] generateRandomArray(int size) {
    Random random = new Random();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = random.nextInt(101);
    }
    return arr;
  }

  // (c) Finding the array's minimum
  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int num : arr) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

  // (c) Finding the array's maximum
  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  // Finding average and returns differences of each number
  public static int[] differencesFromAverage(int[] sequence) {
    int sum = 0;
    for (int i = 0; i < sequence.length; i++) {
      sum += sequence[i];
    }

    int average = sum / sequence.length;

    int[] diffs = new int[sequence.length];

    for (int i = 0; i < sequence.length; i++) {
      diffs[i] = sequence[i] - average;
    }

    return diffs;
  }

  // Finding the sum of elements with odd numbered indexes
  public static void sumOddIndexes(int[] arr) {
    int oddSum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        oddSum += arr[i];
      }
    }

    System.out.println("Sum of numbers with odd indexes: " + oddSum);
  }

  public static void sumEvenIndexes(int[] arr) {
    int evenSum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        evenSum += arr[i];
      }
    }

    System.out.println("Sum of numbers with even indexes: " + evenSum);
  }
}

