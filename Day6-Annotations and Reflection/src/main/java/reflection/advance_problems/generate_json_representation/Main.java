package reflection.advance_problems.generate_json_representation;


import static reflection.advance_problems.generate_json_representation.JsonConvertor.toJson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Durgesh",21,true);
        String json = toJson(person);

        System.out.println(json);
    }
}
