package ex_04_Operators;

public class Lab039_Relational_Operators {
    public static void main(String[] args) {
        // < less than
        // <= ->less than or equal to
        // > Greater
        // >= Greater or equal
        // == -> Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output

        int a = 10;
        int b = 30;
        boolean c = a>b; // 10 > 30
        System.out.println(c);

        int age_mamitha = 34;
        int age_riya = 34;
        boolean result = age_riya >= age_mamitha;
        System.out.println(result);
        // age_riya > age_mamitha or age_riya = age_mamitha
    }
}
