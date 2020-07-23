package pl.refactoring.interpreter.emerging.specs;

import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

public class AreaRangeSpec implements Spec {
    private final float minArea;
    private final float maxArea;

    public AreaRangeSpec(float minArea, float maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() >= minArea && estate.getBuildingArea() <= maxArea;
    }
}
