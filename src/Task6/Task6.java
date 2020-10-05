package Task6;

public class Task6 {
    public String concatenateStrings(Object[] array){
        String message = "";
        for (Object obj: array) {
            if(obj instanceof String || obj instanceof Character){
                message = message + obj;
            }
        }
        return message;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sorin", Gender.MALE, 22);
        Person person2 = new Person("Vlad", Gender.MALE, 18);
        Person person3 = new Person("Angela", Gender.FEMALE, 25);
        Person person4 = new Person("Dan", Gender.MALE, 45);
        Object[] objects = new Object[]{person1,person2, 3223232, "Today " , "is " , person3 , 'a' , person4 , " big day"};
        Task6 newTask = new Task6();
        System.out.println(newTask.concatenateStrings(objects));
    }
}
