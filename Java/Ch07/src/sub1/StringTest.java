package sub1;

/*
 * 날짜 : 2026/05/11
 * 이름 : 허민재
 * 내용 : JAVA 내장클래스 실습 - String
 */
public class StringTest {
   public static void main(String[] args) {
      // 문자열 = 문자 + 배열
      String str1 = "Hello"; // 암시적, 문자열 리터럴
      String str2 = new String("Hello"); // 명시적

      System.out.println("str1 : " + str1);
      System.out.println("str1 : " + str2);

      // 문자열 비교
      if (str1 == str2) {
         System.out.println("st1, st2 주소값이 같다.");
      } else {
         System.out.println("st1, st2 주소값이 다르다.");
      }
      
      if (str1.equals(str2)) {
          System.out.println("st1, st2 문자열이 같다.");
       } else {
          System.out.println("st1, st2 문자열이 다르다.");
       }
   }
}
