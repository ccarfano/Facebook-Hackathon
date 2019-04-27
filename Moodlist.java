import java.util.Arraylist;
import java.util.Arrays;

public class Moodlist{
  ArrayList<String> happy = new ArrayList<>(Arrays.asList(""));
  ArrayList<String> sad = new ArrayList<>(Arrays.asList(""));
  ArrayList<String> angry = new ArrayList<>(Arrays.asList(""));
  ArrayList<String> love = new ArrayList<>(Arrays.asList(""));
  ArrayList<String> wow = new ArrayList<>(Arrays.asList(""));


  public static void moodadd(Arraylist<String> mood, String mymood){
    if(mood.contains(mymood)==false){
      mood.add(mymood);
      }

  }

  public static void moodremove(Arraylist<String> mood, String mymood){
    if(mood.contains(mymood)){
      mood.remove(mymood);
      }

  }

}
