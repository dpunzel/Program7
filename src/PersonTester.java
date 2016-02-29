/**
 * Created by User on 2/27/2016.
 */
public class PersonTester
{
    public static void main(String[] args)
    {
        Person person = new Person("David", "5035345030", "dad@email.com");
        Person student = new Student("Don", "504", "student@email.com", "computer", 3.50);
        Person employee = new Employee("Tom", "405", "tom@tom.com", "ID405");

        System.out.println(person.toString() + "\n");
        System.out.println(student.toString() + "\n");
        System.out.println(employee.toString() + "\n");
        System.out.println(person.getName() + "\n");
        System.out.println(student.getName() + "\n");
        System.out.println(employee.getName() + "\n");
        System.out.println(person.getEmail() + "\n");
        System.out.println(student.getEmail() + "\n");
        System.out.println(employee.getEmail() + "\n");
    }
}
