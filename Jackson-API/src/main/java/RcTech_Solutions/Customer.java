package RcTech_Solutions;

public class Customer {
	private Integer id;
	private String name;
	private String mail;
	public Customer(Integer id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
