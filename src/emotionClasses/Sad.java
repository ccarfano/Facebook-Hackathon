import java.util.List;

public class Sad implements Emotions
{
	List<String> sad;
	
	public Sad() 
	{
		//sad = function call to get list version from the text file
	}
	
	public void add(String key)
	{
		sad.add(key);
	}
	
	public void remove(String key)
	{
		sad.remove(key);
	}
	
	public Boolean duplicates(String key)
	{
		for (int i = 0; i < sad.size()-1; i++)
		{
			if (sad.get(i) == sad.get(i+1))
			{
				sad.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
