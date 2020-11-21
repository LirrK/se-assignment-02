import java.util.Map;

public class Value extends Unary {

    // Constructor
    public Value(Integer value) { this.value_ = value; }

    // Member functions
    @Override
    public Integer evaluate(Map<String, Integer> map) { return this.value_; }

    public String toString() { return this.value_ + " "; }

    // Member variables
    Integer value_;
}
