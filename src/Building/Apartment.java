package Building;

import java.util.Scanner;

class Apartment extends Build {

    Apartment(String buildingName, int height, int width) {
        super(buildingName, height, width);
    }

    public String getName() {
        return getBuildingName();
    }
    //빌딩관리시스템의 기본은 매장설정에 맞추어져 있으므로 아파트는 오버라이드 한다.
    @Override
    public void setBuilding() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s 관리 시스템입니다. 몇층을 관리하시겠습니까? B1 | 1 | 2 | 3 \n", getName());
        int height = scanner.nextInt();
        //해당 층의 이용상황을 for문으로 print하여 시각적인 정보를 줬으면 좋겠음 << Build 메소드로 만들기
        System.out.println("몇 호실 관리 하시겠습니까?");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("입주민 이름을 알려주세요");
        String shopName = scanner.nextLine();
        //!!!!!!!!!!!!!!!!!!!!!!!!!매점이 이미 있을경우 체크하는 함수 만들기!!!!!!!!!!!//
        System.out.printf("%d층 %d호점에 %s 매장을 입점합니다\n", height, width, shopName);
        getBuilding()[height][width - 1] = new Build(shopName, height, width);
        scanner.close();
    }

    @Override
    public String toString() {
        return "상가건물 [" +
                "이름 = '" + getName() + '\'' +
                ']';
    }

}

