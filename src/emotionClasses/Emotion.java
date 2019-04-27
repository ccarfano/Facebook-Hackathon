package emotionClasses;

import java.util.List;

public abstract class Emotion 
{
	protected List<String> list;

	public Emotion(List<String> emotion_list) 
	{
		this.list = emotion_list;
	}

	public void add(String key)
	{
		list.add(key);
	}
	
	public void remove(String key)
	{
		list.remove(key);
	}
	
	public Boolean duplicates(String key)
	{
		for (int i = 0; i < list.size()-1; i++)
		{
			if (list.get(i) == list.get(i+1))
			{
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
