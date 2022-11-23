import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    private String nume;
    private List<Element> listaAn = new ArrayList<Element>();

    public An(String nume) {
        this.nume = nume;
    }

    public An()
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
        System.out.println(this.nume);
        for(int i = 0; i < listaAn.size(); i++){
            listaAn.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaAn.add(addElement);
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
        visitor.visitAn(this);
    }
}
