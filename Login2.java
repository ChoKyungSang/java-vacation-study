package condition;

public class Login2 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("ChoKyungSang")){
			if(password.equals("13rudtkd79")){
				System.out.println("right");
			}
			else{
				System.out.println("wrong");
			}
		}
		else{
			System.out.println("wrong");
		}
	}

}
