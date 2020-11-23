package calc;

import java.util.Map;

public class Variable extends Unary {

    // Constructor
    public Variable(String name) { this.name_ = name; }

    // Member functions
    @Override
    public Integer evaluate(Map<String, Integer> map) throws CalcException {

        if(map.containsKey(name_) == true) {
            return map.get(name_);
        }
        else {
            throw new CalcException();
        }
    }

    @Override
    public String toString() {
        return name_ + " ";
    }

    // Member variables
    String name_;
}
