package JAVA0818;
// 배열 초기화
public class JAVA2 {
    public static void main(String[] args) {
        int[] num = {100,200,300,400,500};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum += num[i];

            if ( i <  num.length-1) {
                System.out.print(num[i] + " + ");
            }

            else{
                System.out.println(num[i] + " = " + sum);
                }
            }
        }
    }

