public class EmailMessage extends Message {

	public EmailMessage(ILogin iLogin, String from, String to, String message) {
		super(iLogin, from, to, message);
	}

	@Override
	public void send(String username, String password) {	
		if (iLogin.authenticate(username, password)) {
			System.out.println("Email sent from "+ from + " to " + to +": " + message);
		}else {
			System.out.println("Email authentication failed for user: " + username);
		}
	}
}
