package ex_06_Ternary_Operator;

public class Lab065__Interview_TO_Three_Max {
    public static void main(String[] args) {
        // Finding the largest Number, n1, n2, n3 => max(n1, n2, n3)

        // Step 1 : Find inputs / outputs
        // n1, n2, n3 -> data type -> int
        // o/p -> int
        // 23, 34, 10 -> 34

        // step2 : rough logic
//        (n1>=n2) -> Y1 : N1
//        Y1 -> n1 >= n3 -> Y(n1) : N (n3)
//        N1 -> n2 > n3 : Y (n2) : N (n3)

        int n1 = 2, n2 = 9, n3 = -11;

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1:n3): ((n2 >= n3) ? n2:n3);
        System.out.println("Largest Number: " + largest);
    }
}
