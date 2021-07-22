package vn.plusplus.Exception;

public class Finally_Throw {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");
        int ret;
        try{
            ret = phepChia(23, 9);
            System.out.println("Result = " + ret);
        }catch (ArithmeticException e){
            System.out.println("Có lỗi, dừng chương trình!");
        }
        System.out.println("After call phepChia func.");
    }
    private static int phepChia(int a, int b) {
        System.out.println("phepChia func is being run!");
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            System.out.println("Finally block!");
        }
    }
}
