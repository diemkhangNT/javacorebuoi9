package vn.plusplus.Exception;

import java.util.Scanner;

public class Unchecked {
    public static void main(String[] args) {
        /*int arr[] = {12, 3, 40, 6};
        System.out.println(arr[5]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5*/
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui lòng nhập a: ");
            int a = scanner.nextInt();
            System.out.println("Vui lòng nhập b: ");
            int b = scanner.nextInt();
            try {
                int c = a / b;
                System.out.println("Ket qua = "+c+", dư "+a%b);
            } catch (ArithmeticException e) {
                e.printStackTrace(); // In ra lỗi nhưng vẫn tiếp tục chương trình
                System.out.println("Có lỗi xảy ra trong phép toán. Vui lòng nhập lại a,b!");// In ra nội dung lỗi để người dùng biết và sửa
            }
        }
    }
}
