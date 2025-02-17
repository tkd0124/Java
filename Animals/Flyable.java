package Animals;

public interface Flyable {
    String FLY_MSG = "は飛びます";
    String LAND_MSG = "は着地します";

    void fly();
    void land();
}
