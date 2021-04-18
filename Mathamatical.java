/**
 * Methods that are somewhat mathamatical and forumalic.
 */
public class Mathamatical {

    /**
     * Computes the area of a circle.
     * 
     * @param r radius (in whatever units you want)
     * @return the area (in whatever units r was squared)
     */
    public static double areaOfCircle(double r) {
        return r * r * Math.PI;
    }

    /**
     * Computes the area of an equilateral triangle.
     * 
     * @param s length of a side
     * @return the area (in whatever units entered squared)
     */
    public static double areaOfEquilateralTriangle(double s) {
        return (s * s * Math.sqrt(3.0)) / 4.0;
    }

    /**
     * Computes the slope between two points.
     * 
     * @param x1 x value of first point
     * @param y1 y value of first point
     * @param x2 x value of second point
     * @param y2 y value of second point
     * @return the slope between two points
     */
    public static double slope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    /**
     * Computes the distance between two points
     * 
     * @param x1 x value of first point
     * @param y1 y value of first point
     * @param x2 x value of second point
     * @param y2 y value of second point
     * @return the distance between two points
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
