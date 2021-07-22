package vn.plusplus.Activity91;

public class UserManagement {
/*    2. Lớp UserManagement gồm có:
            2.1 Các thuộc tính:
            - int totalUser; (Tổng số user cần quản lý)
            - User[] users; (Mảng danh sách các user)
            2.2 Các phương thức:
            - Khởi tạo ko đối số (Khi khởi tạo bắt người dùng nhập vào thông tin chi tiết user.
            Khi nhập thông tin cho từng user lưu ý nếu người dùng nhập vào thông tin username đã tồn tại thì bắt người dùng nhập lại)
            - Viết phương thức findUserByUsername với đối số truyền vào là username,
             kết quả trả về User nếu tìm thấy, nếu ko trả về null.
            - Viết hàm login với đối số truyền vào là username, password, tìm kiếm và so sánh username/password
            nếu tìm thấy trả về User, nếu ko ném ra 1 exception (ngoại lệ)
            Lưu ý cần xử lý toàn bộ ngoại lệ có thể sinh ra khi người dùng nhập sai định dạng.
            Có thể tham khảo thêm về regex khi nhập thông tin để thông tin đúng định dạng hơn.*/
    private int totalUser;//(Tổng số user cần quản lý)
    private User[] users; //(Mảng danh sách các user)

    //public UserManagement() { }

    public UserManagement(int totalUser, User[] users) {
        this.totalUser = totalUser;
        this.users = users;
    }
    public UserManagement(){
        System.out.println("Nhập vào thông tin chi tiết User: ");
    }
}
