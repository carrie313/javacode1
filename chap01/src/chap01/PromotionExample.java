package chap01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; 
		System.out.println(intValue);
	
		char charValue = '��';
		intValue = charValue;
		
		byteValue = (byte) intValue;
}

	}


