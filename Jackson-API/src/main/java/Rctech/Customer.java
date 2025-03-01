package Rctech;

public class Customer {
	
	private String name;
	private String id;
	private String mail;
	private String location;
	public Customer(String name, String id, String mail, String location) {
		super();
		this.name = name;
		this.id = id;
		this.mail = mail;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", mail=" + mail + ", location=" + location + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
