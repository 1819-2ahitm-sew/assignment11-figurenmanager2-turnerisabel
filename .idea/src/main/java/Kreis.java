public class Kreis extends Figure {

    private int radius;
    public Kreis(int radius){
        this.radius = radius;
    }

    @Override

    public double area() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override

    public double circumference() {
        return (int) (2 * Math.PI * radius);
    }

    @Override

    public String toString(){
        return "Kreis mit dem Radius "+radius+": Fläche -->"+area()+", Umfang --> "+circumference();
    }
}
