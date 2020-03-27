import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;


public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is the url that the program will connect to.
				String output = getUrlContents("https://ryandan22.github.io/CIT360/xxx.json");
				//String output = getUrlContents("https://apis.google.com/js/client.js?onload=onLoad");
				
				//This is the actual output. It will print out the html file for the url provided above.
				System.out.println(output);

	}
	
	private static String getUrlContents(String theUrl) {
			
			// Try/catch statement to catch an exceptions being thrown. 
			StringBuilder content = new StringBuilder();
			
			try {
				
				//URL object.
				URL url = new URL(theUrl);
				
				//URLConnection object
				URLConnection urlConnection = url.openConnection();
				
				System.out.println("\nSending 'GET' request to URL : " + theUrl + "\n");
								
				//BufferedReader object.
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				
				String line;
				
								
				// Read from the urlconnection through buffered reader.
				while((line = bufferedReader.readLine()) != null) {
					
					content.append(line + "\n");
					
						
				}
				
				bufferedReader.close();
				
			}
			
			catch(Exception e)
			
			{
				
				e.printStackTrace();
			
			}
			
			return content.toString();
	}

}