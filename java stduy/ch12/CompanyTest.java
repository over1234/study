package ch12;

public class CompanyTest {

   public static void main(String[] args) {

    Company kakao, naver;
    kakao = Company.getCompany();
    naver = Company.getCompany();

    System.out.println(kakao + ", " + naver);
   }
    
}
