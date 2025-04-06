
import java.util.Scanner;

class Week
{
public int day;
    
    public void Read()
	{
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a value between '1' and '7' as per the day:");
        this.day = x.nextInt();
        
        if (day == 1)
		{
            System.out.println("Monday");
        }
		else if (day == 2)
		{
            System.out.println("Tuesday");
        }
		else if (day == 3)
		{
            System.out.println("Wednesday");
        }
		else if (day == 4)
		{
            System.out.println("Thursday");
        }
		else if (day == 5)
		{
           System. out.println("Friday");
        }
		else if (day == 6)
		{
            System.out.println("Saturday");
        }
		else if (day == 7)
		{
            System.out.println("Sunday");
        }
		else
		{
            System.out.println("Error, Please enter a value between '1' and '7'");
        }
    }
}

class main
{
    public static void main(String args[])
	{
System.out.println("BATCHU SYAM SUNDER,"+'\n'+"AV.SC.U4CSE24023"+'\n'+"CSE-A");
        Week w = new Week();
        w.Read();
    }
}