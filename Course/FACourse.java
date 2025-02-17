package Course;

public class FACourse extends Course{
    public static final String NAME = "FAシステム技術科";

    public FACourse(){
        super(NAME, new int[]{6, 12});
    }

    @Override
    public void showCourse(){
        System.out.println("こ O す名：" + super.getName());
        System.out.print("入所月：");
        for (int i : super.getStartMount()){
            System.out.print(i + "月");
        }
        System.out.println();
        System.out.println("FA技術者になるための基礎から応用まで学べるコースです");
    }
    @Override
    public String toString(){
        return "FA" + super.toString();
    }
}
