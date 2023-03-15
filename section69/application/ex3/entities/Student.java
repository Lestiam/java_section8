package section69.application.ex3.entities;

public class Student {
    public String name;
    public double tri1;
    public double tri2;
    public double tri3;

    public double average(){
        return tri1 + tri2 + tri3;
    }

    public String toString(){
        return (average() > 60 ? "FINAL GRADE = " + String.format("%.2f", average()) + "\nPASS"
                : "FINAL GRADE = "+ String.format("%.2f", average()) + "\nFailed" + "\nMissing " + (60.0 - average()) + " POINTS");
    }
}
