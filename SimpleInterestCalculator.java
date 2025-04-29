public class SimpleInterestCalculator{
public static void calculateSimpleInterest(double principal , double rate , double time){
System.out.println("Simple Interest:" + (principal*rate*time)/100);
}
public static void main(String [] args){
calculateSimpleInterest(2800.0,5.0,2.0);
}
}