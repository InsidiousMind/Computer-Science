
public class UUI {
	String number;
	//UUI Constructor
	public UUI(String string) {
		number = string;
	}
	//Definitely "not equal to"
	public boolean NE(UUI val) {
		char[] numberCharArray = this.number.toCharArray(); 
		char[] valCharArray =  val.number.toCharArray();
			
		if(numberCharArray.length == valCharArray.length){
			for(int i = 0; i < numberCharArray.length; i++){
				if (checkEquality(numberCharArray[i], valCharArray[i]) == true){
					return true;
				}else{
					return false;
				}
			}
		}else{
			return true;
		}
		return true;
	}
	//add two UUI's
	public void add(UUI val) {
	 
		char[] numberCharArray = makeArray(this.number);
		char[] valCharArray = makeArray(val.number);

		if(numberCharArray.length == 2 && numberCharArray[1]=='0'){
		
			numberCharArray = valCharArray;
			
		}else if(numberCharArray.length > valCharArray.length){
			int j = numberCharArray.length - 1;
			for(int i = valCharArray.length-1; i >= 0; i-- ){
				 int tmp;
				 tmp =  Character.getNumericValue(numberCharArray[j]) + Character.getNumericValue(valCharArray[i]);

				 	
				 if(tmp > 10){
					numberCharArray[j-1] += 1;  
					numberCharArray[j] = Integer.toString(tmp%10).charAt(0);
					valCharArray[i]= '0';
				 }else{
					numberCharArray[j] = Integer.toString(tmp).charAt(0); 
					valCharArray[i] = '0';
				 }
				 
				 j--;
			}
		//NUMBER is accumulator
		}else if(numberCharArray.length < valCharArray.length){
			int j = valCharArray.length - 1;
			
			for(int i = numberCharArray.length-1; i >= 0; i-- ){
				 
				 int tmp;
				 tmp =  Character.getNumericValue(numberCharArray[j]) + Character.getNumericValue(valCharArray[i]);
 
				 if(tmp >= 10){
				
				 }else{
					 numberCharArray[i] = Integer.toString(tmp).charAt(0);
					 valCharArray[j] = '0';
				 }
				 
				 j--;
			
			}
		}else{
			int j = numberCharArray.length -1;
			for(int i = valCharArray.length-1; i >= 0; i-- ){
				 int tmp;
				 tmp =  Character.getNumericValue(numberCharArray[j]) + Character.getNumericValue(valCharArray[i]);
				 System.out.println(tmp); 
				 if(tmp > 10){
					 //HERERE
					 int k = 1;
					 if((Character.getNumericValue(numberCharArray[j-k]) + 1) == 10){
						numberCharArray[j-k] = '0';
						k++;
						numberCharArray[j-k] = Integer.toString(Character.getNumericValue(numberCharArray[j-k]) +1).charAt(0);
					 }
					numberCharArray[j-1] = Integer.toString(Character.getNumericValue(numberCharArray[j-1]) + 1).charAt(0);  
					numberCharArray[j] = Integer.toString(tmp%10).charAt(0);
					valCharArray[i]= '0';
				 }else{
					numberCharArray[j] = Integer.toString(tmp).charAt(0); 
					valCharArray[i] = '0';
				 }
				 
				 j--;
			}
		}
		String endCalc = "";
		for(int i =0; i < numberCharArray.length; i++){
			endCalc += numberCharArray[i];
		}
		this.number = endCalc;
	}
	//another String Method?
	public String toString(){
		return number;
	}
	public String toStringf() {
		return number;
	}
	//don't really need this here but it's good for readability
	private boolean checkEquality(char charA, char charB){
		int a, b;
		a = (int)charA;
		b = (int) charB;
		if (a == b){
			return true;
		}else{
			return false;
		}
	}
	private char[] makeArray(String str){
		int size = str.length();
		char[] charArr = new char[size + 1];
		if(charArr[0] == '0'){
			
		}else{
			charArr[0] = '0';
		}
		for(int i = 1; i < charArr.length; i++){
			char tmp = str.charAt(i-1);
			charArr[i] = tmp;
		}

	return charArr;	
	}
}