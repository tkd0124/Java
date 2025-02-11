package src;

public class K5_6 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("田中", 170.5, 60.5);
        students[1] = new Student("山田", 168.2, 58.3);
        students[2] = new Student("鈴木", 172.8, 65.0);

        for (Student i : students){
            i.printInfo();
        }
        Student.printAverage(students);
    }
}
