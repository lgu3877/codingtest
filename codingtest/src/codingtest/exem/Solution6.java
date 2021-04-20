package codingtest.exem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


// 6. Http Header 출력
class Resolve6 {
	public void solution(String url) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getByName(url), 80);
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.print("HEAD / HTTP/1.1\r\n");
		pw.print("Host: " + url + "\r\n\r\n");
		pw.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String t;
		while((t = br.readLine()) != null) System.out.println(t);
		br.close();
	}
}

public class Solution6 {

	public static void main(String[] args) throws UnknownHostException, IOException  {
		Resolve6 resolve6 = new Resolve6();
		
		resolve6.solution("www.ex-em.com");
		
	}
	
}
