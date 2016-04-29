import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many times should the coin be flipped?");
		int flip = userInput.nextInt();
		int heads = 0;
		int tails = 0;
		int randomNumber = (int)(Math.random()*100) + 1;
		for (int i = 0; i < flip; i++)
			{
			randomNumber = (int)(Math.random()*100) + 1;
			if (randomNumber <= 50)
				{
					heads = heads + 1;
				}
			else if (randomNumber >= 51)
				{
					tails = tails + 1;
				}
				
			}
			System.out.println("It was heads " + heads + " times.");
			System.out.println("It was tails " + tails + " times.");
	}
//bang bang
}
