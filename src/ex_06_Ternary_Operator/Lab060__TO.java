package ex_06_Ternary_Operator;

public class Lab060__TO {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age = 10;
        String CanIVote = age >= 18 ? "YES, You can Vote" : "No, You can't Vote";
        System.out.println(CanIVote);
    }
}
