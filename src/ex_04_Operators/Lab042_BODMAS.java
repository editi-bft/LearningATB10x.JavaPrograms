package ex_04_Operators;

import javax.management.MBeanAttributeInfo;

public class Lab042_BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) *3);
        // 9*3 -> 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4*3 -> 12
    }
}
