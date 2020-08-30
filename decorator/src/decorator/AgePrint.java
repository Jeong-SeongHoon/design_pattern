package decorator;

public class AgePrint extends DecoratePrint{

	public AgePrint(Print deco) {
		super(deco);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("나이 출력");
	}

}
