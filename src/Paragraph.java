public class Paragraph implements Element
{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print()
    {
        System.out.println("Paragraph: " + this.text);
    }

    @Override
    public void add(Element addElement) {

    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        Context context = new Context(strategy);
        this.text = this.text + context.executeStrategy(this, context);
    }
}
