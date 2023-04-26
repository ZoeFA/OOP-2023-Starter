package ie.tudublin;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

//import javax.swing.text.TableView.TableRow;

public class Word {

  private String word;

  ArrayList<Follow> follows = new ArrayList<Follow>();

  public ArrayList<Follow> getFollows() {
    return follows;
  }

  public void setFollows(ArrayList<Follow> follows) {
    this.follows = follows;
  }

  //getters and setters
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Word(String word){

    this.word = word;

  }
  
  //accessor method
  public Word(){

  }


  //constructor
  //public Word(){
  //}

  void findFollow(follows){
    
  }

  @Override
    public String toString() {
      
      for (word in follows){
        return word + ": " + follows + "(" + count + ")" "\n";
      }
    }

  
}
