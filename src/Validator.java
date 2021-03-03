public interface Validator<T> {
    boolean validate(T object) throws ValidationFailedException;
}