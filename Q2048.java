import java.util.Scanner;

public class Q2048 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int state[][] = new int[4][4];
    for (int i=0; i < 4; i++) {
      for (int j=0; j < 4; j++) {
        state[i][j] = sc.nextInt();
      }
    }

    int move = sc.nextInt();
    // 0 - left
    // 1 - up
    // 2 - right
    // 3 - down

    int cursor = 0;
    int merged = 0;
    int nextrow[] = new int[4];

    if (move == 0) {
      for (int i=0; i < 4; i++) {

        // clear row
        cursor = 0;
        merged = -1;
        for (int j=0; j < 4; j++) {
          nextrow[j] = 0;
        }

        for (int j=0; j < 4; j++) {
          if (state[i][j] == 0) continue;

          if (cursor == 0) {
            nextrow[cursor] = state[i][j];
            cursor++;
          }
          else if (merged < cursor - 1 && nextrow[cursor-1] == state[i][j]) {
            nextrow[cursor-1] += state[i][j];
            merged = cursor - 1;
          }
          else {
            nextrow[cursor] = state[i][j];
            cursor++;
          }
        }

        for (int j=0; j < 4; j++) {
          state[i][j] = nextrow[j];
        }
      }
    }
    else if (move == 2) {
      for (int i=0; i < 4; i++) {

        // clear row
        cursor = 0;
        merged = -1;
        for (int j=0; j < 4; j++) {
          nextrow[j] = 0;
        }

        for (int j=0; j < 4; j++) {
          if (state[i][3-j] == 0) continue;

          if (cursor == 0) {
            nextrow[cursor] = state[i][3-j];
            cursor++;
          }
          else if (merged < cursor - 1 && nextrow[cursor-1] == state[i][3-j]) {
            nextrow[cursor-1] += state[i][3-j];
            merged = cursor - 1;
          }
          else {
            nextrow[cursor] = state[i][3-j];
            cursor++;
          }
        }

        for (int j=0; j < 4; j++) {
          state[i][3-j] = nextrow[j];
        }
      }
    }
    else if (move == 1) {
      for (int i=0; i < 4; i++) {

        // clear row
        cursor = 0;
        merged = -1;
        for (int j=0; j < 4; j++) {
          nextrow[j] = 0;
        }

        for (int j=0; j < 4; j++) {
          if (state[j][i] == 0) continue;

          if (cursor == 0) {
            nextrow[cursor] = state[j][i];
            cursor++;
          }
          else if (merged < cursor - 1 && nextrow[cursor-1] == state[j][i]) {
            nextrow[cursor-1] += state[j][i];
            merged = cursor - 1;
          }
          else {
            nextrow[cursor] = state[j][i];
            cursor++;
          }
        }

        for (int j=0; j < 4; j++) {
          state[j][i] = nextrow[j];
        }
      }
    }
    if (move == 3) {
      for (int i=0; i < 4; i++) {

        // clear row
        cursor = 0;
        merged = -1;
        for (int j=0; j < 4; j++) {
          nextrow[j] = 0;
        }

        for (int j=0; j < 4; j++) {
          if (state[3-j][i] == 0) continue;

          if (cursor == 0) {
            nextrow[cursor] = state[3-j][i];
            cursor++;
          }
          else if (merged < cursor - 1 && nextrow[cursor-1] == state[3-j][i]) {
            nextrow[cursor-1] += state[3-j][i];
            merged = cursor - 1;
          }
          else {
            nextrow[cursor] = state[3-j][i];
            cursor++;
          }
        }

        for (int j=0; j < 4; j++) {
          state[3-j][i] = nextrow[j];
        }
      }
    }


    for (int i=0; i < 4; i++) {
      for (int j=0; j < 4; j++) {
        if (j < 3) System.out.print( state[i][j] + " " );
        else System.out.println(state[i][j]);
      }
    }

  }
}
