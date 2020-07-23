package pl.refactoring.interpreter.emerging.specs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

import static org.junit.jupiter.api.Assertions.*;

class AndSpecTest {

    private Spec yesSpec;

    @BeforeEach
    void setUp() {
        yesSpec = Mockito.mock(Spec.class);

        Mockito.when(yesSpec.isSatisfiedBy(Mockito.any(RealEstate.class)))
                .thenReturn(true);
    }

    @Test
    void shouldVerifyTwoComponentsInCaseOfYesResults() {

        // Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec);

        // When
        boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

        // Then
        assertTrue(andResult);

        Mockito.verify(yesSpec, Mockito.times(2))
                .isSatisfiedBy(Mockito.any(RealEstate.class));
    }

    @Test
    void shouldVerifyThreeComponentsInCaseOfYesResults() {

        // Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec, yesSpec);

        // When
        boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

        // Then
        assertTrue(andResult);

        Mockito.verify(yesSpec, Mockito.times(3))
                .isSatisfiedBy(Mockito.any(RealEstate.class));
    }
}