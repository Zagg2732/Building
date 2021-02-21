package Building;
/*
2021년 2월 21일 일요일
비트캠프 같은 조원인 이가희님이 생각한 백화점 만들기 시나리오!
https://github.com/Tomas1876/afternoon <<가희님 시나리오
오늘 아침에 갑자기 2차원 배열로 빌딩을 만들면 좋겠다 싶어서 한번 연습해봄
 */

//코드 실행하는 Main 함수입니다.

public class Main {
    public static void main(String[] args) {
        Shop ssg001 = new Shop("신세계 백화점", 3, 4);
        System.out.println(ssg001.getBuildingName()); //신세계 백화점

        ssg001.setBuilding();

    }
}
