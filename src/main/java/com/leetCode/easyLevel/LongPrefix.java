package com.leetCode.easyLevel;

public class LongPrefix {

  public String longestCommonPrefix(String[] strs) {
    if(strs.length <= 1) return strs[0];
    String insidePrefix = "";
    for(int i = 0; i < strs.length; i++) {
        String prefixA = "";
        if(strs.length > i+1) {
          for(int z = 0; z < strs[i+1].length(); z++) {
            if(z < strs[i+1].length() && z < strs[i].length() && insidePrefix.isEmpty()) {
              if(strs[i+1].charAt(z) != strs[i].charAt(z)) break;
              prefixA = strs[i+1].charAt(z) == strs[i].charAt(z) ? prefixA + strs[i+1].charAt(z) : prefixA;
            } else if(z < insidePrefix.length()){
              prefixA = insidePrefix.charAt(z) == strs[i+1].charAt(z)  ? prefixA + strs[i+1].charAt(z) : prefixA;
            } else break;
          }
          insidePrefix = prefixA;
          if(insidePrefix.isEmpty() && prefixA.isEmpty() && i != i+1)  return insidePrefix;
        }
    }
    return insidePrefix;
  }
}
