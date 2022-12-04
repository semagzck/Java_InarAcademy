    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    public Object clone() throws CloneNotSupportedException {  // clone methodu clonenotsuppor exception fırlatman lazım
        return super.clone();
    }

    //kopyalama 2 çeşit . 2. birincinin kopyası ama 1 2.nin kopyası olur
    //
    @Override
    public String toString() {
        return "Octagon's area: " + getArea() + "\nOctagon's perimeter: " + getPerimeter();
    }

}

