package decorator;

public class NamePrint extends DecoratePrint{

	public NamePrint(Print deco) {
		super(deco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("이름 출력");
	}
	
	
}
