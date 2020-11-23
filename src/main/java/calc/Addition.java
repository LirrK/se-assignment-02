package calc;

import java.util.Map;

public class Addition extends Binary implements Associative {

    // Constructor
    public Addition(Expression left, Expression right) {
        this.left_ = left;
        this.right_ = right;
    }

    // Member functions
    @Override
    public Integer evaluate(Map<String, Integer> map) { return left_.evaluate(map) + right_.evaluate(map); }

    @Override
    public Integer rank() { return rank_; }

    @Override
    public String toString() { return left_ + "+ " + right_; }

    // Member variables
    public int rank_ = 2;
}
