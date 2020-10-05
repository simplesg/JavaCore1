package Task6;

import java.util.ArrayList;

public class Task6 {
    public void concatenateObjects(Object[] array){
        String message = "";
        long sum = 0;
        ArrayList<Person> personArray = new ArrayList<Person>();

        for (Object obj: array) {
            if(obj instanceof String || obj instanceof Character){
                message = message + obj;
            }
            if(obj instanceof Person){
                personArray.add((Person)obj);
            }
            if(obj instanceof Number){
                sum = sum + ((Number) obj).longValue();
            }
        }
        System.out.println(message);
        System.out.println(sum);
        for (Person person : personArray){
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sorin", Gender.MALE, 22);
        Person person2 = new Person("Vlad", Gender.MALE, 18);
        Person person3 = new Person("Angela", Gender.FEMALE, 25);
        Person person4 = new Person("Dan", Gender.MALE, 45);
        Object[] objects = new Object[]{person1,person2, 3223232, "Today " , "is " , person3 , 'a' , person4 , " big day", 453, 5};
        Task6 newTask = new Task6();
        newTask.concatenateObjects(objects);
    }
}
