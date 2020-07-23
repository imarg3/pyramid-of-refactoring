package pl.refactoring.interpreter.basement;

public class AndSpec implements Spec{
    private final Spec firstSpec;
    private final Spec secondSpec;

    public AndSpec(Spec firstSpec, Spec secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    public Spec getFirstSpec() {
        return firstSpec;
    }

    public Spec getSecondSpec() {
        return secondSpec;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return getFirstSpec().isSatisfiedBy(estate) && getSecondSpec().isSatisfiedBy(estate);
    }
}
