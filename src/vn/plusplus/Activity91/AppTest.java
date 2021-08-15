package vn.plusplus.Activity91;

import java.util.Scanner;

public class AppTest{
   public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       UserManagement userManagement = new UserManagement();
       System.out.println("Nhập vào username bạn muốn tìm: ");
       String username = scanner.nextLine();
       userManagement.findUserByUsername(username);
       System.out.println("\nLogin: ");
       System.out.print("\tUsername: ");
       username = scanner.nextLine();
       userManagement.login(username);
   }


}
