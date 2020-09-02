package factory_method;

public class BallFactory {
	enum BallType{
		SOCCER,
		BASKET,
		GOLF,
		BASEBALL,
	}
	
	public static Ball getBall(BallFactory.BallType ballType) {
		if (ballType == BallFactory.BallType.SOCCER) {
			return new SoccerBall();
		} 
		if (ballType == BallFactory.BallType.BASKET) {
			return new BasketBall();
		} 
		if (ballType == BallFactory.BallType.GOLF) {
			return new GolfBall();
		} 
		
		throw new Error("�ش� ���� �������� �ʽ��ϴ�.");
	}
}
