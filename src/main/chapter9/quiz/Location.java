package main.chapter9.quiz;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location() {
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargerst(double[][] a) {
        double currentMax = a[0][0];
        int currentMaxRow = 0;
        int currentMaxCol = 0;
        for (int row = 0; row < a.length; row++) {
            for (int column = row + 1; column < a[row].length; column++) {
                if (currentMax < a[row][column]) {
                    currentMax = a[row][column];
                    currentMaxRow = row;
                    currentMaxCol = column;
                }
            }
        }
        return new Location(currentMaxRow, currentMaxCol, currentMax);
    }
}
