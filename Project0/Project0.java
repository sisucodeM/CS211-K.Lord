package shengen_xie_project0;
//Name: Shengen Xie
//Lab: CSCI212-11A

import javax.swing.JOptionPane;

public class Project0 {

	static String sentence;
	
	public static String readSentence() {
		return (JOptionPane.showInputDialog(null,"Please enter a sentence."));
		
	} // ask user to input a sentence.
	
	public static int countChar(String s, char e) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) 
			if(s.charAt(i) == e) count++;
		return count;
	} // the method to count the times of a certain character  appears in the sentence.
	
	public static String caseCheck (char e) {
		if(e > 96 ) return("lower case");
		else return ("upper case");
	} // the method to check lower/upper case.
	
	public static String message (char e, int count) {
		return ("Number of " + caseCheck(e) + " e's: " + count);
	} // the result will be shown on the screen. 
	
	/*public static String showMessaga(char e,int count) {
		//return (JOptionPane.showMessageDialog(null, m);
		return (JOptionPane.showMessageDialog(null,"Number of " + caseCheck('e') + "e's: " + count);
	}*/


	public static void main (String[] args) {
		while(true) {
			sentence = readSentence();
		
			if(sentence.equalsIgnoreCase("STOP")) System.exit(0);
		
			int countE = countChar(sentence, 'E');
			int counte = countChar(sentence, 'e');
		
			String message1 = message('E', countE);
			String message2 = message('e', counte);
		
			JOptionPane.showMessageDialog(null, message1 + "\n" + message2);
		
		}
		
	}
}
