package ie.tudublin;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

//import javax.swing.text.TableView.TableRow;

public class Word {

  private String word;

  ArrayList<Follow> follows = new ArrayList<Follow>();

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Word(String word){

    this.word = word;

  }
  
  public Word(){

  }


  @Override
    public String toString() {
      
      for (word in follows){
        return word + ": " + follows + "(" + count + ")" "\n";
      }
    }

  
}
