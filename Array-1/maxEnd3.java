public int[] maxEnd3(int[] nums) {
  int max = nums[0];
  if (nums[nums.length - 1] > max) {
    max = nums[nums.length - 1];
  }
  
  for (int i = 0; i < nums.length; i++) {
    nums[i] = max;
  }
  return nums;
}
