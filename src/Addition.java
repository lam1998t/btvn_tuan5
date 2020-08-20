public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
