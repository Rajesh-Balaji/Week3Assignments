package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment2_PayPal {

	public static void main(String[] args) {
		
		String str = "PayPal India"; //String declaration
		char[] chr = str.toCharArray(); //String to char array conversion
		Set<Character> charSet = new HashSet<Character>(); //Declaring charSet
		Set<Character> dupCharSet = new HashSet<Character>(); //Declaring dupCharSet
		
		for(int i=0; i<chr.length-1;i++){ //loop to add the characters to the set
			if(charSet.contains(chr[i])){
				dupCharSet.add(chr[i]);
				charSet.remove(chr[i]);
				}
			else{
				charSet.add(chr[i]);
			}
						
		}
		charSet.remove(' '); //removing white spaces
		System.out.println("The Characters present in the Character set are: "); //Print statement
		
		for(int j=0; j<charSet.size(); j++){			
				List<Character> chrList = new ArrayList<Character>(charSet); //converting set to list
				System.out.println(chrList.get(j)); //printing set value after converting it to a list
						
		}
		
	}

}
