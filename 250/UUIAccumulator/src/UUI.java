
public class UUI {
	String number;
	//UUI Constructor
	public UUI(String string) {
		number = string;
	}
	//Definitely "not equal to"
	public boolean NE(UUI val) {
		char[] numberCharArray = this.number.toCharArray(); 
		char[] valCharArray = val.number.toCharArray();
		if(numberCharArray.length == valCharArray.length){
			
			
		}else{
			
			return false;
		}
	
		
		return false;
	}
	//add two UUI's
	public void add(UUI val) {
		
	}
	//another String Method?
	public String toStringf() {
		return null;
	}

}
