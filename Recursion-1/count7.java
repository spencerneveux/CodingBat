public int count7(int n) {
  int count = 0;
  if (n == 0) {
    return 0;
  }
  
  if (n % 10 == 7) {
    count++;
  }
  
  return count + count7(n/10);
}
