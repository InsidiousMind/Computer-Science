
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
			for(int i = 0; i < numberCharArray.length; i++){
				if (checkEquality(numberCharArray[i], valCharArray[i]) == true){
					//do nothing
				}else{
					break;
				}
			}
		}else{
			return false;
		}
		return true;
	}
	//add two UUI's
	public void add(UUI val) {
		
	}
	//another String Method?
	public String toStringf() {
		return null;
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
}
