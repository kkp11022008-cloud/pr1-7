package pr4;

public class Atelie {

    public void dressWomen(Cloth[] cloth) {

        System.out.println("Женская одежда:");

        boolean found = false;

        for (int i = 0; i < cloth.length; i++) {

            if (cloth[i] instanceof WomenCloth) {

                WomenCloth item = (WomenCloth) cloth[i];

                item.dressWomen();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Подходящая одежда не найдена.");
        }
    }

    public void dressMan(Cloth[] cloth) {

        System.out.println("Мужская одежда:");

        boolean found = false;

        for (int i = 0; i < cloth.length; i++) {

            if (cloth[i] instanceof MenCloth) {

                MenCloth item = (MenCloth) cloth[i];

                item.dressMen();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Подходящая одежда не найдена.");
        }
    }

    public void dressMen(Cloth[] clothes) {
    }
}