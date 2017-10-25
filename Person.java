package Person;

/**
 * Created by Wensen Zhang on 10/4/2017.
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	/**
	 * Gets the person information in a formatted manner
	 * 
	 * @return formatted String of person attributes
	 */
	public String getInfo() {
		return String.format("First name: %s Last name: %s Age: %d", firstName, lastName, age);
	}

	/**
	 * Gets the first name
	 * 
	 * @return first name of person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets person's first name to the passed argument
	 * 
	 * @param firstName
	 *            sets the person's first name to firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name
	 * 
	 * @return last name of person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name
	 * 
	 * @param lastName
	 *            sets last name to lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the age
	 * 
	 * @return age of person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age
	 * 
	 * @param age
	 *            sets age of person to age
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
