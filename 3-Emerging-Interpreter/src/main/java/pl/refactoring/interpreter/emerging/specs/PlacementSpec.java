package pl.refactoring.interpreter.emerging.specs;

import pl.refactoring.interpreter.emerging.EstatePlacement;
import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

public class PlacementSpec implements Spec {
    private EstatePlacement placement;

    public PlacementSpec(EstatePlacement placement) {
        this.placement = placement;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getPlacement().equals(placement);
    }
}
