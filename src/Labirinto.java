import java.util.Scanner;

public class Labirinto 
{
	private static Scanner sc;
	private static int m[][];
	
	public Labirinto()
	{
		//sc = new Scanner(System.in);
	}

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		lerMatriz(100,30);
		iniciaProcuraCaminho(m, 93, 29);
		//No caminho;
		//Comentário
	}
	
	
	private static void iniciaProcuraCaminho(int[][] Matriz, int colInicio, int linInicio) 
	{
		
	}

	public int[][] getLerMatriz(int col, int lin)
	{
		lerMatriz(col, lin);
		return m;
	}
	
	
	private static void lerMatriz(int colunas, int linhas)
	{
	    int m[][] = new int[colunas][linhas]; // matriz com X colunas e Y linhas
		
		for (int i=0; i<linhas;i++)
		{		
			for (int j=0; j < colunas;j++)
			{				
				//l = sc.nextInt(); 
				m[j][i] = sc.nextInt();
				System.out.print(m[j][i]+"");			
			}
			System.out.println("\n");
		}   		
	}
	
	
	
	
	
	
}
