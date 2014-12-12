import java.io.IOException;
import java.util.Scanner;

class Pwr
{
	//cal the power
	double b;
	int e;
	double val;
	
	public Pwr(double base, int exp)
	{
		// TODO Auto-generated constructor stub
		b = base;
		e = exp;
		
		val = 1;
		if(exp == 0) return;
		for( ; exp > 0; exp --) val = val * base;
	}
	
	double get_pwr()
	{
		return val;
	}
}
class Vehicle
{
	int passengers;
	int fuelcap;
	int mpg;
	
	public Vehicle(int p, int f, int m)
	{
		// TODO Auto-generated constructor stub
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range()
	{
		return mpg * fuelcap;
	}
	
	double fuelneeded(int miles)
	{
		return (double) miles / mpg;
	}
	
}
class MyClass
{
	int x;
	MyClass(int i)
	{
		x = i;
	}
}
class Help
{
	void helpon(int what)
	{
		switch (what)
		{
		case '1' :
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement");
			break;
		case '2' :
			System.out.println("The switch :\n");
			break;
			
		}
		System.out.println();
	}
	void showmenu()
	{
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
	}
	boolean isvalid(char ch)
	{
		if (ch < '1' | ch > '6' & ch != 'q') return false;
		else return true;
	}
}
public class Main
{
	
	public static void main(String[] args)
	{
		System.out.println("hello world!");
	}

}
