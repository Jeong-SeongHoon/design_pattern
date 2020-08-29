package strategy;

public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MoveStrategy moveStrategy;

	public Robot(String name) {
		super();
		this.name = name;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public AttackStrategy getAttackStrategy() {
		return attackStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public MoveStrategy getMoveStrategy() {
		return moveStrategy;
	}

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "My name is " + this.getName();
	}

	public void move() {
		moveStrategy.move();
	};
	public void attack() {
		attackStrategy.attack();
	};
}

class Atom extends Robot {
	public Atom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

class Mazinga extends Robot {
	public Mazinga(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
