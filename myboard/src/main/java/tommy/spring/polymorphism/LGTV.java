package tommy.spring.polymorphism;

public class LGTV implements TV{
   public LGTV() {
      System.out.println("LGTV 객체 생성");
   }
   
   @Override
   public void powerOn() {
      System.out.println("LGTV 전원을 켠다");
   }
   @Override
   public void powerOff() {
      System.out.println("LGTV 전원을 끈다");
   }
   @Override
   public void volumeUp() {
      System.out.println("LGTV 볼륨을 올린다");      
   }
   @Override
   public void volumeDown() {
      System.out.println("LGTV 볼륨을 내린다");
      
   }
   
}