import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapterList;

    public Book(String title) {
        this.title = title;
        chapterList = new ArrayList<Chapter>();
    }

    public void addAuthor(Author authorName)
    {
        this.author = authorName;
    }

    public int createChapter(String chapterName)
    {
        Chapter capitol = new Chapter(chapterName);
        chapterList.add(capitol);
        return chapterList.size() - 1;
    }

    public Chapter getChapter(int index)
    {
        return chapterList.get(index);
    }

    public void print()
    {
        for(int i = 0; i < chapterList.size(); i++)
        {
            chapterList.get(i).print();
        }


    }
}