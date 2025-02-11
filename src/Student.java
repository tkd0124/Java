package src;

public class Student{
    String name;
    double height;
    double weight;

    static int max = 0;

    public Student(){
        this.name = "no name";
        this.height = 0;
        this.weight = 0;
    }

    public Student(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        max++;
    }

    public void printInfo(){
        System.out.println(this.name + "さんの情報");
        System.out.println("¥t身長：" + this.height + "cm");
        System.out.println("¥t体重：" + this.weight + "kg");
        System.out.println();
    }

    public static void printAverage(Student[] array){
        double totalHeight = 0;
        double totalWeight = 0;

        for (Student i : array){
            totalHeight += i.height;
            totalWeight += i.weight;
        }

        double avgHeight = totalHeight / array.length;
        double avgWeight = totalWeight / array.length;

        System.out.println("3人の平均は");
        System.out.printf(" 平均身長：%.2fcm%n", avgHeight);
        System.out.printf(" 平均体重：%.2fkg%n", avgWeight);
        System.out.println();
    }

}
