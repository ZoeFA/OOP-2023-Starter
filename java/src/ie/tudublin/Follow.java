package ie.tudublin;
import processing.data.Table;
import processing.data.TableRow;
//start of class
public class Follow {

  private String word;
  private int count;

  //getters and setters
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }

  //constructor method
  public Follow(String word, int count){

    this.word = word;
    this.count = count;
    

  }
}