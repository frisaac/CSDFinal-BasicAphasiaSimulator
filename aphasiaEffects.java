import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author frisaac
 *
 */
public class aphasiaEffects {
	public String message;
	
	public aphasiaEffects() {
		message = "The dog ran into the house";
	}
	
	public void addParaphasia() {
		System.out.println("Oftentimes a patient with paraphasia will switch related"
				+ " words or similar sounding words.\n In this example, the word 'cat' "
				+ "is replaced with the word 'dog' and the word 'house' is switched"
				+ " with the word 'horse'.");
		//switching related words (dog => cat)
		message.replaceAll("cat", "dog");
		//switching similar sounding words (house => horse)
		message.replaceAll("house", "horse");
	}
	
	public void scramble() {
		System.out.println("Certain types of aphasia might cause sentences to be completely "
				+ "scrambled and practically unintelligible.");
		 List<Character> characters = new ArrayList<Character>();
		 for(char c:message.toCharArray()){
			 characters.add(c);
		 }
	     StringBuilder output = new StringBuilder(message.length());
	     while(characters.size()!=0) {
	    	 int rand = (int)(Math.random()*characters.size());
	            output.append(characters.remove(rand));
	     }
	     message =  output.toString();
	 }
	
	public void addPauses() {
		System.out.println("Aphasia patients might also add lengthy pauses at unusual points throught\n"
				+ "their sentence.");
		int rand = (int)(Math.random()*message.length());
		String s1 = message.substring(0, rand);
		String s2 = message.substring(rand, message.length());
		String newMessage = s1 + " ... " + s2;
		message = newMessage;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("CS&D FINAL PROJECT - BASIC APHASIA SIMULATOR");
		System.out.println("Welcome to the aphasia simulator. I decided to make a java project showing the diverse\n"
				+ " number of possible ways aphasia might affect a simple sentence: "
				+ "'The dog ran into the house.'\n");
		aphasiaEffects example = new aphasiaEffects();
		String choice = "";
		while(!choice.equals("5")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("MENU - Please select option!");
			System.out.println("1. Add paraphasia");
			System.out.println("2. Scramble it");
			System.out.println("3. Add pauses");
			System.out.println("4. New combo");
			System.out.println("5. EXIT");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				example.addParaphasia();
				System.out.println("RESULT: " + example.message);
			}
			else if(choice.equals("2")) {
				example.scramble();
				System.out.println("RESULT: " + example.message);
			}
			else if(choice.equals("3")) {
				example.addPauses();
				System.out.println("RESULT: " + example.message);
			}
			else if(choice.equals("3")) {
				example.addPauses();
				System.out.println("RESULT: " + example.message);
			}
			else if(choice.equals("4")) {
				example = new aphasiaEffects();
				System.out.println("RESULT: " + example.message);
			}
			else if(choice.equals("5")) {
				return;
			}
			else {
				System.out.println("Please select valid option!");
			}
			System.out.println();
		}
	}
}
