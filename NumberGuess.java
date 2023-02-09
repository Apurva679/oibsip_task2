import java.util.Scanner;
import java.util.Random;

class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
    	int i=5,k,sample=0,guess;
        int randomNumber = random.nextInt(100);
	
	
	
	for(k=0;k<i;k++)
	{
		sample++;
        	System.out.println("Enter number between 1 to 100");
        	guess = sc.nextInt();
		
		
		if(randomNumber>guess)
		{
			System.out.println("number is greater than "+guess);
			
		}
		else if(randomNumber<guess)
		{
			System.out.println("number is less than "+guess);
			
		      
		}
		else
		{
			System.out.println("congratulations,guessed number is correct");
			System.out.println("you guessed number in "+sample+" trials");
			break;
		}
		
	}
	if(k==i)
	{
		System.out.println("you exhausted "+i+" trials");
	}
	
	
    }
}