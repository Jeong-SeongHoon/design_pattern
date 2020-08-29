package strategy;

public interface AttackStrategy {
	public void attack();
}

class MissileStrategy implements AttackStrategy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("미사일 공격!");
	}
}

class PunchStrategy implements AttackStrategy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("주먹 공격!");
	}
}
