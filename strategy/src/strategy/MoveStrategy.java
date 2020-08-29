package strategy;

public interface MoveStrategy {
	public void move();
}

class WalkStrategy implements MoveStrategy {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�ɾ�ٴϱ�!");
	}
}

class FlyStrategy implements MoveStrategy {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���ƴٴϱ�!");
	}
}