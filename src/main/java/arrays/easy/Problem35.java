package arrays.easy;

public class Problem35 {

  public int searchInsert(int[] nums, int target) {
    int ind = 0;
    for (int num : nums) {
      if (num < target) {
        ind++;
      } else {
        break;
      }
    }
    return ind;

  }
}
