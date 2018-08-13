public int countHi(String str) {
  int count = 0;
  if (str.length() < 2) {
    return count;
  }
  
  if (str.substring(0, 2).equals("hi")){
    count++;
  }
  
  return count + countHi(str.substring(1));
}
