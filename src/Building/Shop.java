package Building;

import java.util.Scanner;

class Shop extends Build {

    public Shop(String buildingName, int height, int width) {
        super(buildingName, height, width);
    }

    public String getName() {
        return getBuildingName();
    }

    @Override
    public String toString() {
        return "상가건물 [" +
                "이름 = '" + getName() + '\'' +
                ']';
    }

}

