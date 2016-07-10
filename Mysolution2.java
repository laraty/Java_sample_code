public class Mysolution2{
	public int solution(String s){
		
		if (s.length==0||s=null) return 0;
		String[] strArray = s.split("/n");
        int n = strArray.length;
		int len = 0;
		int level=0;
		String routh = "";
		
		for (String string : strArray){
			int spacenum = 0; 
			for(int j=0;j< string.length();j++){
				if(cur.charAt(j)==' '){
					spacenum++;
				}else{
					break;
				}
			}
			
			if (spacenum==0 && !(string.contains(".")) {
				level=0;
				routh = string;
			}
			else if (spacenum>0 && !(string.contains(".") && spacenum==level){
				level+=1;
				routh=routh+"/"+string;
			}
			else if (spacenum>0 && (string.contains(".") &&(string.contains(“.jpeg”)||string.contains(“.png”)||string.contains(“.gif”){
				len=len+routh.length();
			}
			else if ( spacenum>0 && !(string.contains(".")&& spacenum<level){
				int index= StringUtils.ordinalIndexOf( routh, "/", spacenum);
				routh=routh.substrung(0, index)+string;
			}
			else{
				continue;
			}

				 

				
			
			
			
			
		}

		
		return len;
	}
} 