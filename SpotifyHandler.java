
import java.net.*;
import java.io.*;
import java.util.*;

import javax.net.ssl.HttpsURLConnection;


public class SpotifyHandler {
	private long token_timeout = 0;
	private String access_token = "";
	private String token_type = "";
	
	public void requestAccessToken() throws IOException {
		//ArrayList <1>token <2>token_value <3>type <4>bearer
				ArrayList<String> token = new ArrayList<String>();
				String command1 = "python3 getToken.py";
				String line;
				Process p;
				try {
			        p = Runtime.getRuntime().exec(command1);
			        p.waitFor();

			        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			        while ((line = input.readLine()) != null) {
			          System.out.println(line);
			          String[] parts = line.split("\"");
			          int i = 1;
			          
			          this.access_token = parts[3];
			          this.token_type = parts[7];
			          this.token_timeout = (System.currentTimeMillis()/1000)+3600;
			        }
			        input.close();

			    } catch (Exception e) {
			        e.printStackTrace();
			    }
	}
	
	public String requestPlayList(String query) {
		String JSON = "";/////////////////////shitty verson of send query need to be refined for address search
		String command1 = "python3 getList.py \""+query+"\" "+this.access_token;
		String line;
		Process p;
		try {
	        p = Runtime.getRuntime().exec(command1);
	        p.waitFor();
	        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        while ((line = input.readLine()) != null) {
	          JSON += line;
	        }
	        input.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
		return JSON;
	}
	
	
	
}
