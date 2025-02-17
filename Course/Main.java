package Course;

public class Main{
    public static void main(String[] args) {
        Course[] course = {
                new ITCourse(),
                new IoTCourse(),
                new FACourse()
        };

        for (Course i : course){
            System.out.println(i);
        }
        System.out.println();

        for (Course i : course){
            i.showCourse();
            System.out.println();
        }
    }
}
