package ie.tudublin;

import javax.swing.text.TableView.TableRow;
import processing.data.Table;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
		String[] line;


    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		printFile();

       
	}

	void loadFile(){

		loadStrings("small.txt"); // Load a text file into a String array
		//split(line, ' ');

		//for (TableRow line: table.rows()){

		//}


		//for ()

		//split(line, ' '); // Split a string into an array of words
		//w.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
		//s.toLowerCase() // Convert a string to lower case 
	}

	void printFile(){

		//print out the words
		for (Word word:follows){
			
			System.out.println(word);
		}
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
    textAlign(CENTER, CENTER);
        
	}
}
