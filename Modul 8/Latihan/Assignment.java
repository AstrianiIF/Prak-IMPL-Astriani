package main;

public class Assignment {
    private double mark = -1;

    public Assignment() {
    }

    public double getMark() throws NotYetSetException {
        if (mark == -1) {
            throw new NotYetSetException("Mark is not yet set");
        }
        return mark;
    }

    public void setMark(double m) {
        if (m < 0 || m > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        mark = m;
    }
}
