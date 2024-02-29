package fractions;

import java.util.IdentityHashMap;

public class fractions {
    private final Integer numerator;
    private final Integer denominator;
    public fractions(Integer num, Integer den) throws NullDenException{
        if(den!= null) {
            this.denominator = den;
        }
        else{
            throw new NullDenException("Denominator cant be null");
        }
        this.numerator = num;

    }
}
