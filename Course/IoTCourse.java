package Course;

public class IoTCourse extends Course{
    public static final String NAME = "Iot機器開発科";

    public IoTCourse(){
        super(NAME, new int[]{3, 9});
    }

    @Override
    public void showCourse(){
        System.out.println("こ O す名：" + super.getName());
        System.out.print("入所月：");
        for (int i : super.getStartMount()){
            System.out.print(i + "月");
        }
        System.out.println();
        System.out.println("IoT技術者になるための基礎から応用まで学べるコースです");
    }
    @Override
    public String toString(){
        return "IoT" + super.toString();
    }
}
