package Tasks.JSONtoObject;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person = new Person("John Doe", 30);
        JSONConverter<Person> converter = new JSONConverter<>();

        // Convert Person object to JSON
        String json = converter.toJSON(person);
        System.out.println(json);

        // Convert JSON back to Person object
        Person newPerson = converter.fromJSON(json, Person.class);
        System.out.println(newPerson.getName()); // John Doe
        System.out.println(newPerson.getAge()); // 30
    }
}