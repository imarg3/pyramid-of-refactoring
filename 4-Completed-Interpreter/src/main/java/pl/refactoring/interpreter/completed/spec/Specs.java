package pl.refactoring.interpreter.completed.spec;

import pl.refactoring.interpreter.completed.EstateMaterial;
import pl.refactoring.interpreter.completed.EstatePlacement;
import pl.refactoring.interpreter.completed.EstateType;
import pl.refactoring.interpreter.completed.Spec;

public class Specs {
    public static AreaRangeSpec ofAreaRange(float minArea, float maxArea) {
        return new AreaRangeSpec(minArea, maxArea);
    }

    public static BelowAreaSpec belowArea(float maxBuildingArea) {
        return new BelowAreaSpec(maxBuildingArea);
    }

    public static MaterialSpec ofMaterial(EstateMaterial material) {
        return new MaterialSpec(material);
    }

    public static NotSpec not(Spec spec) {
        return new NotSpec(spec);
    }

    public static PlacementSpec placedIn(EstatePlacement placement) {
        return new PlacementSpec(placement);
    }

    public static TypeSpec ofType(EstateType type) {
        return new TypeSpec(type);
    }
}
