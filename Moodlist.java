import java.util.ArrayList;
import java.util.Arrays;

public class Moodlist{
  ArrayList<String> happy = new ArrayList<>(Arrays.asList("happy","great", "gay", "joyous", "lucky", "fortunate", "delighted", "overjoyed", "gleeful", "thankful", "important", "festive", "ecstatic", "satisfied", "glad", "sunny", "merry", "elated", "jubilant", "enthusiastic", "amused", "calm", "hopeful", "inspired", "jovial", "smile", "upbeat", "cheerful", "contented", "gratified", "joyful", "lively", "merry", "playful", "pleased", "proud", "rejuvenated", "awe-filled", "blissful", "ecstatic", "egocentric", "enthralled", "euphoric", "exhilarated", "giddy", "radiant", "hilarious", "ludicrous", "whimsical", "mirthful", "buoyant", "felicitous", "blithesome", "convivial", "exuberant", "optimistic", "joking", "funny", "joke", "prank", "trick", "burlesque", "aricature", "lampoon", "mock", "kidding", "comedy", "humorous", "hysterical", "flippant", "facetious",  "laughable", "comical", "bizarre"));
  ArrayList<String> sad = new ArrayList<>(Arrays.asList("sad","apathetic","constantly irritated","depressed","discouraged","disinterested","dispirited","feeling worthless","helpless","humorless","impulsive","indifferent","isolated","lethargic","listless","melancholy","pessimistic","purposeless","withdrawn","hopeless","joyless","miserable","morbid","overwhelmed","passionless","sullen","agonized","anguished","bleak","death-seeking","devastated","doomed","gutted","nihilistic","numbed","self-destructive","suicidal","tormented","tortured","contemplative","grounded","listless","low","regretful","wistful","boring","tiring","tragic","mourn","grief","agony","nervous","timid","humiliated","crushed"));
  ArrayList<String> angry = new ArrayList<>(Arrays.asList("angry","annoyed","apathetic","bored","certain","cold","crabby","cranky","critical","cross","detached","displeased","frustrated","impatient","indifferent","irritated","peeved","rankled","affronted","aggravated","angry","antagonized","arrogant","bristling","exasperated","incensed","indignant","inflamed","mad","offended","resentful","riled up","sarcastic","aggressive","appalled","belligerent","bitter","contemptuous","disgusted","furious","hateful","hostile","irate","livid","menacing","outraged","ranting","raving","seething","spiteful","vengeful","vicious","vindictive","violent","reckless","disappointed","rebellious","tenacious"));
  ArrayList<String> wow = new ArrayList<>(Arrays.asList("wow","Surprised","shocked","amazed","speechless","astonished","astounded","thunderstruck","staggered","awe","bewilderment","curiosity","jolt","miracle","wonder","abruptness","epiphany","eureka","godsend","incredulity","marvel","unexpected","unforeseen","eye-opener","delighted","horrified","excited","thrilled","unpredictable","unanticipated","abrupt","sudden","electrify","perplex","stupefy","petrify","blown","startle","stun","flabbergast","stagger","ridiculous","atrocious"));
  ArrayList<String> love = new ArrayList<>(Arrays.asList("love","love","considerate","affectionate","sensitive","tender","devoted","attracted","passionate","admiration","warm","touched","sympathy","close","loved","comforted","drawn toward","adore","affection","amore","amour","cherish","enchant","head over wheels","idolize","rapture","spark","yearning","serene","compassion","sympathy","temperament","zest","sentimental","loving","tender","visionary","maudlin","dreamy","extravagant","romance","desire","beloved","fondness","dearest","infatuation","warmth","crush","amorousness","relationship","affinity","fond of","loved one","darling"));


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
  
   public static Integer moodcount(ArrayList<String> convo, ArrayList<String> mood ){
    convo.retainAll(mood);
    System.out.println(convo.size());
    return convo.size();

  }

}
