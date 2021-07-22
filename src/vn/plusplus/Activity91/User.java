package vn.plusplus.Activity91;

public class User {
   /* 1. Viết lớp User (Người dùng) gồm có:
            1.1 Các thuộc tính:
            - int id; (ID người dùng)
            - String username; (Tên đăng nhập)
            - String password; (Mật khẩu)
            - String displayName; (Tên hiển thị)
            - String email; (Địa chỉ email)
            1.2 Các phương thức:
            - Khởi tạo ko đối và có đối số.
            - Getters/setters*/
    private int id;
    private String username;
    private String password;
    private String displayName;
    private String email;
    public User(){}
    public User(int id, String username, String password, String displayName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
