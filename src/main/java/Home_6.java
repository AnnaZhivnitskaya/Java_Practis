import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Home_6 {
    public static void main(String[] args){
        Person person1 = new Person("John", "Smith", 25,"male", false);
        Person person2 = new Person("Mary", "Jons", 20,"female", false);
        Person person3 = new Person("Mike", "Brown", 45,"male", true);
        Person person4 = new Person("Nikolas", "Tree", 5,"male", false);
        Person person5 = new Person("Simona", "Tree", 30,"female", true);
        Person person6 = new Person("John", "Smith", 25,"male", false);

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3); 
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        System.out.println(persons);

        persons.stream().filter(person -> person.getAge() > 20).forEach(System.out::println);



        System.out.println(person1);

        System.out.println(person1 == person6);
        System.out.println(person1.equals(person6));

        String name = person1.getName();
        System.out.println(name);

        Boolean married = Boolean.valueOf(person1.getMarried());
        System.out.println(married);

    }

    public static class Person { //конструктор класса

        private String name; //поле класса
        private String surname;
        private int age;
        private String sex;
        private boolean married;
        Person(String personName, String personSurname, int personAge, String personSex, boolean personMarried){
            name = personName;
            surname = personSurname;
            age = personAge;
            sex = personSex;
            married = personMarried;
        }
        public String getName(){//метод класса
            return name;
        }
        public String getSurname(){
            return surname;
        }
        public int getAge(){
            return age;
        }
        public String getSex(){
            return sex;
        }
        public boolean getMarried(){
            return married;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null){
                return false;
            }
            if(!(obj instanceof Person)){
                return false;
            }
            Person anotherPerson = (Person) obj;
            return name.equals(anotherPerson.name) &&
                    surname.equals(anotherPerson.surname) &&
                    age == anotherPerson.age &&
                    sex.equals(anotherPerson.sex) &&
                    married == anotherPerson.married;
        }

        @Override //Должно выполняться правило: если два объекта равны по иквелсу, то они должны быть с одним хэшкодом
        public int hashCode() {// if obj1.equals(obj2) => obj1.hashCode() == obj2.hashCode()
            return Objects.hash(name, surname, age, sex, married);
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %s %b", name, surname, age, sex, married);

        }
    }
}
