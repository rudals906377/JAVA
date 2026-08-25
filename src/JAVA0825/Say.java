package JAVA0825;

import java.util.Random;

public class Say {
    public static void main(String[] args) {
        String[] Say = {
                "포기하지 않는 사람에게 실패는 과정일 뿐이다.",
                "작은 시작이 결국 큰 변화를 만든다.",
                "오늘의 선택이 내일의 모습을 만든다.",
                "느려도 멈추지 않으면 앞으로 가고 있는 것이다.",
                "배우는 사람은 언제나 성장할 준비가 되어 있다.",
                "실패는 끝이 아니라 다음 방법을 찾는 시작이다.",
                "완벽한 준비보다 작은 실행이 더 강하다.",
                "꾸준함은 재능을 이기는 가장 확실한 힘이다.",
                "모르는 것을 인정하는 순간 배움이 시작된다.",
                "어제보다 하나 더 알게 되었다면 오늘은 성공한 하루다.",
        };

        Random random = new Random();
        int randomIndex = random.nextInt(Say.length);
        System.out.print("오늘의 명언:"+Say[randomIndex]);
    }}
