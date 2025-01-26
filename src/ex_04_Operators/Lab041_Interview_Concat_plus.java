package ex_04_Operators;

import java.sql.SQLOutput;

public class Lab041_Interview_Concat_plus {
    public static void main(String[] args) {
        String first_name = "Editi";
        String last_name = "Ranjan";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // EditiRanjan1010 - first operator - + performed as Concatination

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20EditiRanjan

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
