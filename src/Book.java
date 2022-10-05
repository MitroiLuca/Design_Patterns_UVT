import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book
{
    private List<String> Paragraph = new ArrayList<String>();
    private List<String> Image = new ArrayList<String>();
    private List<String> Table = new ArrayList<String>();

    public Book(String paragraph)
    {
        Paragraph.add(paragraph);
    }

    public void createNewParagraph(String paragraph) {
        Paragraph.add(paragraph);
    }

    public void createNewImage(String image) {
        Image.add(image);
    }

    public void createNewTable(String table) {
        Table.add(table);
    }

    public void print()
    {
        System.out.print(this.Paragraph + "\n" + this.Table + "\n" + this.Image);
    }
}