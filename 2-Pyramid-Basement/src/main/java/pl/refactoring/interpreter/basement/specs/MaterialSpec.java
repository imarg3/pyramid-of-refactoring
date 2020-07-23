package pl.refactoring.interpreter.basement.specs;

import pl.refactoring.interpreter.basement.EstateMaterial;
import pl.refactoring.interpreter.basement.RealEstate;
import pl.refactoring.interpreter.basement.Spec;

public class MaterialSpec implements Spec {
    private EstateMaterial material;

    public MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}