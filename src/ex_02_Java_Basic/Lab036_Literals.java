package ex_02_Java_Basic;

public class Lab036_Literals {
    public static void main(String[] args) {
       // Char

       char c1 = 'A';
       char c2 = 'B';
       char c3 = '@';

       // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r'; // delete the previous word

        System.out.println("Editi"+ new_line+"Ranjan");
        System.out.println("Editi" + "Ranjan");
        System.out.println("Editi"+ tab_line + "Ranjan");
        System.out.println("Editi"+ back_space + "Ranjan");
        System.out.println("Editi"+ car_r + "Ranjan");

        char c11 = '\u1F60';
        // ASCII ->
        // chinese- india, japanese -> Unicode
        // u09878
    }
}
