import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String new_str = str.replace('a', 'b');
        System.out.println(new_str);
    }
}