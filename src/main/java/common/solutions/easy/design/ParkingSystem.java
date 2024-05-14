package common.solutions.easy.design;

public class ParkingSystem {
    // Task 1603. Design Parking System https://leetcode.com/problems/design-parking-system/description/
    private int bigCount;
    private int mediumCount;
    private int smallCount;

    public ParkingSystem(int bigCount, int smallCount, int mediumCount) {
        this.bigCount = bigCount;
        this.smallCount = smallCount;
        this.mediumCount = mediumCount;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigCount - 1 >= 0) {
                    bigCount--;
                    return true;
                }
                break;
            case 2:
                if (mediumCount - 1 >= 0) {
                    mediumCount--;
                    return true;
                }
                break;
            case 3:
                if (smallCount - 1 >= 0) {
                    smallCount--;
                    return true;
                }
                break;
        }
        return false;

    }
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */