public class PrintVisitor implements Visitor{
    @Override
    public void visitStudent(Student _Student) {
        _Student.print();
    }

    @Override
    public void visitGrupa(Grupa _Grupa) {
        _Grupa.print();
    }

    @Override
    public void visitSemigrupa(Semigrupa _Semigrupa) {
        _Semigrupa.print();
    }

    @Override
    public void visitAn(An _An) {
        _An.print();
    }

    public void print()
    {

    }
}
