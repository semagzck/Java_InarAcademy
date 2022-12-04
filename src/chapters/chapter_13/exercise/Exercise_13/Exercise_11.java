package chapters.chapter_13.Exercise.Exercise_11;

public class Exercise_11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon octagon1=new Octagon(5);
        System.out.println(octagon1.toString());

        Octagon octagon2=(Octagon) octagon1.clone();

        if (octagon1.compareTo(octagon2) == 1){
            System.out.println("Octagon1 is greather than its clone.");
        }
        else if (octagon1.compareTo(octagon2) == -1){
            System.out.println("Octagon is less than its clone.");
        }
        else {
            System.out.println("Octagon is equal to its clone.");
        }
    }
}

