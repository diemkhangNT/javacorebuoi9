package vn.plusplus.Activity91;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagement {
    private int totalUser;//(Tổng số user cần quản lý)
    private User[] users; //(Mảng danh sách các user)
//    public UserManagement(int totalUser, User[] users) {
//        this.totalUser = totalUser;
//        this.users = users;
//    }

    public UserManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng số user cần quản lí: ");
        totalUser = scanner.nextInt();
        scanner.nextLine();
        users = new User[totalUser];
        for(int i=0;i<users.length;i++){
            System.out.println("User "+(i+1));
            int id = 0;
            while(true){
                try {
                    System.out.print("\tID người dùng: ");
                    id = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (Exception e){
                    System.out.println("Invalid! Please enter again");
                }
            }
            String usname;
            do{
                byte flag = 0;
                while (true){
                    System.out.print("\tTên đăng nhập: ");
                    usname = scanner.nextLine();
                    if(!usname.trim().equals("")){
                        break;
                    }else System.out.println("Username must not empty!");
                }
                for(int j=i-1;j>=0;j--){
                    if(usname.equals(users[j].getUsername())){
                        System.out.println("Tên đăng nhập đã tồn tại, vui lòng nhập lại. ");
                        flag=1;
                        break ;
                    }
                }
                if(flag == 1) {
                    continue;
                }else break;
            }while (true);
            String password;
            while (true){
                System.out.print("\tPassword: ");
                password = scanner.nextLine();
                if(!password.trim().equals("")){
                    break;
                }else System.out.println("Password must not empty!");
            }
            String displayName;
            while (true){
                System.out.print("\tTên hiển thị: ");
                displayName = scanner.nextLine();
                if(!displayName.trim().equals("")){
                    break;
                }else System.out.println("DisplayName must not empty!");
            }
            String email;
            String EMAIL_PATTERN =
                    "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            while (true){
                System.out.print("\tĐịa chỉ email: ");
                email = scanner.nextLine();
                boolean flag = Pattern.matches(EMAIL_PATTERN,email);
                if(!email.trim().equals("")&&flag){
                    break;
                }else if(email.trim().equals("")){
                    System.out.println("Email must not empty!");
                }else if(!flag){
                    System.out.println("Email is invalid! Please enter again!");
                }
            }

            users[i] = new User(id,usname,password,displayName,email);
        }
        for(User us : users){
            System.out.println(us.toString());
        }
    }
    public String findUserByUsername(String username){
        int j=0;
        for(int i=0;i<users.length;i++){
            if(username.equals(users[i].getUsername())){
                System.out.println(users[i].toString());
            }else j++;
        }
        if(j==users.length) System.out.println("null\n");
        return username;
    }
    public void login(String username){
        Scanner scanner = new Scanner(System.in);
        int j=0;
        for(int i=0;i<users.length;i++){
            if(username.equals(users[i].getUsername())){
                System.out.print("\tPassword: ");
                String password = scanner.nextLine();
                if(password.equals(users[i].getPassword())){
                    System.out.println("Đăng nhập thành công!");
                    System.out.println(users[i].toString());
                }else System.out.println("Mật khẩu không hợp lệ!");;
            }else j++;
        }
        if(j==users.length) System.out.println("Người dùng không tồn tại!");
    }
}
