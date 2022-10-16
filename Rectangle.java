public class Rectangle {
 public float rectangle;
 public float length;
 public float width;
 public float perimeter;
 public float area;
 public Rectangle(float length, float width){
 if(length < 0.0 || length >= 20.0){
 System.out.println("Length must be between 0.0 and 20.0");
 }
 if(width < 0.0 || width >= 20.0){
 System.out.println("Length must be between 0.0 and 20.0");
 }
 this.length = length;
 this.width = width;
 }