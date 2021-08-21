package Week3.Day1;

public class ExecutionOfMobile {

	public static void main(String[] args) {
		Mobile mobObj = new Mobile();
		mobObj.saveContact();
		mobObj.sendMsg();
		mobObj.makeCall();
		System.out.println("==========");
		AndroidPhone androidPhoneObj = new AndroidPhone();
		androidPhoneObj.takeVedio();
		androidPhoneObj.sendMsg();
		androidPhoneObj.makeCall();
		androidPhoneObj.saveContact();
		
	System.out.println("=================");
	SmartPhone smartPhoneObj = new SmartPhone();
	smartPhoneObj.connectWhatsApp();
	smartPhoneObj.makeCall();
	smartPhoneObj.takeVedio();
	smartPhoneObj.saveContact();
	smartPhoneObj.makeCall();
	}
}
