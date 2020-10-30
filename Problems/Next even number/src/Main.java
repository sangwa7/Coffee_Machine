import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
          if((x > 0) && (x<= 100000)){
                if (x % 2 == 0) {
                   System.out.print(x+2);
                }
                else{
                    System.out.print(x+1);
                }
        }
    }
}