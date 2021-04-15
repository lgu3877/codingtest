package codingtest.exem;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


// 6. Http Header 출력
class Resolve6 {
	public void solution(String url) {
		try {
			 
			URL obj = new URL(url);
			URLConnection conn = obj.openConnection();

			Map<String, List<String>> map = conn.getHeaderFields();
			
			for (Map.Entry<String, List<String>> entry : map.entrySet()) 
				System.out.println((entry.getKey()== null ? "" : entry.getKey() + " : " ) + entry.getValue());
			
		} catch (Exception e) {
			 e.printStackTrace();
		}

	}
}

public class Solution6 {

	public static void main(String[] args) throws IOException {
		Resolve6 resolve = new Resolve6();
		resolve.solution("http://www.ex-em.com/");
	}
}
