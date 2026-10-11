package pr7;

public class MathCalculableTest {

    public static void main(String[] args) {

        MathFunc mathFunc = new MathFunc();

        System.out.println("2 в степени 3 = "
                + mathFunc.pow(2, 3));

        System.out.println("Модуль числа 3 + 4i = "
                + mathFunc.absComplex(3, 4));

        System.out.println("Длина окружности радиуса 5 = "
                + mathFunc.circumference(5));

        System.out.println("Число PI = "
                + MathCalculable.PI);
    }
}
