public class SnapCrackle
{
public static void main(String[] args)
	{
for (int i=1;i<101;i++)
	{

if ((i/5>=1) && (i/3>=1))
System.out.println("CracklePop");
else if(i/3>=1)
System.out.println("Crackle");
else if(i/5>=1)
System.out.println("Pop");
else
System.out.println(+i);
		}
	}	
}
