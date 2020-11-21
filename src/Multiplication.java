import java.util.Map;

public class Multiplication extends Binary implements Associative {

    // Constructor
    public Multiplication(Expression left, Expression right) {
        this.left_ = left;
        this.right_ = right;
    }

    // Member functions
    @Override
    public Integer evaluate(Map<String, Integer> map) { return left_.evaluate(map) * right_.evaluate(map); }

    @Override
    public Integer rank() { return 1; }

    @Override
    public String toString() { return left_ + "* " + right_; }

}
