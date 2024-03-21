public class User{
	private String surname;
    private String firstname;
	private String middlename;

	public User(String surname, String firstname, String middlename) {
		this.surname = surname;
		this.firstname = firstname;
		this.middlename = middlename;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setmiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getSurname(){
		return surname;
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public String getmiddlename(){
		return middlename;
	}

	@Override
	public String toString() {
		return "User{" +
				"surname='" + surname + '\'' +
				", firstname='" + firstname + '\'' +
				", middlename='" + middlename + '\'' +
				'}';
	}

}
