public int countAbc(String str) {
  int count = 0;
  if (str.length() < 3) {
    return count;
  }
  
  if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
    count++;
    return count + countAbc(str.substring(2));
  }
  
  return count + countAbc(str.substring(1));
}
