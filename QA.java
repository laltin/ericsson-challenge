import java.util.Scanner;

public class QA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
    int stones = sc.nextInt();
    int nMoves = sc.nextInt();

    int moves[] = new int[nMoves];
    for (int i=0; i < nMoves; i++) {
      moves[i] = sc.nextInt();
    }

    int winner[] = new int[stones];
    for (int i=0; i < stones; i++) {
      winner[i] = 0;
    }

    for (int i=0; i < nMoves; i++) {
      winner[moves[i]-1] = 1;
    }
    for (int i=0; i < stones; i++) {
      if (winner[i] == -1) {
        for (int j=0; j < nMoves; j++) {
          int n = i + moves[j];

          if (n < stones) {
            winner[n] = 1;
          }
        }
      }
      else {
        if (i < stones - 1 && winner[i+1] == 0) {
          winner[i+1] = -1;
        }
      }

      // for (int j=0; j < stones; j++) {
      //   System.out.print(winner[j] == -1 ? "-" : winner[j] == 0 ? " " : "+");
      // }
      // System.out.println("");
    }

    if (winner[stones-1] > 0) {
      System.out.println("Stan wins");
    }
    else {
      System.out.println("Ollie wins");
    }
}
  }
}
