package shengen_xie_project1;

import javax.swing.*;
import java.awt.*;

public class WordGUI extends JFrame{
	
	public WordGUI() {
		super("Project1");
		
		
	
		setLayout(new GridLayout(2,3));
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible (true);
		
	}
	
	public static void print(JFrame jf, String[] list,int size) {
		Container contentPane = jf.getContentPane();
		TextArea txt1 = new TextArea();
		TextArea txt2 = new TextArea();
		TextArea txt3 = new TextArea();
		TextArea txt4 = new TextArea();
		TextArea txt5 = new TextArea();
		TextArea txt6 = new TextArea();
		contentPane.add(txt1);
		contentPane.add(txt2);
		contentPane.add(txt3);
		contentPane.add(txt4);
		contentPane.add(txt5);
		contentPane.add(txt6);
		
		for(int i = 0; i < size; i++) {
			if(list[i].toLowerCase().startsWith("a")) 
				txt1.append(list[i]+"\n");   //i + " " +
			else if(list[i].toLowerCase().startsWith("e")) 
				txt2.append(list[i]+"\n");
			else if(list[i].toLowerCase().startsWith("i")) 
				txt3.append(list[i]+"\n");
			else if(list[i].toLowerCase().startsWith("o")) 
				txt4.append(list[i]+"\n");
			else if(list[i].toLowerCase().startsWith("u")) 
				txt5.append(list[i]+"\n");
			else 
				txt6.append(list[i]+"\n");
		jf.setVisible(true);
		}
			
		
	}
	
//	public static void main(String[] args) {
//		String[] ex = {"example","Eshop","iphone","orange","uno","alice","talent","Ace","IHOP"};
//		WordGUI wordGUI = new WordGUI();
//		print(wordGUI,ex,12);
//		
//		
//		
//	}
}
