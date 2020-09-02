package factory_method;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball soccerBall = BallFactory.getBall(BallFactory.BallType.SOCCER);
		soccerBall.print();
		
		Ball basketBall = BallFactory.getBall(BallFactory.BallType.BASKET);
		basketBall.print();
		
		Ball golfBall = BallFactory.getBall(BallFactory.BallType.GOLF);
		golfBall.print();
		
		Ball baseballBall = BallFactory.getBall(BallFactory.BallType.BASEBALL);
		baseballBall.print();
	}

}
