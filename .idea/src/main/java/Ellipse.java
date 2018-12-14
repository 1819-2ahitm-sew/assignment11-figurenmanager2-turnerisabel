public class Ellipse extends Figure {

    private int hauptachse;
    private int nebenachse;

    public Ellipse(int hauptachse, int nebenachse){
        this.hauptachse = hauptachse;
        this.nebenachse = nebenachse;
    }

    @Override

    public double area(){
        return (int) (hauptachse * nebenachse * Math.PI);
    }

    @Override

    public double circumference(){
        return (int) (Math.PI * (Math.sqrt(2 * (hauptachse * hauptachse * nebenachse * nebenachse))));
    }
    @Override

    public String output(){
        return "Ellipse mit der Hauptachse "+hauptachse+" und Nebenachse"+nebenachse+": Fläche -->"+area()+", Umfang --> "+circumference();
    }
}
