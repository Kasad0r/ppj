package cw17;

public class Rect {
    private double countField;
    private double countDiagonal;

    public double getCountField() {
        return countField;
    }

    public void setCountField(double countField) {
        this.countField = countField;
    }

    public double getCountDiagonal() {
        return countDiagonal;
    }

    public void setCountDiagonal(double countDiagonal) {
        this.countDiagonal = countDiagonal;
    }

    public Rect(double countField, double countDiagonal) {
        this.countField = countField;
        this.countDiagonal = countDiagonal;
    }
}
