import java.util.Scanner;
class floatingpointinteger
{
	public static void main(String[]args)
	{
	Scanner scanner=  new Scanner(System.in);
 	System.out.print("First floating point integer:");
	double num1= scanner.nextDouble();
	System.out.print("second floating point integer:");
	double num2 = scanner.nextDouble();
	int num1rounded = (int)(num1*1000);
	int num2rounded =  (int)(num2*1000);
System.out.println("BATCHU SYAM SUNDER,"+'\n'+"AV.SC.U4CSE24023"+'\n'+"CSE-A");
	if(num1rounded==num2rounded){
		System.out.println("the both floating point integers are same");
	}
	else{
		System.out.println("both are different");
	}
	}
}