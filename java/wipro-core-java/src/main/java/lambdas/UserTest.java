package lambdas;

import java.util.function.Predicate;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<User> p = usr-> usr.getUsername().equals("admin") &&
				usr.getPassword().equals("admin");
		
		User user1 = new User("admin","admin");
		User user2 = new User("system","manager");
		
		if(p.test(user2))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");

	}

}
