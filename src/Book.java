import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book
{
    private String title;
    private List<String> Paragraph = new ArrayList<String>();
    private List<String> Image = new ArrayList<String>();
    private List<String> Table = new ArrayList<String>();

    public Book(String title)
    {
        this.title = title;
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
        System.out.print("Title: " + this.title + "\n" + "Paragraphs: " + this.Paragraph + "\n" + "Tables: " + this.Table + "\n" + "Images: " + this.Image);
    }
}