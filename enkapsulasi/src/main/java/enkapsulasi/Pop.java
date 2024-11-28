package enkapsulasi;

public class Pop {
    private String JudulLagu;
    protected void setJudul( String nama ){
        JudulLagu = nama;
    }
    protected String getJudul() {
        return JudulLagu;
    }
}
