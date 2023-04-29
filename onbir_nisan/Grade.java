package onbir_nisan;

public class Grade {
    private String name;
    private int lowerBound;

    public Grade(String grade, int cutoff) {
        name = grade ;
        lowerBound=cutoff;
    }

    public String toString() {
        return name + "\t" + lowerBound;
    }

    public void setName(String grade) {
        name = grade;
    }

    public void setLowerBound(int cutoff) {
        lowerBound = cutoff;
    }

    public String getName() {
        return name;
    }

    public int getLowerBound() {
        return lowerBound;
    }

   
}
