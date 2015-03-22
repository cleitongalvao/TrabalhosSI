import java.util.Scanner;

public class Labirinto 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
	    //int l;
	    int m[][] = new int[100][30]; // matriz com 100 linhas X 30 colunas
		
		for (int i=0; i<30;i++)
		{		
			for (int j=0; j < 100;j++)
			{				
				//l = sc.nextInt(); 
				m[j][i] = sc.nextInt();;
				System.out.print(m[j][i]+"");			
			}
			System.out.println("\n");
		}   
	}
}
