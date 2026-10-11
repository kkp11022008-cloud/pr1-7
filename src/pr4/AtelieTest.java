package pr4;

public class AtelieTest {

    public static void main(String[] args) {

        Cloth[] clothes = {
                new Tshirt(Size.M, 1500, "белый"),
                new Pants(Size.L, 2500, "чёрный"),
                new Skirt(Size.S, 1800, "красный"),
                new Tie(Size.M, 900, "синий"),
                new Tshirt(Size.XXS, 700, "зелёный")
        };

        Atelie atelie = new Atelie();

        atelie.dressWomen(clothes);

        System.out.println();

        atelie.dressMen(clothes);
    }
}