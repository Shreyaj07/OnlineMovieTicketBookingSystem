package javaSourseCode;

public class LoginInput {
	
	String email;
	String pass;
	
	public LoginInput(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	
	public LoginInput() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
