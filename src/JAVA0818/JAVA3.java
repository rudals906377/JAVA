package JAVA0818;

import java.util.Arrays;

//배열 길이변경 !!!
public class JAVA3 {
    public static void main(String[] args) {
        int num[] = {10,20,30};

        num = Arrays.copyOf(num, num.length+2);

        System.out.println("추가된 배열의 길이 : " + num.length);

//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
        for (int data : num) {
            System.out.print(data + " ");
        }

    }
}
