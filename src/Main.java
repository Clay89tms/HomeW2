import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write name <USER>: ");

        String us = null;
        if (scan.hasNextLine()){
            us = scan.nextLine();
        }

        System.out.println("Hello " + us + "!");
        scan.close();
    }
}