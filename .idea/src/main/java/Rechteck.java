public class Rechteck extends Figure {

    private int length;
    private int width;

    public Rechteck(int width, int length) {
        this.length = length;
        this.width = width;
    }

    @Override

    public double area(){
        return length * width;
    }

    @Override

    public double circumference(){
        return 2 * ( length + width );
    }

    @Override

    public String toString(){
        return "Rechteck mit der Länge "+ length+" und Breite"+width+": Fläche -->"+area()+", Umfang --> "+circumference();
    }

}
