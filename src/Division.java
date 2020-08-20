public class Division extends  BinaryExpression {
    Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString();
    }

    @Override
    public double evaluate() throws ArithmeticException{
        if (right.evaluate() == 0){
            throw new ArithmeticException("lỗi chia cho 0");
        }
        else {
            return left.evaluate()/right.evaluate();
        }
    }
}
