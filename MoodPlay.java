import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MoodPlay 
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>(); 
		/*
		try {
			list = Files.readAllLines(Paths.get("conversation.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		list.add("I");
		list.add("am");
		list.add("sad");
		
		MoodIdentifier mood = new MoodIdentifier(list);
		SpotifyHandler playlist = new SpotifyHandler(mood.getLargest());
		String playlist_recieved = playlist.getPlayList();
		System.out.println("Would you like to play this playlist: " + playlist_recieved);

	}

}
