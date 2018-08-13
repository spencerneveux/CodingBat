public int count8(int n) {
  int count = 0;
  if (n == 0) {
    return 0;
  }
  
  if (n % 100 == 88) {
    count+=2;
  }else if (n % 10 == 8) {
    count++;
  }
  
  return count + count8(n/10);
}
