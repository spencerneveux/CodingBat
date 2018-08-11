public String makeTags(String tag, String word) {
  String frontTag = "<" + tag + ">";
  String backTag = "</" + tag + ">";
  return frontTag + word + backTag;
}
