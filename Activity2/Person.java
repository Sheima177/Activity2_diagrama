package Activity2;

import java.sql.Date;

public class Person {

	private String name;
	private String dni;
	private String address;
	private String phone;
	private Date birthdate;


	public int calculateAge(){

		if (birthdate == null) {

			return -1;

		}

		Date currentDate = new Date(0);

		long diffInMillies = Math.abs(currentDate.getTime() - birthdate.getTime());

		long diff = diffInMillies / (24 * 60 * 60 * 1000);

		int age = (int) (diff / 365.25);

		return age;

	}
	
	
}
