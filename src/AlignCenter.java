public class AlignCenter implements AlignStrategy{
    @Override
    public String render(Paragraph p, Context c) {
        return ": Alignment: Center";
    }

    public AlignCenter() {
    }
}
