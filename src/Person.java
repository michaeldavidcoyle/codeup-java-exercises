public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//    public String getName(){
//        // TODO: return the person's name
//    }
//
//    public void setName(String name){
//        // TODO: change the name property to the passed value
//    }
//
//    public void sayHello(){
//        // TODO: print a message to the console using the person's name
//    }

    public static void main(String[] args) {
        Person mdc = new Person("Michael");
        System.out.println(mdc.name);
    }
}
