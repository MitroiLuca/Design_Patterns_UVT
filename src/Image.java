public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print()
    {
        System.out.println("Image with Name: " + this.imageName);
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
}
