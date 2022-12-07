import java.util.ArrayList;
import java.util.List;

public class Student implements Element{
    private String nume, mail;
    private List<Element> listaStudent = new ArrayList<Element>();

    public Student(String nume, String mail) {
        this.nume = nume;
        this.mail = mail;
    }

    public Student()
    {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void print() {
        System.out.println("            " + this.nume + ",  " + this.mail);
    }

    @Override
    public void add(Element addElement) {
        listaStudent.add(addElement);
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
        visitor.visitStudent(this);
    }
}
