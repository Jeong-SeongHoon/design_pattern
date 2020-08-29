package strategy;

public interface MoveStrategy {
	public void move();
}

class WalkStrategy implements MoveStrategy {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걸어다니기!");
	}
}

class FlyStrategy implements MoveStrategy {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("날아다니기!");
	}
}