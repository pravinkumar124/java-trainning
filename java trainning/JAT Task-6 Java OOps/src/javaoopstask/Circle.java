package javaoopstask;

public class Circle {
    
    private double radius;

 
    public Circle() {
        this.radius = 5.0; 
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

   
    public double getRadius() {
        return radius;
    }

  
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " and circumference " + getCircumference();
    }

    public static void main(String[] args) {
       
        Circle defaultCircle = new Circle(); 
        Circle customCircle = new Circle(8.0); 

        
        System.out.println("Default Circle:");
        System.out.println(defaultCircle.toString());

        
        System.out.println("Custom Circle:");
        System.out.println(customCircle.toString());
    }
}
