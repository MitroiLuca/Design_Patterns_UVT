public class AlignRight implements AlignStrategy{
    @Override
    public String render(Paragraph p, Context c) {
        return ": Alignment: Right";
    }

    public AlignRight() {

    }
}
