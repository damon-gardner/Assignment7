import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {
    private char[] isbn = new char[10];
    private String author, title;
    private double price;
    private int pageCount;

    public boolean checkISBN(){
       int s=0, t=0;
        for (int i = 0; i < 10; i++) {
            t += Character.getNumericValue(isbn[i]);
            s += t;
        }
        return (s%11==0);
    }
    public StringBuilder getIsbn() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < isbn.length; ++i)
        sb.append(isbn[i]);
        return sb;
    }

    public void setIsbn(String isbnIn) {
        int length = isbnIn.length();
        int num = Integer.parseInt(isbnIn);
        //isbn = new ArrayList<Integer>();
        for (int index=0; index<length; index++) {
            isbn[index] = isbnIn.charAt(index);
        }
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String displayInfo(){
        StringBuilder sb = new StringBuilder(getIsbn().toString() + " : "
        + getTitle() + " by " + getAuthor() +" "+ getPageCount() + " pages long $"+ getPrice());
        return sb.toString();
    }

    public Book(String isbnIn, String authorIn, String titleIn, double priceIn, int pageCountIn) {
        setIsbn(isbnIn);
        setAuthor(authorIn);
        setTitle(titleIn);
        setPrice(priceIn);
        setPageCount(pageCountIn);
    }
/*
    public static void main(String[] args) {
        Book b = new Book("0023097906", "Arthur Kalmer Bierman", "Philosophy for a New Generation",
                19.99, 678);
        if (!b.checkISBN()) {
            System.out.println("ERROR: Invalid ISBN Number");
        }
        else System.out.println(b.displayInfo());
    }
*/
    //public Book(int isbnIn, String authorIn, String titleIn, double priceIn, int pageCountIn, int grade){}
/*
    public class TextBook extends Book {
        private int gradeLevel;

        public void setGradeLevel(int gradeLevelIn){
            this.gradeLevel=gradeLevelIn;
        }

        public int getGradeLevel() {
            return gradeLevel;
        }

        public TextBook(int isbnIn, String authorIn, String titleIn, double priceIn,
                        int pageCountIn, int grade){
            super(isbnIn, authorIn, titleIn, priceIn, pageCountIn);
            setGradeLevel(grade);
        }
    }
*/
}
