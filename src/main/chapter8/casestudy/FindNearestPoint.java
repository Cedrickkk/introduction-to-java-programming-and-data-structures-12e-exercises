package main.chapter8.casestudy;

import java.util.Scanner;

public class FindNearestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int point1Index = 0, point2Index = 1;

        if (numberOfPoints < 2) {
            System.out.println("There must be greater than 2 points.");
            return;
        }
        
        double shortestDistance = distance(
                points[point1Index][0], points[point1Index][1],
                points[point2Index][1], points[point2Index][1]
        );

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (distance < shortestDistance) {
                    point1Index = i;
                    point2Index = j;
                    shortestDistance = distance;
                }
            }
        }

        System.out.println(
                "The closest two points are " +
                        "(" + points[point1Index][0] + ", " + points[point1Index][1] + ") "
                        + "and (" + points[point2Index][0] + ", " + points[point2Index][1] + ")"
        );
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
