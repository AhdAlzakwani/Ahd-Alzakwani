



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.*;

public class Executor {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://randomuser.me/api");
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.setRequestMethod("GET");
		conn.connect();
		
		int responceCode = 0;
		try {
			responceCode = conn.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (responceCode != 200) {
			throw new RuntimeException("HttpURLConnection"+responceCode );
			
		}else {
			String inline = "";
		    Scanner scanner = null;
			try {
				scanner = new Scanner(url.openStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		    while (scanner.hasNext()) {
		       inline += scanner.nextLine();
		    }
			scanner.close();
            System.out.println(inline);

        	Gson gsonParser = new Gson();
			RandomUserAPI result = gsonParser.fromJson(inline, RandomUserAPI.class);  
			 System.out.println(result.getInfo().getResults());

	}

}}
