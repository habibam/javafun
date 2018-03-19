public class StringManipulator {
	String result;
	int a;
    public String trimAndConcat(String string1, String string2) {
		String new1 = string1.trim();
		String new2 = string2.trim();
		String result = new1.concat(new2);
		return result;
		
    }
	public Integer getIndexOrNull(String string1, char char1) {
		int a = string1.indexOf(char1);
		if (a == -1){
			return null;
		} 
		return a;
		
    }
	public Integer getIndexOrNull(String string1, String string2) {
		int a = string1.indexOf(string2);
		if (a == -1){
			return null;
		} 
		return a;
    }
	public String concatSubstring(String string1, int number1, int number2, String string2) {
		String newstring = string1.substring(number1, number2);
		String result = newstring.concat(string2);
		return result;
    }
	
}