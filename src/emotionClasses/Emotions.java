package emotionClasses;

import java.util.List;
import java.lang.Boolean;
import java.lang.String;

public interface Emotions
{
	/*
	 * Add the key in the List
	 */
	void add(String key);
	
	/*
	 * Remove the key in the List
	 */
	void remove(String key);
	
	/*
	 * Check for duplicates in list,
	 * if true, remove one of the duplicates
	 */
	Boolean duplicates(String key);

}
