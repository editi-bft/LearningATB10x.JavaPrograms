package ex_03_Literals;

public class Lab033_Literals_Char {
    public static void main(String[] args) {

        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '1';
        char c6 = '9';
        char c7 = '(';
        char c8 = ' ';

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        // System.out.println("EditiRanjan");
        System.out.println("Editi" + new_line + "Ranjan");
        System.out.println("Editi" + tab_line + "Ranjan");
        System.out.println("Editi" + back_space + "Ranjan");
        System.out.println("Editi" + carriage_return + "Ranjan");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char rupees = '₹';
        System.out.println("Editi has " + rupees + 10);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11 = '\u1F60';




    }

}
