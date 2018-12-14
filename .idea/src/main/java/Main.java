import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Figure> list = new ArrayList<Figure>();

        Figure rect = new Rechteck(4,5);
        Figure quad = new Quadrat(2);
        Figure kreis = new Kreis(8);
        Figure ellipse = new Ellipse(6,4);

        list.add(rect);
        list.add(quad);
        list.add(kreis);
        list.add(ellipse);
    }
}
