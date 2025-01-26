package ex_05_TypeCasting;

public class Lab059__TypeCasting_Used {
    public static void main(String[] args) {
        // GST - 18.45
       int course = 100;
       float GST = 18.45f;
       float total = course+GST;// widening- implicit
       //int total = course+(int)GST; // Narrow - Explicit
        float total2 = (float)course+GST;
        System.out.println(total);
    }
}
