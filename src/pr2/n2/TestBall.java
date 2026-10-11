package pr2.n2;

public class TestBall {

    public static void main(String[] args) {

        Ball ball = new Ball(10.0, 5.0);

        System.out.println("Начальное положение:");
        System.out.println(ball);

        System.out.println("X = " + ball.getX());
        System.out.println("Y = " + ball.getY());

        ball.setX(20.0);
        ball.setY(15.0);

        System.out.println("После setX и setY:");
        System.out.println(ball);

        ball.setXY(30.0, 25.0);

        System.out.println("После setXY:");
        System.out.println(ball);

        ball.move(5.0, 3.0);

        System.out.println("После move:");
        System.out.println(ball);
    }
}