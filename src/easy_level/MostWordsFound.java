package easy_level;

public class MostWordsFound {
  public int mostWordsFound(String[] sentences) {
    int amount = 0;
    for(String sentence: sentences) {
      int sum = 0;
      for(int i = 0; i < sentence.length(); i++) {
        if(sentence.charAt(i) == ' ') sum++;
      }
      sum++;
      if(amount < sum) amount = sum;
    }
    return amount;
  }
}
