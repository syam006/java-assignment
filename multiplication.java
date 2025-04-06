import java.util.Scanner;
class multiplication{
public static void main(String[]args){
Scanner x = new Scanner(System.in);
System.out.print("enter the table:");
int a = x.nextInt();
System.out.print("no of terms:");
int t = x.nextInt();
for(int i = 0; i<=t;i++){
System.out.println(a+"X"+i+"="+(a*i));
}
}
}