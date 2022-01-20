package JAVA8;

public class StaticMethod {
public static void main(String[] args) {
	System.out.println(Learner.meetingPlatform);
	Learner.getPlatform();
	
	Learner mani = new Learner();
	mani.name = "mani";
	Learner sarvesh = new Learner();
	sarvesh.name = "sarvesh";
	
	mani.getName();
	sarvesh.getName();
}
}
class Learner {
	public static String meetingPlatform = "CISCO WEBEX";
	public static void getPlatform() {
		System.out.println("METTING PLATFORM");
	}
	public String name;
	public void getName() {
		System.out.println("NAME");
	}
}
