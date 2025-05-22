public class SMSMessage extends Message {

	public SMSMessage(ILogin iLogin, String from, String to, String message) {
		super(iLogin, from, to, message);
	}

	@Override
	public void send(String username, String password) {
		if (iLogin.authenticate(username, password)) {
			System.out.println("SMS sent from "+ from + " to " + to +": " + message);
		}else {
			System.out.println("SMS authentication failed for user: " + username);
        }
	}
}

