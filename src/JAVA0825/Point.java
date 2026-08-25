package JAVA0825;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;

        System.out.println("김연아 선수 경기 끝났습니다~~ 짝짝짝");

        for (int i = 0; i < score.length; i++) {
            System.out.print("평가 점수 ==> ");
            score[i] = sc.nextInt();

            sum += score[i];
        }

        double avg = (double) sum / score.length;

        System.out.println("합계점수:" + sum);
        System.out.printf("심사위원 평균 점수 : %.2f", avg);

        sc.close();
    }
}