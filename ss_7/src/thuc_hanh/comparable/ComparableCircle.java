package thuc_hanh.comparable;

public class ComparableCircle  extends Circle implements Comparable<ComparableCircle> {

    ComparableCircle(){}
    ComparableCircle(double radius){
        super(radius);
    }
    ComparableCircle(double radius, String color,boolean filled){
        super(radius,color,filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
