import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element{
    private String nume;
    private List<Element> listaGrupa = new ArrayList<Element>();

    public Grupa(String nume) {
        this.nume = nume;
    }

    public Grupa()
    {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    @Override
    public void print() {
        System.out.println("    " + this.nume);
        for(int i = 0; i < listaGrupa.size(); i++){
            listaGrupa.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaGrupa.add(addElement);
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
        visitor.visitGrupa(this);
    }
}
