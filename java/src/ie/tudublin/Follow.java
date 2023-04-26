package ie.tudublin;

//import java.util.ArrayList;

//start of class
public class Follow {

  //fields
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

  //accessor method
  public Follow(){


  }


  //ToString
  @Override
    public String toString() {
      return word + count;
    }

}