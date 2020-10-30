import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[8];
        int i;
       for(i = 0; i<8; i++) {
           name[i] = scanner.next();
       }
         for(int j= 7; j >= 0; j--)
         {
             System.out.println(name[j]);
         }
    }
}
