 abstract class animals{
abstract void sound();
}
class lion extends animals{
public void sound(){
System.out.println("lion roars");
 }
}
class tiger extends animals{
public void sound(){
System.out.println("tiger growls");
}
}
class main{
public static void main(String[]args){
tiger t = new tiger();
t.sound();
lion l = new lion();
l.sound();
}
}
