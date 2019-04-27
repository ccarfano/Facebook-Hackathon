import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MoodPlay {

	public static void main(String[] args) 
	{
		List<String> list = Files.readAllLines(Paths.get("conversation.txt"));
		
		String playlist_recieved = SpotifyHandler();
		System.out.println("Would you like to play this playlist: " + playlist_recieved);

	}

}
