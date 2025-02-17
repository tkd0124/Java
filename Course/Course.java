package Course;

import java.util.Arrays;

public abstract class Course {
    private String name;
    private int[] startMount;

    public Course(String name, int[] startMount) {
        this.name = name;
        this.startMount = startMount;
    }

    public String getName() {
        return name;
    }

    public int[] getStartMount() {
        return startMount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartMount(int[] startMount) {
        this.startMount = startMount;
    }

    public abstract void showCourse();

    @Override
    public String toString(){
        return " Course[name = " + this.name + "startMount = " + Arrays.toString(startMount) + "]";
    }
}
