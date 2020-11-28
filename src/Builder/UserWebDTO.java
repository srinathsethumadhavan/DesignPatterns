package Builder;

public class UserWebDTO implements UserDTO {

	
   private String name;
	
	private String address;
	
	private String age;

	public UserWebDTO(String name, String address, String age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		
		return this.name;
	}

	@Override
	public String getAddress() {
		
		return  this.address;
	}

	@Override
	public String getAge() {
		
		return  this.age;
	}

	@Override
	public String toString() {
		return "UserWebDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
}
