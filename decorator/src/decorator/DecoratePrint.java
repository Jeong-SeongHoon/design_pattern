package decorator;

public abstract class DecoratePrint implements Print{
	private Print deco;

	public DecoratePrint(Print deco) {
		super();
		this.deco = deco;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		deco.print();
	}
}
