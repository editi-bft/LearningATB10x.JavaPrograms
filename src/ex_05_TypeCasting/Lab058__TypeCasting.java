package ex_05_TypeCasting;

public class Lab058__TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
       // short s = phone_no; // implicit
        short s = (short) phone_no; // Explicit
    }
}
