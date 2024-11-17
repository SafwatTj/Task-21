import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Jack","Jackson", 20, "jack20@mail.com"),
                new Person("Sam","Simpson", 18, "sam@mail.com"),
                new Person("Jack","Jeferson", 61, "jefffff@mail.com"),
                new Person("Sveta","Ivanova", 30, "sveta30@mail.com"),
                new Person("Nick","Peterson", 45, "nick@mail.com"),
                new Person("Peter","Nickson", 54, "pit@mail.com"),
                new Person("Tom","Soer", 33, "ts@mail.com"),
                new Person("Bill","Tomson", 26, "bill@mail.com")
        );

       personList.forEach((p)-> System.out.println(p.getfName() + " " + p.getlName() ));
        System.out.println(listHandler(personList, p -> p.getlName()));
        System.out.println(listHandler(personList, p -> p.getAge()));
        System.out.println(listHandler(personList, p -> p.getEmail()));
        System.out.println(listHandler(personList, p -> p.getfName() + " " + p.getlName()     ));

        List<String> strings = List.of("12", "1", "16", "10");
        List<Integer> integers = listHandler(strings, s -> Integer.parseInt(s));
        System.out.println(integers);


    }

    public static <E,T> List<E> listHandler(List<T> list, Function<T,E> function){

        List<E> result = new ArrayList<>();
        for (var e:list){
            result.add( function.apply(e) );
        }

        return result;
    }




}