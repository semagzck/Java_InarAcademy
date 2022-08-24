public static void main(String[] Strings) {

        double gratuityRate,
                gratuityTotal,
                total,
                subtotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuityTotal = subtotal * gratuityRate * .01;
        total = subtotal + gratuityTotal;

        System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);

    }
 
}
