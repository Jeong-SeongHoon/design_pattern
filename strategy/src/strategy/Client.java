package strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot atom = new Atom("¾ÆÅè");
		Robot mazinga = new Mazinga("¸¶Â¡°¡");
		
		System.out.println(atom);
		System.out.println(mazinga);
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMoveStrategy(new FlyStrategy());
		
		atom.attack();
		atom.move();
		
		mazinga.setAttackStrategy(new MissileStrategy());
		mazinga.setMoveStrategy(new WalkStrategy());
		
		mazinga.attack();
		mazinga.move();
	}

}
