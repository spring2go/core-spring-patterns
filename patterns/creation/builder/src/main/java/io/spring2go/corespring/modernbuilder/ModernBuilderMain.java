package io.spring2go.corespring.modernbuilder;

public class ModernBuilderMain {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("william", "Yang")
				.age(35)
				.phone("123456")
				.address("Fake address 1234")
				.build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Jack", "Liu")
				.age(40)
				.phone("5655")
				//no address
				.build();
		
		System.out.println(user2);
		
		User user3 = new User.UserBuilder("Frank", "Han")
				//no age
				//no phone
				//no address
				.build();
		
		System.out.println(user3);
	}

}
