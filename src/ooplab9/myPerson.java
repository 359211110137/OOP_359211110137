package ooplab9;

public class myPerson {
    public static void main(String[] args) {

        Person person = new Person("waranya", 23,
                new Address("204","nakhonsrithammarat","80220"),
                new Job("receptionist", 50000));


        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(50000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());


    }//main
}//class
