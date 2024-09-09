package MinimumPlatform;

import java.io.*;
import java.util.*;

class Platform {
  public int findPlatform(int Arr[], int Dep[]) {
    int need = 0, ans = 0;

    Arrays.sort(Arr);
    Arrays.sort(Dep);

    int i = 0, j = 0;
    while (i < Arr.length && j < Arr.length) {
      if (Arr[i] <= Dep[j]) {
        need++;
        i++;
      } else if (Arr[i] > Dep[j]) {
        need--;
        j++;
      }

      if (need > ans) {
        ans = need;
      }
    }

    return ans;
  }
}

class App {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String str[] = read.readLine().trim().split(" ");
      int n = Integer.parseInt(str[0]);

      int arr[] = new int[n];
      int dep[] = new int[n];

      str = read.readLine().trim().split(" ");
      for (int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(str[i]);
      str = read.readLine().trim().split(" ");
      for (int i = 0; i < n; i++)
        dep[i] = Integer.parseInt(str[i]);

      System.out.println(new Platform().findPlatform(arr, dep));
    }
  }
}