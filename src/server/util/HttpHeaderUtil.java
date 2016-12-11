package server.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import server.Header;

public class HttpHeaderUtil {
	
	public static String getUrl(String header){
		Pattern pattern = Pattern.compile(".* (.*) HTTP.*");
		Matcher matcher = pattern.matcher(header);
		
		if(matcher.matches()){
			String url = matcher.group(1);
			return url;
		}
		
		return null;
	}
	
	
	public static String getMethod(String header){
		String[] fieldArray = header.split("\n");
		String firstRow = fieldArray[0];
		
		Pattern pattern = Pattern.compile("(.*) /.*");
		Matcher matcher = pattern.matcher(firstRow);
		
		if(matcher.matches()){
			String method = matcher.group(1);
			return method;
		}
		
		return null;
	}
	
	
	public static String getHost(String header){
		Pattern pattern = Pattern.compile("Host: (.*) \n*");
		Matcher matcher = pattern.matcher(header);
		
		if(matcher.matches()){
			String host = matcher.group(1);
			return host;
		}
		
		return null;
	}
	
	
	public static Header parseHeader(BufferedReader br) throws IOException{
		
		String str ;
		Header header = new Header();
		
		while((str = br.readLine()) != null){
			
			parseMetod(header,str);
			
			parse(header, str);
			
			if("".equals(str)){
				break;
			}
		}
		
		return header;
	}
	
	
	
	public static Header parseMetod(Header header,String str){
		
		if(str == null || "".equals(str)){
			return header;
		}
		
		if(str.startsWith("GET")){
			header.setMethod("GET");
		}
		
		if(str.startsWith("POST")){
			header.setMethod("POST");
		}
		
		Pattern pattern = Pattern.compile(".* (.*) .*");
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.matches()){
			String url = matcher.group(1);
			header.setUrl(url);
		}
		
		return header;
	}
	
	
	public static Header parse(Header header ,String str){
		
		if(str == null || "".equals(str)){
			return header;
		}
		
		if(str.startsWith("Host")){
			String host = str.replace("Host: ", "") ;
			header.setHost(host);
		}
		
		if(str.startsWith("Connection")){
			String connection = str.replace("Connection: ", "") ;
			header.setConnection(connection);
		}
		
		if(str.startsWith("Cache-Control")){
			String cacheControl = str.replace("Cache-Control: ", "") ;
			header.setCacheControl(cacheControl);
		}
		
		if(str.startsWith("Upgrade-Insecure-Requests")){
			String upgradeInsecureRequests = str.replace("Upgrade-Insecure-Requests: ", "");
			header.setUpgradeInsecureRequests(upgradeInsecureRequests);
		}
		
		if(str.startsWith("User-Agent")){
			String userAgent = str.replace("User-Agent: ", "");
			header.setUserAgent(userAgent);
		}
		
		if(str.startsWith("Accept")){
			String accept = str.replace("Accept: ", "");
			header.setAccept(accept);
		}
		
		if(str.startsWith("Accept-Encoding")){
			String acceptEncoding = str.replace("Accept-Encoding: ", "");
			header.setAcceptEncoding(acceptEncoding);
		}
		
		if(str.startsWith("Accept-Language")){
			String acceptLanguage = str.replace("Accept-Language: ", "");
			header.setAcceptLanguage(acceptLanguage);
		}
		
		if(str.startsWith("Cookie")){
			String cookie = str.replace("Cookie: ", "");
			header.setAcceptLanguage(cookie);
		}
		
		return header;
	}
	
	
}
