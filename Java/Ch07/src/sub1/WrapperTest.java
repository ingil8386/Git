package sub1;

public class WrapperTest {
	public static void main(String[] args) {
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;

		Integer box1 = var1;
		Double box2 = var2;
		Boolean box3 = var3;

		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);

		String str1 = "1";
		String str2 = "3.14";
		String str3 = "false";
		
		Integer value1 = Integer .parseInt(str1);
		Double value2 = Double .parseDouble(str2);
		Boolean value3 = Boolean .parseBoolean(str3);
		
		Integer w1 = Integer.valueOf(str1);
		Double w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);
		
		String s1 = w1.toString();
	}
}
