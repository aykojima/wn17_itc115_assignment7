import java.util.Scanner;

public class PigLatinApp {
	/* Assignment 7
	 * Pig Latin
	 * Ayumi Kojima
	 * 2/18/2017
	 */
	public static void main(String[] args) {
		//Call Translation class
		Translation t = new Translation();
		//variables 
		String line = "";
		String [] invalidWords = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
				"+", "@", "!", "#", "$", "%", "^", "&", "*", "(", ")", "<", ">"};
		
		//Greeting and prompt user for input
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator. ");
		
		String choice = "y";
		boolean valid = false;
		while(choice.equalsIgnoreCase("y"))
			{
				do
				{
					System.out.println("Enter a line to be translated to Pig Latin: ");
				    line = sc.nextLine();	
				    System.out.println();
				    
				    if(line.isEmpty())
				    {
				    	System.out.println("Please enter text: ");
						System.out.println("");
				    	valid = false;
				    }else 
					{
				    	for(String invalidWord : invalidWords)					
						//validate the user input
						{
							if(line.contains(invalidWord))
							{
								System.out.println("Please enter valid text: ");
								System.out.println("");
								valid = false;
								break;
							}else
							{
								valid = true;
							}
						}
					}
				 }while(valid == false);
		
					t.separateWords(line);
					
					t.translateWords(t.separateWords(line));
					
					System.out.println(t.translateWords(t.separateWords(line)));
					System.out.println();
					System.out.println("Translate another line? (y/n): ");
					choice = sc.nextLine();
					System.out.println();
				}//end of while loop
			sc.close();
	}//end of main class
	
}//end of PigLatinApp class


