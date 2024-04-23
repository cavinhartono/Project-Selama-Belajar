package MinimizeCashFlow;

class CashFlow {
  final int personLength = 3;

  public int getMin(int num[]) {
    int mid = 0;
    for(int i = 1; i < personLength; i++) {
      if (num[i] < num[mid]) {
        mid = i;
      }
    }

    return mid;
  }

  public int getMax(int num[]) {
    int max = 0;
    for(int i = 1; i < personLength; i++) {
      if(num[i] > num[max]) {
        max = i;
      }
    }

    return max;
  }

  public int minOfTwoValue(int x, int y) {
    return x < y 
            ? x 
            : y;
  }

  public void minCashFlow(int amount[]) {
    int maxCredit = getMax(amount), maxDebit = getMin(amount);

    int min = minOfTwoValue(amount[maxCredit], amount[maxDebit]);

    amount[maxCredit] -= min;
    amount[maxDebit] += min;
    
  }
}

public class App {
  public static void main(String args[]) {

  }
}
