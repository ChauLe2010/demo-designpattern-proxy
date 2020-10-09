public class MathCalculatorProxy  implements Calculator{
    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double first, double second) {
        if(first/2+second/2>=Double.MAX_VALUE/2)
            throw new RuntimeException("Out of range");
        if(first/2+second/2<=Double.MIN_VALUE/2)
            throw new RuntimeException("Out of range");
        return mathCalculator.add(first,second);
    }

    @Override
    public double sub(double first, double second) {
        return 0;
    }

    @Override
    public double mul(double first, double second) {
        return 0;
    }

    @Override
    public double div(double first, double second) {
        return 0;
    }
}
