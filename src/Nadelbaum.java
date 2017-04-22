
public class Nadelbaum
{

	public static void main(String[] args)
	{

		nadelbaum(5);

	}

	public static void nadelbaum(int hohe)
	{
		int i;
		int b;

		for(i = 0; i < hohe - 1; i++)
		{

			for(int c = 1; c < hohe - i; c++)
			{
				System.out.print(".");

			}

			for(b = 0 ; b  < hohe + i; b++)
			{
				System.out.print("*");
			}

			for(int d = 1; d < hohe - i; d++)
			{
				System.out.print(".");

			}
			
			System.out.println();
		}

	}

}
