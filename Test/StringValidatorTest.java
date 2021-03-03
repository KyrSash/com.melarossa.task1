import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringValidatorTest {
    private StringValidator stringValidator;
    private static final String STRING1 = "Hello";
    private static final String STRING2 = "hello";

    @Before
    public void setUp() {
        stringValidator = new StringValidator();
    }

    @After
    public void tearDown() {
        stringValidator = null;
    }

    @Test
    public void testValidateString() throws ValidationFailedException {
        stringValidator.validate(STRING1);
        assertTrue(true);
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidationFailedException() throws ValidationFailedException {
        stringValidator.validate(STRING2);
    }
}