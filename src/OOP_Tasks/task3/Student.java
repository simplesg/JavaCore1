package OOP_Tasks.task3;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setData(int newAge, String newName){
        this.setAge(newAge);
        this.setName(newName);
    }

//    public void setData(int newAge, String newName){
//        this.name = newName;
//        this.age = newAge;
//    }


    public static void main(String[] args) {
        Student student1 = new Student("Sorin", 22);
        Student student2 = new Student("Sergiu", 21);
        System.out.println("Average age of students is: " + (double)(student1.getAge() + student2.getAge())/2);
    }



}
