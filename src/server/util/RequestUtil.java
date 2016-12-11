package server.util;

import java.util.ArrayList;
import java.util.List;

import server.http.Cookie;

public class RequestUtil {
	
	
	public Cookie[] parseCookieHeader(String header){
		
		//如果header里面没有带cookies
		if ((header == null) || (header.length()< 1) ){
			return (new Cookie[0]); 
		}
		
		List<Cookie> cookies = new ArrayList<>();
		while(header.length() > 0){
			
			//用冒号来判断是否存在Cookies
			int semicolon = header.indexOf(":");
			
			if(semicolon < 0){
				semicolon = header.length();
			}
			
			if(semicolon == 0 ){
				break;
			}
			
			String token = header.substring(0,semicolon);
			
			if(semicolon < header.length()){
				header = header.substring(semicolon) + 1;
			}else{
				header = "";
			}
			
			
			try{
				int equals = token.indexOf("=");
				
				if(equals > 0){
					String name = token.substring(0,equals).trim();
					
					String value = token.substring(equals+1).trim();
					
					cookies.add(new Cookie(name , value));
				}
				
			}catch(Throwable e){
				e.printStackTrace();
			}
			
			return cookies.toArray(new Cookie[cookies.size()]);
		}
		
		return null;
	}
}
