import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Jack","Jackson", 20, "jack20@mail.com"),
                new Person("Sam","Simpson", 18, "sam@gmail.com"),
                new Person("Jack","Jeferson", 61, "jefffff@mail.com"),
                new Person("Sveta","Ivanova", 30, "sveta30@mail.com"),
                new Person("Nick","Peterson", 45, "nick@gmail.com"),
                new Person("Peter","Nickson", 54, "pit@gmail.com"),
                new Person("Tom","Soer", 33, "ts@gmail.com"),
                new Person("Bill","Tomson", 26, "bill@mail.com")
        );


        personList.stream()
                .filter(p->p.getAge()>20)
                .filter(p->p.getEmail().endsWith("gmail.com"))
                .forEach(p-> System.out.println(p));

        List<String> list = personList.stream()
                .filter(p -> p.getAge() > 20)
                .map(p -> p.getlName() + " " + p.getEmail())
                .toList();
        System.out.println(list);

        List<String> strings = List.of(
                "Jack Jackson 20 jack20@mail.com",
                "Sam Simpson 18 sam@gmail.com",
                "Sveta Ivanova 30 sveta30@mail.com"
        );

        List<Person> list1 = strings.stream()
                .map(s -> {
                    String[] arr = s.split(" ");
                    return new Person(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);
                }).toList();
        System.out.println(list1);


    }
}
