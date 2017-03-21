
public class Translation {
	
	public String[] separateWords(String line){
		//Convert line to lowercase
		line = line.toLowerCase();
		//Parse the string into separate words
		String [] words = line.split(" ");
		return words; 
		}		
	
	public boolean isVowel(char word){
		//find a first vowel in word
		if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u')
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String translateWords(String [] words){
		int vIndex = 0;
		String newWord = "";
		String pigLatin = "";
		
		for(String word : words)
		{
			//loop through words array
			for(int i = 0; i<word.length(); i++)
			{
				//loop through a word until it finds a vowel
				if(isVowel(word.charAt(i)) == true)
				{
					//get index of vowel
					vIndex = i;
					break;
				}
			}//end of second for statement
			if(vIndex == 0)
			{
				//this is for words that starts with a vowel
				//append way at the end
				newWord = word + "way ";
			}else 
			{
				//if the word starts with a consonant, move all the consonants that appear before the first vowel
				//to the end of the word, then add ay to the end of the word
				newWord = word.substring(vIndex) + word.substring(0, vIndex) + "ay ";
 			}
			//concatenate the new words
			pigLatin += newWord;								
		}//end of the first for statement	
		
		return pigLatin;
	}//end of translateWords class
}//end of Translate class
		//identify consonants and vowels
	
	
