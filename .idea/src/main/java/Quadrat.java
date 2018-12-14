public class Quadrat extends Figure {

    private int length;

    public Quadrat(int length) {
        this.length = length;
    }

    @Override

    public double area(){
        return length * length;
    }

    @Override

    public double circumference(){
        return length * 4;
    }

    @Override

    public String output(){
        return "Quadrat mit der Länge "+ length+": Fläche -->"+area()+", Umfang --> "+circumference();
        }
    }
