public class Circle {
    public double radius;
    
    private Circle(double myRadius) {
      radius = myRadius;
    }
  
    private void setRadius(int newRadius) {
      radius = newRadius;
    }
  
    public double getRadius() {
      return radius;
    }
  
    private double diameter() {
      return radius * 2;
    }
    
    private double perimeter(){
      return Math.PI * diameter();
    }
  
    private String circInfo() {
      return "Circle with a radius of " + radius;
    }
  }
  