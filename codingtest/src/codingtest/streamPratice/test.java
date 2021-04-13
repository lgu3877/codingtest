package codingtest.streamPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	final int TEMPSCORE = 20;
	final int GOODTEMP = 22;
	
    public int[] solution(int[][] data) {
    	ArrayList<Integer[]> list = (ArrayList<Integer[]>) Arrays.stream(data).map(i -> Arrays.stream(i).boxed().toArray(Integer[]::new)).collect(Collectors.toList());
    	
    	

        for(int i=0; i < data.length; i++) {
        	int weatherTMP = 0;
        	int totalScore = 0;
        	
//        	Integer[] tmp = new Integer();
        	
        	for(int j=0; j < data[i].length; j++) {
        		
        		
        		switch(j) {
	        		case 0 :
	        			weatherTMP = data[i][j];
	        			break;
	        		case 1:
//	        			list checkBadDay(weatherTMP, data[i][j]) ? "" ;
	        			totalScore += convertWeatherToScore(weatherTMP, data[i][j]); 
	        			break;
	        		case 2: 
	        			totalScore += convertTemperatureToScore(data[i][j]);
	        			break;
        		}
        		
        	}
//        	list.add(totalScore);
        }
        
        
        
        return new int[] {1};
    }
    
    private boolean checkBadDay(int weather, int rainSnow) {
    	if(weather == 4 || rainSnow == 1)
    		return false;
    				
    	return true;
    }
    
    private boolean checkBadDay(int temperature) {
    	if(temperature >= 30 || temperature <= 0)
    		return false;
    	
    	return true;
    }
    
    
    // 날씨를 점수로 바꾸어주는 함수입니다.
    private int convertWeatherToScore(int weather, int rainSnow) {
    	if(weather < 0 ) return 0;
    	
    	int weatherData = 0;
    	if(rainSnow == 0) {
    		switch(weather) {
	    		case 1 :
		    	case 2 :
		    		weatherData = 20;
		    		break;
		    		
		    	case 3:
		    		weatherData = 17;
		    		break;
		    		
		    	// 흐림
		    	case 4:
		    		weatherData = 10;
		    		break;
	    	}
    	}
    	
    	
    	switch(rainSnow) {
    	
    	// 비
    	case 1 :
    		weatherData = 5;
    		break;
    		
    	// 눈
    	case 2:
    		weatherData = 14;
    		break;
    	}
    	
    	// 20보다 크면 20을 반환하고 그게 아니면 그대로 반환해준다.
    	return (weatherData > 20) ? 20 : weatherData;
    }
    
    
    // 온도를 점수로 변환시켜주는 함수입니다.
    private int convertTemperatureToScore(int temperature) {
    	
    	int convertData = TEMPSCORE - Math.abs(GOODTEMP - temperature);
    	
    	// 20보다 크면 20을 반환하고 그게 아니면 그대로 반환해준다.
    	return (convertData > 20) ? 20 : convertData ;
    	
    }
}
public class test {

	public static void main(String[] args) {
		Solution sl = new Solution();
			System.out.println(sl.solution(new int[][] {{1,0,11},{3,1,15},{2,0,16},{4,0,17},{2,0,15},{2,1,14},{2,0,12}}));;
		
				
	}
}
