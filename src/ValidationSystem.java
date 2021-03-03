public class ValidationSystem {
    public Validator validate(Object object) throws ValidationFailedException {
        if (object instanceof String) return new StringValidator();
        if (object instanceof Integer) return new IntegerValidator();
        throw new ValidationFailedException("Object is not a String or Integer");
    }
}