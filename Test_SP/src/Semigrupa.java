import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element{
    private String nume;
    private List<Element> listaSemigrupa = new ArrayList<Element>();

    public Semigrupa(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Semigrupa ()
    {

    }

    @Override
    public void print() {
        System.out.println("        " + this.nume);
        for(int i = 0; i < listaSemigrupa.size(); i++){
            listaSemigrupa.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaSemigrupa.add(addElement);
    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
