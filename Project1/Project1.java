package shengen_xie_project1;

import java.util.*;
import shengen_xie_project1.WordGUI;


public class Project1 {
	
	public static TextFileInput myfile;
	public static String line;
	public static String[] words = new String[80];
	public static int count = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myfile = new TextFileInput("src/shengen_xie_project1/input.txt");
		line = myfile.readLine();
		while(line != null) {
			words[count] = line;
			line = myfile.readLine();
			count++;
		}
//		for(int i = 0; i < count; i++)
//			System.out.println(i + " "+ words[i]);
		WordGUI wordGUI = new WordGUI();
		WordGUI.print(wordGUI,words,count);
		
	}

}
