import java.util.*;

public class Main
{
	static Scanner Scan=new Scanner(System.in);
	static int Number[]=new int[9];
	static int mode,deb;
	
	public static void main(String[] args)
	{
		do{
		about();
		mode=Scan.nextInt();
		switch(mode)
		{
			case 1:
			dot();
			break;
			case 2:
			cross();
			break;
			case 3:
			line();
			break;
			default:
			System.out.println("錯誤");
			deb=1;
		}
		}while(deb!=1);
		
		
		
	}

	
	public static int c(int x)
	{
		x=Number[x];
		return x;
	}
	public static void cross()
	{
		//外積
		Syste