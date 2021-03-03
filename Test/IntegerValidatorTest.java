import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerValidatorTest {
    private IntegerValidator integerValidator;
    private static final Integer INTEGER1 = 1;
    private static final Integer INTEGER5 = 5;
    private static final Integer INTEGER10 = 10;
    private static final Integer INTEGER25 = 25;

    @org.junit.Before
    public void setUp() throws Exception {
        integerValidator = new IntegerValidator();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        integerValidator = null;
    }

    @org.junit.Test
    public void testValidateIntegerValue1() throws ValidationFailedException {
        integerValidator.validate(INTEGER1);
        assertTrue(true);
    }

    @org.junit.Test
    public void testValidateIntegerValue5() throws ValidationFailedException {
        integerValidator.validate(INTEGER5);
        assertTrue(true);
    }

    @org.junit.Test
    public void testValidateIntegerValue10() throws ValidationFailedException {
        integerValidator.validate(INTEGER10);
        assertTrue(true);
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidationFailedException() throws ValidationFailedException {
        integerValidator.validate(INTEGER25);
    }
}