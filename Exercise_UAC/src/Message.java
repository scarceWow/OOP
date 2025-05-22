public abstract class Message {
	protected ILogin iLogin;
	protected String from, to, message;
	
	public Message(ILogin iLogin, String from, String to, String message) {
		super();
		this.iLogin = iLogin;
		this.from = from;
		this.to = to;
		this.message = message;
	}

	public ILogin getiLogin() {
		return iLogin;
	}

	public void setiLogin(ILogin iLogin) {
		this.iLogin = iLogin;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public abstract void send(String username, String password);

}
