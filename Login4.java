package conditionaloperator;

public class Login4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if((id.equals("ChoKyungSang") || id.equals("whrudtkdsla") || id.equals("rudtkdsla")) && password.equals("13rudtkd79")){
			System.out.println("right");
		}
		else{
			System.out.println("wrong");
		}

	}

}
