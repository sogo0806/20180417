public class Rectangle extends Shape implements Measure {
    private int lenght , weight;
    public Rectangle (int l1 , int w1){
        this.setLenght(l1);
        this.setWeight(w1);
    }
    public void setLenght(int l1){
        this.lenght = l1;
    }
    public int getLenght() {
        return lenght;
    }
    public void setWeight(int w1) {
        this.weight = w1;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public void area() {
        System.out.println(lenght*weight);
    }

    @Override
    public void perimeter() {
        System.out.println((lenght+weight)*2);
    }

    @Override
    public void show() {
        System.out.print("面積:");area();
        System.out.print("周長:");perimeter();
    }
}
