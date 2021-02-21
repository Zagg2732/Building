package Building;

import java.util.Arrays;
import java.util.Scanner;

class Build { //다형성 구조를 위한 Build
    //빌딩이름
    private String buildingName;
    //빌딩구조 2차원배열
    private Build[][] building;

    Build(String buildingName, int height, int width){
        this.buildingName = buildingName;
        this.building = new Build[height][width];
    }

    public Build[][] getBuilding() {
        return building;
    }

    //빌딩이름 get
    public String getBuildingName() {
        return buildingName;
    }

    //빌딩 입주 시스템
    public void setBuilding() { //디폴트는 매장 입점시스템. 클래스가 가져다 쓸때 자연스러우려면 Override 밖에 없는듯?
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s 관리 시스템입니다. 몇층을 관리하시겠습니까? B1 | 1 | 2 | 3 \n", this.buildingName);
        int height = scanner.nextInt();
        //해당 층의 이용상황을 for문으로 print하여 시각적인 정보를 줬으면 좋겠음
        System.out.println("몇 호실 쓰십니까?");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("매장 이름을 알려주세요");
        String shopName = scanner.nextLine();
        //!!!!!!!!!!!!!!!!!!!!!!!!!매점이 이미 있을경우 체크하는 함수 만들기!!!!!!!!!!!//
        System.out.printf("%d층 %d호점에 %s 매장을 입점합니다\n", height, width, shopName);
        this.building[height][width - 1] = new Build(shopName, height, width);
        scanner.close();
    }

    //[Idea] 빌딩 0번째 인덱스([0][0], [1][0], [2][0])를 엘레베이터로 지정하면 입출력값을 더 깔끔하게 구현가능

    //건물위치 받기
    public Shop getShop(int height, int width) {
        //return shops[height][width-1];
        return null;
    }
    //건물들 받기. 나중에 for문으로 더 빌딩같이 print 해줄수 있음
    public Shop[][] getShops() {
        //return shops;
        return null;
    }

    @Override
    public String toString() {
        return "Building.Building{" +
                "buildingName='" + buildingName + '\'' +
                ", shops=" + Arrays.toString(building) +
                '}';
    }
}
