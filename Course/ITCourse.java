package Course;

public class ITCourse extends Course{
    public static final String NAME = "IT生産サポート科";

    public ITCourse(){
        super(NAME, new int[]{5, 11});
    }

    @Override
    public void showCourse(){
        System.out.println("こ O す名：" + super.getName());
        System.out.print("入所月：");
        for (int i : super.getStartMount()){
            System.out.print(i + "月");
        }
        System.out.println();
        System.out.println("IT技術者になるための基礎から応用まで学べるコースです");
    }
    @Override
    public String toString(){
        return "IT" + super.toString();
    }
}
