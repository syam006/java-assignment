
abstract class Shape3D{
 public abstract void calculatevolume();
public abstract void calculatesurfacearea();
}
class sphere extends Shape3D{
 private Double radius;
sphere(Double radius){
this.radius = radius;
}
 public void calculatevolume(){
System.out.println( (4/3) * radius * radius * radius);
}
 public void calculatesurfacearea(){
System.out.println((4.0)*3.14*radius*radius);
}
}
class cube extends Shape3D{
 private Double length;
private Double breadth;
Double height;
cube(Double length,Double height,Double breadth){
this.length = length;
this.breadth = breadth;
this.height = height;
}

public void calculatevolume(){
System.out.println( length*breadth*height);
}
 public void calculatesurfacearea(){
System.out.println( (2.0)*(length*breadth+breadth*height+length*height));
}
}
class main{
public static void main(String[]args){
sphere s = new sphere(4.0);
cube c = new cube(4.0,4.0,4.0);
s.calculatevolume();
s.calculatesurfacearea();
c.calculatesurfacearea();
c.calculatevolume();
}
}

