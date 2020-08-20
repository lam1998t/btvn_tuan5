public class Square extends Expression{
    private Expression expression;
    Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Square{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public double evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
