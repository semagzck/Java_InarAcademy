package chapters.chapter_13.Exercise.Exercise_05;
import java.util.Date;

public abstract  class ModifyGeometricObject implements Comparable<ModifyGeometricObject> {
        private String color = "white";
        private boolean filled;
        private Date datecreated;


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public Date getDatecreated() {
            return datecreated;
        }
        public static int max(ModifyGeometricObject o1,ModifyGeometricObject o2) {
            if (o1.compareTo(o2) == 1)
                return 1;
            else if (o1.compareTo(o2) == -1) {
                return -1;
            } else {
                return 0;

            }
        }
        public int compareTo(ModifyGeometricObject o) {
            if (this.getArea() > o.getArea()) {
                return 1;
            } else if (this.getArea() < o.getArea()) {
                return -1;

            } else
                return 0;

        }

        public abstract double getArea();

        public abstract double getPerimeter();
    }


