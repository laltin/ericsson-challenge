import java.util.Scanner;

public class EC3{
  public static Scanner sc;
  public static void main(String[] args) {
    sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    //int[] times = new int[n];
    int[] enter = new int[n];
    int[] exit = new int[n];
    /*for(int i = 0; i<n; i++){
      times[i] = sc.nextInt();
    }*/
    int z = 0;
    int max = 0;

    int c1 = 0;
    int c2 = 0;

    //prev[0] = times[0];
    for (int i = 0; i<n; i++) {
      enter[i] = sc.nextInt();
      exit[i] = enter[i]+1000;
    }

    while (c1 < n) {
      if (enter[c1] < exit[c2]) {
        z +=1;
        c1 ++;
        if (z > max) {
          max = z;
        }
      }
      else {
        z-=1;
        c2 ++;
      }
    }

    int rest = max % k;
    int number = max/k;
    if(rest != 0){
      number++;
    }
    System.out.println(number);
  }
}
