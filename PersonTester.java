package Person;

import java.util.Scanner;

public class PersonTester {
	public static void main(String[] args) {
		Person person = new Person(null, null, 0);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		person.setFirstName(firstName);
		
		System.out.println("Please enter your last name: ");
		String lastName = scanner.nextLine();
		person.setLastName(lastName);

		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		person.setAge(age);
		
		System.out.println(person.getInfo());
	}
}
