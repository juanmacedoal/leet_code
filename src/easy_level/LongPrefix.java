package easy_level;

public class LongPrefix {

  public String longestCommonPrefix(String[] strs) {
    if(strs.length <= 1) return strs[0];
    String insidePrefix = "";
    for(int i = 0; i < strs.length; i++) {
      for(int j = 0; j < strs.length; j++) {
        String prefixA = "";
        for(int z = 0; z < strs[j].length(); z++) {
            if(z < strs[j].length() && z < strs[i].length() && insidePrefix.isEmpty() && i != j) {
              if(strs[j].charAt(z) != strs[i].charAt(z)) break;
              prefixA = strs[j].charAt(z) == strs[i].charAt(z) ? prefixA + strs[j].charAt(z) : prefixA;
            } else if(z < insidePrefix.length()){
              prefixA = insidePrefix.charAt(z) == strs[j].charAt(z)  ? prefixA + strs[j].charAt(z) : prefixA;
            } else break;
        }
        insidePrefix = prefixA;
        if(insidePrefix.isEmpty() && prefixA.isEmpty() && i != j)  return insidePrefix;
      }
       return insidePrefix;
    }
    return insidePrefix;
  }
}
