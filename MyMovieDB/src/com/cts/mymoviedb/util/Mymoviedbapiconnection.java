package com.cts.mymoviedb.util;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class Mymoviedbapiconnection {
	
	
// PROVIDE THE API KEY IN THE DASHES
	    public static void main(String[] args) throws Exception{
	    	 URL url = new URL("https://api.themoviedb.org/3/movie/550?api_key=12343b9c442643a0292f6cc5972c77e9");
	            HttpURLConnection con = (HttpURLConnection) url.openConnection();
	            con.setDoOutput(true);
	            con.setRequestMethod("GET");
	            con.setRequestProperty("Content-Type", "application/json"); 
	int status=con.getResponseCode();
	System.out.println(status);
	            BufferedReader br;

	            String output;
	            StringBuffer responseContent=new StringBuffer();

	    if(status>299)
	    {
	    	br=new BufferedReader(new InputStreamReader(con.getErrorStream()));
	    	 while ((output = br.readLine()) != null)
	    	 {
	          responseContent.append(output);
	         }
	     } 
	 else{
	     br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    	
	    	 while ((output = br.readLine()) != null)
	    	 {
	          responseContent.append(output);
	         }
	    	 br.close();
	    }  
	    System.out.println(responseContent.toString());
	    
	}
	}






/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
public class ConnectTmdb {
@RequestMapping("Tmdb")
    public static void main(String[] args) throws Exception{
            URL url = new URL("https://api.themoviedb.org/3/movie/550?api_key=8270161336dcf3f239e1d3e083973fca");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json"); 
int status=con.getResponseCode();
System.out.println(status);
            BufferedReader br;

            String output;
            StringBuffer responseContent=new StringBuffer();

    if(status>299)
    {
    	br=new BufferedReader(new InputStreamReader(con.getErrorStream()));
    	 while ((output = br.readLine()) != null)
    	 {
          responseContent.append(output);
         }
     } 
 else{
     br = new BufferedReader(new InputStreamReader((con.getInputStream())));
    	
    	 while ((output = br.readLine()) != null)
    	 {
          responseContent.append(output);
         }
    	 br.close();
    }  
    System.out.println(responseContent.toString());
    
}
}*/ 
 
