
class visibilityexample{
public int publicvariable=10;
private int privatevaraible=20;
public void publicmethod(){
System.out.println("this is a public method");
}
private void privatemethod(){
System.out.println("this is a private method");
}
}
class main{
public static void main(String[]args){
visibilityexample e = new visibilityexample();
System.out.println("BATCHU SYAM SUNDER,"+'\n'+"AV.SC.U4CSE24023"+'\n'+"CSE-A");
System.out.println(" publicvariable:"+e.publicvariable);
e.publicmethod();
//System.out.println("private varaible:"+ e.privatevaraible);
//e.privatemethod();

}
}