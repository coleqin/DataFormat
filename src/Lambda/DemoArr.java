package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArr {
    public static void main(String[] args) {
        Person [] arr= {
                new Person("liuyan",12),
                new Person("liujinkai",19),
                new Person("qinguoqiang",18),
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getAge()-o2.getAge();
            }
        });
        for (Person person : arr) {
            System.out.println(person);
        }
        System.out.println("-----------------");
        Arrays.sort(arr,( Person o1, Person o2) -> {
            return o1.getAge()-o2.getAge();

        });
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
