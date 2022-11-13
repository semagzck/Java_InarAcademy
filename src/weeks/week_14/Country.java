package weeks.week_14;

   public class Country extends Continent {
        private String language;
        private String[] foods;

        public Country() {

        }

        public Country(String name, double area, int population, String climate, String language, String[] foods) {
            super.name = name;
            super.area = area;
            setPopulation(population);
            setClimate(climate);
            this.language = language;
            this.foods = foods;
        }

        public String getLanguage() {
            return language;
        }

        public String[] getFoods() {
            return foods;
        }

        public void formOfGovernment(int government) {
            System.out.print(this.name);

            switch (government) {

                case 1:
                    System.out.println("'s form of government is a republic.");
                    break;
                case 2:
                    System.out.println("'s form of government is a monarchy.");
                    break;
                case 3:
                    System.out.println("'s form of government is a presidential system");
            }
        }

        @Override
        public String toString() {
            return "Country's name: " + getName() + "\nPopulation: " + getPopulation() + "\nArea: " + getArea() +
                    "\nLanguage: " + getLanguage() + "\nClimate: " + getClimate() + "\nFoods: " + Arrays.toString(getFoods());
        }

        final void countryBreadth(){
            System.out.println("The territory of this country is "+ (this.area > 300000 ? "large" : "not large"));
        }

}

