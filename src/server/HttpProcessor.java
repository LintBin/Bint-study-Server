package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import server.http.Cookie;
import server.http.HttpResponse;
import server.util.HttpHeaderUtil;


public class HttpProcessor {
	
	private HttpResponse response;

	public HttpProcessor(HttpConnector connection){
		
		
		
	}
	
	
	
	public void parseRequest( InputStream input ,OutputStream output) throws IOException{
		BufferedReader reader = null;
		
		reader = new BufferedReader(new InputStreamReader(input));
		 
		String firstLine = reader.readLine();
		
		
		String method = HttpHeaderUtil.getMethod(firstLine);
		
		String url = HttpHeaderUtil.getUrl(firstLine);
		
		
		String paramsUri = null;
		
		int index = url.indexOf("?");
		
		if(index != -1 ){
			paramsUri = url.substring(index, url.length()-1);
		}
		
		
	}
	
		
		
	
	
	public void process(Socket socket){
		
	}
	
	
	
	
}
