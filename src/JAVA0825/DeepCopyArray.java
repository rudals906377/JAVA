package JAVA0825;

import java.util.Arrays;

public class DeepCopyArray {
    public static void main(String[] args) {
        String[] food = {"김치찌개", "된장찌개", "고추장찌개", "송사리찌개"};
        String[] newfood = food.clone();

       food [1] = "개구리찌개";
       newfood [2]= "옥수수찌개";

       System.out.println("원본배열: " + Arrays.toString(food));
        System.out.println("복제배열: " + Arrays.toString(newfood));

    }
}

//깊은복사-메모리에 할당된 동일한 배열객체