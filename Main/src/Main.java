import java.io.IOException;
import java.util.Scanner;

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
	throws IOException
	{
		char choice, ignore;
		//Scanner in = new Scanner();
		Help hlpobj = new Help();
		while(true)
		{
			do
			{
				hlpobj.showmenu();
				choice = (char) System.in.read();
				
			
				do
				{
					ignore =  (char) System.in.read();
				} while (ignore != '\n');
			} while (!hlpobj.isvalid(choice));
			if(choice == 'q') break;
			System.out.println("\n");
			hlpobj.helpon(choice);
			
			
		}
		
	}

}
