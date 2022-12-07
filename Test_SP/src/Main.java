public class Main {
    public static void main(String[] args) {
            Element info3 = new An("Informatica 3");
            Grupa grupa1 = new Grupa("Grupa 1");
            info3.add(grupa1);
            Semigrupa semigrupa1 = new Semigrupa("Semigrupa 1.1");
            grupa1.add(semigrupa1);
            Student student1 = new Student("Popescu I", "popescu@acme.edu");
            semigrupa1.add(student1);
            Student student2 = new Student("Ionescu E", "ionescu@acme.edu");
            semigrupa1.add(student2);
            Semigrupa semigrupa2 = new Semigrupa("Semigrupa 1.2");
            grupa1.add(semigrupa2);
            Student student3 = new Student("Vasilescu I", "vasilescu@acme.edu");
            Student student4 = new Student("Georgescu E", "georgescu@acme.edu");
            semigrupa2.add(student3);
            semigrupa2.add(student4);
            Grupa grupa2 = new Grupa("Grupa 2");
            info3.add(grupa2);

            Visitor printVisitor = new PrintVisitor();
            info3.accept(printVisitor);
}

}
