public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy=new MathCalculatorProxy();
        double result=proxy.add(10,20);
        System.out.println("10+20="+result);

    }
}
