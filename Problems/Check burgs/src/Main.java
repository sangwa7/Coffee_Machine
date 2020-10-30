import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String city =  scanner.nextLine();

        if(city.endsWith("burg")){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        // put your code here
    }
}