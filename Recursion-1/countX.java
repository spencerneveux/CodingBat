public int countX(String str) {
  int count = 0;
  if (str.length() < 1) {
    return count;
  }
  
  if (str.charAt(0) == 'x') {
    count++;
  }
  
  return count + countX(str.substring(1));
  
}
