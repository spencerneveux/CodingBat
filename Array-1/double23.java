public boolean double23(int[] nums) {
  int twoCount = 0; 
  int threeCount = 0;
  for (Integer value : nums) {
    if (value == 2) {
      twoCount++;
    }
    
    if (value == 3) {
      threeCount++;
    }
  }
  
  if (twoCount == 2 || threeCount == 2) {
    return true;
  }
  return false;
}
