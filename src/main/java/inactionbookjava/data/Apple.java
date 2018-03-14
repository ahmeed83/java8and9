package inactionbookjava.data;

public class Apple {

    String color;
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple {" + "color = '" + color + '\'' + '}';
    }
}
