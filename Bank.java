import java.util.*;
import java.lang.Math;
public class Main
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 System.out.println("Kind of account for customers"); 
 System.out.println("1)savings account\n2)current account");
 int x=s.nextInt();
 System.out.println("Enter the principal amount");
 double p=s.nextDouble();
 System.out.println("Enter time of period");
 double t=s.nextDouble();
 Current c1=new Current(p,t);
  switch(x)
{
 case 1: c1.savbank();
        break;
 case 2: c1.curbank();
       break;
 default:System.out.println("Invalid option");
}
}
}



class Saving
{
 
 double p;
 double r;
 double a;
 double t;

 void savbank()
{
    int ch;
 r=3.000;
 Scanner s=new Scanner(System.in);

	double a = p*(Math.pow((1 + r / 100), t));
	 
do
{
 System.out.println("***MENU***\n1.check balance\n2.withdrawl\n3.Exit");
 ch=s.nextInt();
 switch(ch)
{
 case 1:System.out.println("Balance:"+a);
        break;
 case 2:System.out.println("Enter withdrawl amount");
        double w=s.nextDouble();
        if(a<w)
       {
        System.out.println("NO SUFFICIENT BALANCE");
       }
       else
       { 
        a=a-w;
       System.out.println(w+" trnsaction succesfull");
       }
       break;
 case 3:System.exit(0);
default:System.out.println("Entered option is invalid");
}
}while(ch!=4); 
}    
}

class Current extends Saving
{
Current(double princ,double time)
{
 p=princ;
 t=time;
}
    int ch;
 void curbank()
{a=p;
 Scanner s=new Scanner(System.in);
 do
{
 System.out.println("***MENU***\n1.check balance\n2.withdrawl\n3.Exit");
 ch=s.nextInt();
 
 switch(ch)
{
 case 1:System.out.println("Balance:"+a);
        break;
 case 2:System.out.println("Enter withdrawl amount");
        double w=s.nextDouble();
        if(a<w)
       {
        System.out.println("NO SUFFICIENT BALANCE");
       }
       else
       { 
        a=a-w;
       System.out.println(w+" transaction succesfull");
       if (a<5000)
      {
           System.out.println("Maintain a minimum balance\nService charge(Rs.200) is imposed");
           a=a-200;
      }
       }
       break;
 case 3:System.exit(0);
default:System.out.println("Enter valid option");
}
}while(ch!=4); 
}
}
