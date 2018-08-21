public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if (a.length() < b.length()) {
    if (b.substring(b.length() - a.length()).equals(a))
      return true;
  }else if (b.length() < a.length()) {
    if (a.substring(a.length() - b.length()).equals(b))
      return true;
  }else if (a.length() == b.length()){
    if (a.substring(a.length() - b.length()).equals(b) || b.substring(a.length() - b.length()).equals(a))
      return true;
  }
  return false;
}
