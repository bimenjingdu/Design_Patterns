package Shadow_Clone;

public class Client {

	public static void main(String[] args) {
		Email email,copyEmail;
		email = new Email();
		copyEmail = (Email)email.clone();
		System.out.println("email == copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println("email.getAttachment? == copyEmail.getAttachmen?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}

}
