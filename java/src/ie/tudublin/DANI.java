package ie.tudublin;

//import Follow.java;
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

		String[] lines = loadStrings("small.txt"); // Load small.text into a string array

		for (String line : lines) {//for every line
			
			String[] words = split(line, ' ');

			for (int i = 0; i < words.length; i++){

				words[i] = words[i].replaceAll("[^\\w\\s]","").toLowerCase();

				if (i == words.length - 1){
					model.add(new Word(words[i], new ArrayList<Follow>()));
				}
				else {

					String followingWord = words[i + 1].replaceAll("[^\\w\\s]","").toLowerCase();
				}
			}
		}

		/*
		//attempt to load words into the follows array;list
		for (words word: word.rows()){

			Word word = new Follow(this, word);
			Follow.add(word);
		}*/
		//split(line, ' ');

		//for (TableRow line: table.rows()){
			//attempt to split the text file into lines
			//split lines into separate words

		//}


		//for ()

		//split(line, ' '); // Split a string into an array of words
		//w.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
		//s.toLowerCase() // Convert a string to lower case 
	}

	void printFile(){


		//print out the text file
		System.out.println("small.text");

		//print out the model
		for (Word word:follows){
			
			System.out.println(word);
		}
	}

	void findWord(String word){


	}
	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		stroke(255);
		textSize(20);
		text("small.text", CENTER, CENTER);
    textAlign(CENTER, CENTER);
        
	}
}
