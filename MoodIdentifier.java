import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MoodIdentifier 
{
	List<String> conversation;
	
	int count_angry = 0;
	int count_happy = 0;
	int count_sad = 0;
	int count_wow = 0;
	int count_love = 0;
	
	ArrayList<String> happy = new ArrayList<>(Arrays.asList("happy","great", "gay", "joyous", "lucky", "fortunate", "delighted", "overjoyed", "gleeful", "thankful", "important", "festive", "ecstatic", "satisfied", "glad", "sunny", "merry", "elated", "jubilant", "enthusiastic", "amused", "calm", "hopeful", "inspired", "jovial", "smile", "upbeat", "cheerful", "contented", "gratified", "joyful", "lively", "merry", "playful", "pleased", "proud", "rejuvenated", "awe-filled", "blissful", "ecstatic", "egocentric", "enthralled", "euphoric", "exhilarated", "giddy", "radiant", "hilarious", "ludicrous", "whimsical", "mirthful", "buoyant", "felicitous", "blithesome", "convivial", "exuberant", "optimistic", "joking", "funny", "joke", "prank", "trick", "burlesque", "aricature", "lampoon", "mock", "kidding", "comedy", "humorous", "hysterical", "flippant", "facetious",  "laughable", "comical", "bizarre"));
	ArrayList<String> sad = new ArrayList<>(Arrays.asList("sad","apathetic","constantly irritated","depressed","discouraged","disinterested","dispirited","feeling worthless","helpless","humorless","impulsive","indifferent","isolated","lethargic","listless","melancholy","pessimistic","purposeless","withdrawn","hopeless","joyless","miserable","morbid","overwhelmed","passionless","sullen","agonized","anguished","bleak","death-seeking","devastated","doomed","gutted","nihilistic","numbed","self-destructive","suicidal","tormented","tortured","contemplative","grounded","listless","low","regretful","wistful","boring","tiring","tragic","mourn","grief","agony","nervous","timid","humiliated","crushed"));
	ArrayList<String> angry = new ArrayList<>(Arrays.asList("angry","annoyed","apathetic","bored","certain","cold","crabby","cranky","critical","cross","detached","displeased","frustrated","impatient","indifferent","irritated","peeved","rankled","affronted","aggravated","angry","antagonized","arrogant","bristling","exasperated","incensed","indignant","inflamed","mad","offended","resentful","riled up","sarcastic","aggressive","appalled","belligerent","bitter","contemptuous","disgusted","furious","hateful","hostile","irate","livid","menacing","outraged","ranting","raving","seething","spiteful","vengeful","vicious","vindictive","violent","reckless","disappointed","rebellious","tenacious"));
	ArrayList<String> wow = new ArrayList<>(Arrays.asList("wow","Surprised","shocked","amazed","speechless","astonished","astounded","thunderstruck","staggered","awe","bewilderment","curiosity","jolt","miracle","wonder","abruptness","epiphany","eureka","godsend","incredulity","marvel","unexpected","unforeseen","eye-opener","delighted","horrified","excited","thrilled","unpredictable","unanticipated","abrupt","sudden","electrify","perplex","stupefy","petrify","blown","startle","stun","flabbergast","stagger","ridiculous","atrocious"));
    ArrayList<String> love = new ArrayList<>(Arrays.asList("love","considerate","affectionate","sensitive","tender","devoted","attracted","passionate","admiration","warm","touched","sympathy","close","loved","comforted","drawn toward","adore","affection","amore","amour","cherish","enchant","head over wheels","idolize","rapture","spark","yearning","serene","compassion","sympathy","temperament","zest","sentimental","loving","tender","visionary","maudlin","dreamy","extravagant","romance","desire","beloved","fondness","dearest","infatuation","warmth","crush","amorousness","relationship","affinity","fond of","loved one","darling"));

	public MoodIdentifier(List<String> conversation_list) 
	{
		this.conversation = conversation_list;
		for (int i = 0; i < conversation.size(); i++)
		{
			for (int j = 0; j < angry.size(); j++)
			{
				if (conversation.get(i) == angry.get(j))
				{
					count_angry++;
					break;
				}
			}
			
			for (int j = 0; j < happy.size(); j++)
			{
				if (conversation.get(i) == happy.get(j))
				{
					count_happy++;
					break;
				}
			}
			
			for (int j = 0; j < love.size(); j++)
			{
				if (conversation.get(i) == love.get(j))
				{
					count_love++;
					break;
				}
			}
			
			for (int j = 0; j < wow.size(); j++)
			{
				if (conversation.get(i) == wow.get(j))
				{
					count_wow++;
					break;
				}
			}
			
			for (int j = 0; j < sad.size(); j++)
			{
				if (conversation.get(i) == sad.get(j))
				{
					count_sad++;
					break;
				}
			}
		}
	}
	
	public String getLargest()
	{
		int intArray[] = {count_angry, count_happy, count_sad, count_love, count_wow};
		int largest = 0;
		int var = 0;
	
		for (int q = 0; q < intArray.length; q++)
		{
			if (intArray[q] > largest)
			{
				largest = intArray[q];
				var = q;
			}
		}
		
		if (var == 0)
		{
			return "angry";
		}
		else if (var == 1)
		{
			return "happy";
		}
		else if (var == 2)
		{
			return "sad";
		}
		else if (var == 3)
		{
			return "love";
		}
		else
		{
			return "wow";
		}
	}
	
}
