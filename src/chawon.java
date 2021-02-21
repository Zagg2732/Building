/*
2021년 2월 21일 일요일
비트캠프 같은 조원인 이가희님이 생각한 백화점 만들기 시나리오!
https://github.com/Tomas1876/afternoon <<가희님 시나리오
오늘 아침에 갑자기 2차원 배열로 빌딩을 만들면 좋겠다 싶어서 한번 연습해봄
 */

import java.util.Arrays;
import java.util.Scanner;

class Building { //다형성 구조를 위한 Building
    //빌딩이름
    private String buildingName;
    //빌딩구조 2차원배열
    private Shop[][] shops;

    Building(String buildingName, int height, int width){
        this.buildingName = buildingName;
        this.shops = new Shop[height][width];
    }
    //빌딩이름 get
    public String getBuildingName() {
        return buildingName;
    }

    //입점 시스템 만들어보기
    public void setShop() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("매점 입점 시스템입니다. 몇층에 입점하십니까? B1 | 1 | 2 | 3 ");
        int height = scanner.nextInt();
        System.out.println("몇 호실 쓰십니까?");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("매장 이름을 알려주세요");
        String shopName = scanner.nextLine();
        //!!!!!!!!!!!!!!!!!!!!!!!!!매점이 이미 있을경우 체크하는 함수 만들기!!!!!!!!!!!//
        System.out.printf("%d층 %d호점에 %s 매장을 입점합니다\n", height, width, shopName);
        shops[height][width - 1] = new Shop(shopName);
        scanner.close();
    }
    //[Idea] 빌딩 0번째 인덱스([0][0], [1][0], [2][0])를 엘레베이터로 지정하면 입출력값을 더 깔끔하게 구현가능

    //건물위치 받기
    public Shop getShop(int height, int width) {
        return shops[height][width-1];
    }
    //건물들 받기. 나중에 for문으로 더 빌딩같이 print 해줄수 있음
    public Shop[][] getShops() {
        return shops;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingName='" + buildingName + '\'' +
                ", shops=" + Arrays.toString(shops) +
                '}';
    }
}

class Shop {
    private String name;

    Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "상가건물 [" +
                "이름 = '" + name + '\'' +
                ']';
    }

}

public class chawon {
    public static void main(String[] args) {
        Building building001 = new Building("신세계 백화점", 3, 4);
        building001.setShop();

    }
}