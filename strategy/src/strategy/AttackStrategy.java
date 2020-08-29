package strategy;

public interface AttackStrategy {
	public void attack();
}

class MissileStrategy implements AttackStrategy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� ����!");
	}
}

class PunchStrategy implements AttackStrategy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�ָ� ����!");
	}
}
