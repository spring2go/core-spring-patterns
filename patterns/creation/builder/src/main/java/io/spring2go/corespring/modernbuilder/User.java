package io.spring2go.corespring.modernbuilder;

// 流畅接口(Fluent Interface)
public class User {
	// 所有字段final
	private final String firstName; // 必须
	private final String lastName; // 必须
	private final int age; // 可选
	private final String phone; // 可选
	private final String address; // 可选

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	// 全部是getter，没有setter，保证不可变性immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User: " + this.firstName + ", " 
	           + this.lastName + ", " + this.age + ", " 
			   + this.phone + ", " + this.address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		// 返回最终构造的用户对象
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}

		private void validateUserObject(User user) {
			// 基本的验证检查
			// 确保用户对象不违反系统假设
		}
	}
}
