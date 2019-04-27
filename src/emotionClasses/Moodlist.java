package emotionClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Moodlist{
  ArrayList<String> happy = new ArrayList<>(Arrays.asList("happy"));
  ArrayList<String> sad = new ArrayList<>(Arrays.asList("sad"));
  ArrayList<String> angry = new ArrayList<>(Arrays.asList("angry"));
  ArrayList<String> love = new ArrayList<>(Arrays.asList("love"));
  ArrayList<String> wow = new ArrayList<>(Arrays.asList("wow"));


  public static void moodadd(ArrayList<String> mood, String mymood){
    if(mood.contains(mymood)==false){
      mood.add(mymood);
      }

  }

  public static void moodremove(ArrayList<String> mood, String mymood){
    if(mood.contains(mymood)){
      mood.remove(mymood);
      }

  }

}
