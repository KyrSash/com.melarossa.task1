public class StringValidator implements Validator<String> {
    @Override
    public boolean validate(String object) throws ValidationFailedException {
        if (object.matches("[A-Z](\\w*)")) return true;
        throw new ValidationFailedException("Validation String Failed");
    }
}