package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {
	
	
	public void init() throws IOException{
		
		ServerSocket server = new ServerSocket(9090);
		
		Socket socket = server.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		StringBuffer headerBuffer = new StringBuffer();
		
		Header header = HttpHeaderUtil.parseHeader(br);
		
		System.out.println(header);
/*		while((str = br.readLine()) != null){
			
			headerBuffer.append(str + "\n");
			
			if("".equals(str)){
				break;
			}
		}*/
		
		
		
		
/*		String header = headerBuffer.toString();
		
		
		String url = HttpHeaderUtil.getUrl(header);
		
		String method = HttpHeaderUtil.getMethod(header);
		
		String host = HttpHeaderUtil.getHost(header);
		*/
		socket.close();
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.init();
	}
}
