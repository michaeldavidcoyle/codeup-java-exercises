public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        // TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        // TODO: change the name property to the passed value
         this.name = name;
    }

    public void sayHello(){
        // TODO: print a message to the console using the person's name
        System.out.printf("Hello, my name is %s.", this.getName());
    }

    public static void main(String[] args) {
        Person mdc = new Person("Michael");
        mdc.sayHello();

        System.out.println("Understanding references: ");
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // should be true because they have the same name
//        System.out.println(person1 == person2); // false because they are different objects

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // wasn't sure but turn out to be true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane");
        System.out.println(person1.getName()); // Expecting John, but printed Jane, so changing one changes the other.
        System.out.println(person2.getName()); // Expecting Jane, got Jane
    }
}
