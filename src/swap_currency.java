import java.util.Scanner;

public class swap_currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double swap = usd * vnd;
        System.out.print("Giá trị của " + usd + " USD = " + swap + " VND");
    }
}
