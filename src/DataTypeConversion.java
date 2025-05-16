
public class DataTypeConversion {
	/*
	B1: 31 capacity
	B2: 51 capaity
	Task: TRANSFER B1 > B2 - POSSIBLE SINCE WE AER ABLE TO TRANSER ALL DATA
	Task2: B2 > B1 -POSSIBLE BUT THEIR WILL BE DATA LOSS SINCE WE CAN'T 
	TRANSFER ALL DATAT TO B1
	*/

	public static void main(String[] args) {
		byte b1=12;
		int i1=b1;
		System.out.println(b1);
		System.out.println(i1);
		
	/* blow will not wok since i2 > b2 */
		//int i2=67;
		//byte b3=i2;
	
		//System.out.println(i2);
		//System.out.println(b3);
		/* blow will not wok since i2 > b2 unless we accept the data loss*/
		//int i3=67;
		//byte b3=(byte)i3;
		
		//System.out.println(i3);
		//System.out.println(b3);
		
	/* convert decimal value */
		float f1 = 67.89f;
		int i4 = (int) f1;
		
		System.out.println(f1);//67.89
		System.out.println(i4);//67
		
		int i5 = 89;
		double d1 = i5;
		
		System.out.println(i5);//89
		System.out.println(d1);//89.0
		
		char k1 = 'a';
		int i6 =k1;
		
		System.out.println(k1);//89
		System.out.println(i6);//89.0
		
		String st2 = "678";
		int i10 = Integer.parseInt(st2);
		/*
		System.out.println(i5);//89
		System.out.println(d1);//89.0
		
		int i61=98;
		char c2=(char) i6;
		System.out.println(i61);//98
		System.out.println(c2);//b
		*/
		//String - Concatenation
		//numeric - + - addition
		String st1 = "678";
		int i7 = Integer.parseInt(st1);
		System.out.println(st1+1);//6781 the plus 1 is a confirmation the conversion is being done. 
		System.out.println(i7+1);//679
	}

}
