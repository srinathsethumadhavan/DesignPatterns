package Builder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

	
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserDTO dto;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.firstName=fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName=lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate birthday) {
		Period ageInYears = Period.between(birthday, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() +", " + address.getStreet()
		   +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
return this;
	
		
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(this.firstName+" "+this.lastName,this.address,this.age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		
		return this.dto;
	}

	
}
