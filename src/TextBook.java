public class TextBook extends Book {
    private int gradeLevel;

    public void setGradeLevel(int gradeLevelIn){
        this.gradeLevel=gradeLevelIn;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public TextBook(String isbnIn, String authorIn, String titleIn, double priceIn,
                    int pageCountIn, int grade){
        super(isbnIn, authorIn, titleIn, priceIn, pageCountIn);
        setGradeLevel(grade);
    }
}
