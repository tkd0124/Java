package Collection;

public class Card implements Comparable<Card>{
    private int number;
    private String mark;

    public Card(int number, String mark) {
        this.number = number;
        this.mark = mark;

    }

    public int getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return mark + number;
    }
    @Override
    public int compareTo(Card other){
        return Integer.compare(this.number,other.number);
    }
}
