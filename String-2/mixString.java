public String mixString(String a, String b) {
  String result = "";
  if (a.length() < b.length()) {
    for (int i = 0; i < a.length(); i++) {
      result += a.charAt(i);
      result += b.charAt(i);
    }
    
    result += b.substring(a.length());
  }else {
    for (int i = 0; i < b.length(); i++) {
      result += a.charAt(i);
      result += b.charAt(i);
    }
    
    result += a.substring(b.length());
  }
  
  return result;
}
