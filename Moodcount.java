import java.util.ArrayList;

public class Moodcount{
  public static Integer moodcount(ArrayList<String> convo, ArrayList<String> mood ){
    convo.retainAll(mood);
    System.out.println(convo.size());
    return convo.size();

  }

  public static void main(String[] args){
    ArrayList<String> list1 = new ArrayList<String>();

       // Add values in ArrayList
       list1.add("Hii");
       list1.add("Sad");
       list1.add("Happy");
       list1.add("No");

       // Create ArrayList list2
       ArrayList<String> list2 = new ArrayList<String>();

       // Add values in ArrayList
       list2.add("Sad");
       list2.add("Hii");
       list2.add("Yes");

       moodcount(list1,list2);



  }
}
