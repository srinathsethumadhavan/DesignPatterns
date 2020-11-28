
public class Client {

	public static void main(String[] args) {
		
		Student st1  = new Builder()
				.withAge("12")
				.withMarks(132)
				.withAverage(43)
				.withGender("Male")
				.build();
		Student st2  = new Builder()
				.withAge("1243")
				.withMarks(14332)
				.withAverage(4332)
				.withGender("Male")
				.withName("Ali")
				.withResult(true)
				.build();
		
		
		System.out.println(st1);
		System.out.println(st2);
	}
}
