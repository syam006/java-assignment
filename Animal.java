class Animal{
public void eat(){
System.out.println("Animal eating food habits");

}
}
class herbivorous extends Animal{
public void eat(){
System.out.println("herbivorous animals only eat plants and vegetales");
}
}
class carnivorous extends herbivorous{
public void eat(){
System.out.println("carnivorous animals eat meat");
}
}
class omnivorous extends carnivorous{
public void eat(){
System.out.println("omnivorous eat boths plants and meat ");
}
}
class main{
public static void main(String[]args){
herbivorous herb  = new herbivorous();
herb.eat();
carnivorous carni = new carnivorous();
carni.eat();
omnivorous omni = new omnivorous();
omni.eat();
}
}
