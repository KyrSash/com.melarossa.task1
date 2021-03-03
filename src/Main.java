public class Main {
    public static void main(String[] args) throws ValidationFailedException {
//        try {
//            String string = "hello";
//            StringValidator stringValidator = new StringValidator();
//            stringValidator.validate(string);
//        } catch (ValidationFailedException e) {
//            e.printStackTrace();
//        }
        String string = "Hello";
        Integer integer = 3;
        //Boolean b = false;
        ValidationSystem validationSystem = new ValidationSystem();
        Validator validator1 = validationSystem.validate(string);
        Validator validator2 = validationSystem.validate(integer);
        System.out.println(validator1.validate(string));
        System.out.println(validator2.validate(integer));
        //System.out.println(validationSystemFactory.createValidator(b));

//        StringValidator stringValidator = new StringValidator();
//        System.out.println(stringValidator.validate(string));


    }
}