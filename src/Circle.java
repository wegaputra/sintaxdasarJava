public class Circle {
    public static void main(String[] args) {
        
        double radius, area, circumference;
        
        final double  PI = 3.14159265;
        
        radius = 1.2;
        
        area = radius * PI;
        circumference = 2.0 * radius * PI;
        
        System.out.println("The radius is");
        System.out.println(radius);
        System.out.println("The area is");
        System.out.println(area);
        System.out.println("The circumference");
        System.out.println(circumference);
    }
}
