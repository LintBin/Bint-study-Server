package server.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpRequest {
	
	protected HashMap<String,String> header ;
	protected ArrayList<Object> cookies;
	//protected ParameterMap parameters;
	
	
	public void readReader(InputStream inputStream) throws IOException{
		
		byte[] buffer = new byte[2048];
		
		
		int i = inputStream.read(buffer);
		
		
		
		
	}
	
	
}
