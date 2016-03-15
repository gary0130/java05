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
		System.out.println("外積計算");
		help();
		for (int i=0;i<6;i++){
			Number[i]=Scan.nextInt();
		}
		int x=(c(1)*c(5))-(c(2)*c(4));
		int y=(c(2)*c(3))-(c(5)*c(0));
		int z=(c(0)*c(4))-(c(1)*c(3));
		System.out.println();
		System.out.println("x="+x+" y="+y+" z="+z);

		int shape =x*x+y*y+z*z;
		System.out.println("面積平方="+shape);
		System.out.println("---------------");
	}
	
	public static void dot()
	{
		//內積
		System.out.println("內積計算");
		System.out.println("選擇模式");
		System.out.println("1:平面，2:空間");
		int dotmode=1,calc=0;
		dotmode=Scan.nextInt();
		switch(dotmode)
		{
			case 1:
			dotmode=4;
			System.out.println("選擇平面");
			break;
			case 2:
			dotmode=6;
			System.out.println("選擇空間");
			break;
			default:
			System.out.println("錯誤");
		}
		help();
		for (int i=0;i<dotmode;i++){
			Number[i]=Scan.nextInt();
		}
		switch(dotmode)
		{
			case 4:
			calc=c(0)*c(2)+c(1)*c(3);
			break;
			case 6:
			calc=c(0)*c(3)+c(1)*c(4)+c(2)*c(5);
			break;
		}
		System.out.println("外積="+calc);
		System.out.println("---------------");
		
		
	}
	public static void line()
	{
		//行列式
		help();
		for (int i=0;i<9;i++){
			Number[i]=Scan.nextInt();
		}
		int calcl;
		calcl=c(0)*c(4)*c(8)+c(1)*c(5)*c(6)+c(2)*c(3)*c(7)-c(2)*c(4)*c(6)-c(0)*c(5)*c(7)-c(1)*c(3)*c(8);
		System.out.println("計算結果="+calcl);
		System.out.println("---------------");
	}
	
	public static void help()
	{
		System.out.println("請輸入值，每個數字以\"enter\"隔開");
	}
	public static void about()
	{
		System.out.println("v0.3.15");
		System.out.println("請輸入模式");
		System.out.println("1:內積，2:外積，3:三階行列式");
	}
}
