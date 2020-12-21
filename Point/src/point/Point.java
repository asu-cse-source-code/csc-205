package point;
public class Point {
   public double x;
   public double y;

   public Point() {
       this.x = 0;
       this.y = 0;
   }

   /**
    * 
    * @param x
    * @param y 
    */
   public Point(double x, double y) {
       this.x = x;
       this.y = y;
   }

   public double getX() {
       return x;
   }

   public void setX(double x) {
       this.x = x;
   }

   public double getY() {
       return y;
   }

   public void setY(double y) {
       this.y = y;
   }
}


//Circle class
class Circle {
   public double radius;
   public Point center;

   public Circle() {
       this.radius = 0;
       this.center = new Point(0,0);
   }

   public Circle(double radius) {
       this.setRadius(0);
       this.center = new Point(0,0);
   }

  

   /**
   * setting parameters for center and radius
   */
   public Circle(Point center,double radius) {
       this.center = center;
       this.setRadius(radius);
   }

   public double getRadius() {
       return radius;
   }

   public void setRadius(double radius) {
       if(radius >= 0)
           this.radius = radius;
       else
           this.radius = 0;
   }
   public Point getCenter() {
       return center;
   }

   public void setCenter(Point center) {
       this.center = center;
   }

   public double getArea() { //Area is pi * radius squared
       return 3.14159*getRadius()*getRadius();
   }

   public double getCircumference() { //Circumference is twice pi * radius
       return 2*3.14159*getRadius();
   }
   /**
    * by comparing the lengths of the radius
    * and distance between the two Points
    *  
    */
   public boolean intersect(Point p) { 
       return   Math.pow(p.getY() - center.getY(), 2) + Math.pow(p.getX() - 
               center.getX(), 2) <= Math.pow(getRadius(), 2);
   }
  
}

