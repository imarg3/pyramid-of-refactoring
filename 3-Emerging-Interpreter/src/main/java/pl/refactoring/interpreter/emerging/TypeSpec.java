package pl.refactoring.interpreter.emerging;

public class TypeSpec implements Spec{
    private EstateType type;

    public TypeSpec(EstateType type) {
        this.type = type;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getType().equals(type);
    }
}