public interface Visitor {
    void visitBook(Book B);
    void visitSection(Section S);
    void visitTableOfContents(TableOfContents ToC);
    void visitParagraph(Paragraph P);
    void visitImageProxy(ImageProxy IP);
    void visitImage(Image I);
    void visitTable(Table T);
}
