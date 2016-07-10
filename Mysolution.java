public class Mysolution{
	public int solution(int X){
		String xString = Integer.toString (X);
		int max = 0;
		for (int i = 2; i<xString.length(); i++){
			if (xString.charAt(i-2)==xString.charAt(i-1) && xString.charAt(i)!=xString.charAt(i-1)){
				String newString= xString.substring(0,i-1)+xString.substring(i);
				max=Math.max(Integer.valueOf(newString), max);	
			}
				
		} 
		return max;	
	}


}


