import java.util.Scanner;
class order{
public static void main(String[]args){
Scanner x = new Scanner(System.in);
System.out.print("Enter 1st number:");
int n1 = x.nextInt();
System.out.print("Enter second number:");
int n2 = x.nextInt();
System.out.print("Enter third number:");
int n3 = x.nextInt();
if (n1<n2 && n2<n3){
System.out.println("the numbers are in increasing order");
}else if(n1>n2 && n2>n3){
System.out.println("the numbers are in decreasing order");
}else{
System.out.println("the numbers are in neither increasing nor decreasing");
}
}
}
