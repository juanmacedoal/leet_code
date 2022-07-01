package easy_level;

public class FinalValueOfVariableAfterPerformingOperations {

  public int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for(int i = 0; i < operations.length; i++) {
      if(operations[i].contains("++")) x++;
      else if(operations[i].contains("--")) x--;

      System.out.println(x);
    }
    return x;
  }
}
