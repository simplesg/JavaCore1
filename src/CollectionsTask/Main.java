package CollectionsTask;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        FIRST TASK
//
//        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 10, 12, 14);
//        List<Integer> list2 = Arrays.asList(1, 2, 5, 7, 9, 10, 13, 15);
//        List<Integer> list3 = new ArrayList<>(list1);                             Assigning the values of list1 to list3
//
//        for (Integer number : list2) {
//            if (!list3.contains(number)) {                                        If element from list2 is NOT in list3 add that obj to list3
//                list3.add(number);
//            }
//        }
//        list3 = list3.stream().sorted().collect(Collectors.toList());             Using stream() to sort the list
//        for (Integer number : list3) {
//            System.out.println(number);
//        }

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sorin",22,"football",76.3));
        personList.add(new Person("Andrei",25,"hockey",71.5));
        personList.add(new Person("Vlada",24,"photos",67.8));
        personList.add(new Person("Daniel",22,"basketball",89.1));
        personList.add(new Person("Cristina",31,"video games",56.5));


        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose between sorting method:");
            System.out.println("1. Compare by age");
            System.out.println("2. Compare by weight");
            String sortingMethod = scanner.nextLine();
            if(sortingMethod.equals("1")){
                Collections.sort(personList);
                for(Person person : personList){
                    System.out.println(person);
                    System.out.println("----------------");
                }
            } else if(sortingMethod.equals("2")){
                Collections.sort(personList, new CompareByWeight());
                for(Person person : personList){
                    System.out.println(person);
                    System.out.println("----------------");
                }
            } else {
                System.out.println("Wrong choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            String decision = scanner.nextLine();
            if(decision.equals("n")){
                scanner.close();
                break;
            }
        }

    }
}
