package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print scoreNameAge = new AgePrint(new NamePrint(new ScorePrint()));
		scoreNameAge.print();
		
	}

}
