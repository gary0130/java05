import java.util.*;

public class Main
{
	static Scanner Scan=new Scanner(System.in);
	static int Number[]=new int[6];
	
	public static void main(String[] args)
	{
		System.out.println("外積計算");
		System.out.println("輸入數字，以\"enter\"隔開");
		for (int i=0;i<6;i++){
			Number[i]=Scan.nextInt();
		}
		int x=(c(1)*c(5))-(c(2)*c(4));
		int y=(c(2)*c(3))-(c(5)*c(0));
		int z=(c(0)*c(4))-(c(1)*c(3));
		System.out.println();
		System.out.println("x="+x+" y="+y+" z="+z);

		
	}
	public static int c(int x)
	{
		x=Number[x];
		return x;
	}
}
