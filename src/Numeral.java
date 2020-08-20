public class Numeral extends Expression{
    private int value;
    public Numeral(int value){
        this.value = value;
    }
    public Numeral(){}

    @Override
    public String toString() {
        return "Numeral{" +
                "value=" + value +
                '}';
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
