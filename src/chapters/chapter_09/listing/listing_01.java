package chapters;

public class listing_01 {
    public static void main(String[] args) {


        SimpleCircle circle1 = new SimpleCircle(); // parametresiz aldığım için radius =1
        System.out.println("The area of the circle of radius " + circle1.radius + " is " +
            circle1.getArea());


    SimpleCircle circle2 = new SimpleCircle(25); //parametreni kendin belirledin .methodu ekle
        System.out.println("The area of the circle of radius " + circle2.radius + " is " +
                circle2.getArea());

    SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " +
            circle3.getArea());


    circle2.radius = 100;  //2.daireyi al yarıçapa git =100 yap 25 i güncelle aşağıda yazdığın voidle
        System.out.println("The area of the circle of radius " + circle2.radius + " is " +
            circle2.getArea());
}
}

class SimpleCircle {
    double radius;

    SimpleCircle() { //parametresiz değerim kullanıcı yarıçap girmezse radius= olacak
        radius = 1;
    }

    SimpleCircle(double newRadius) { //sınıfla aynı isimde
        radius = newRadius; //parametreli const.
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius;
    }

    void setRadius(double newRadius) { //yarıçap güncelle
        radius = newRadius;
    }


}

