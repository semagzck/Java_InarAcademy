class checkPoint_20{
  public static void main(string[]args) {
    int sum = 0;
    int number = 0;
    
    while (number < 20 && sum < 100) { 
      number++;
      sum += number;
    }
    
    System.out.println("The sum is " + sum);
  }
}

class checkPoint_20{ 
  public static void main(String[] args) { 
    int sum = 0;
    int number = 0;

    while (number < 20) { 
      number++;
      if (number != 10 && number != 11) 
        sum += number;
    } 

    System.out.println("The sum is " + sum);
  }
}
