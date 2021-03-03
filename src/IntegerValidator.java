public class IntegerValidator implements Validator<Integer> {
    @Override
    public boolean validate(Integer object) throws ValidationFailedException {
        if (object >= 1 && object <= 10) return true;
        throw new ValidationFailedException("Validation Integer Failed");
    }
}