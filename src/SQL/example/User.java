package SQL.example;

public class User {
	int    id;
	String name;
	String sex;
	String email;

	public User( ) {
		super();
	}
	public User( String name, String sex, String email) {
		super();
		//this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email + "]";
	}
}
