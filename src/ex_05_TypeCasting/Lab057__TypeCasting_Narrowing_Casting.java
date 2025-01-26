package ex_05_TypeCasting;

public class Lab057__TypeCasting_Narrowing_Casting {
    public static void main(String[] args) {
        int val = 200;
       // byte b = val; // //  Invalid- Implicit Casting narrowing is not allowed
        byte b = (byte)val; // Valid -> Explicit Casting - allowed
         // Data loss:
    }
}
