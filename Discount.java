import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        String discount = "testing";
        float subtotal = 10.0f;
        float Discount = 5.0f;
        float shipping = 4.99f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap discount code: ");
        String code = sc.nextLine();
        String codeUpper = code.toUpperCase();

        if (code.equalsIgnoreCase(discount) && codeUpper.equals("TESTING")) {
            System.out.println("Pass");
        } else {
            System.out.println("False");
        }
        System.out.println("Tong tien hang la: " + (subtotal - Discount + shipping));
        if ((subtotal - Discount) + shipping == 9.99f) {
            System.out.println("Pass");
        } else {
            System.out.println("False");
        }


    }


}
