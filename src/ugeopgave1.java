void main() {
    //opgave 1
    double item1 = 25.50;
    double item2 = 15.00;
    double item3 = 30.00;
    double subtotal = item1 + item2 + item3;

    double taxRate = 25.0;
    double withTax = subtotal + (subtotal * taxRate / 100.0);

    System.out.println(subtotal);
    System.out.println(withTax);


    //opgave 2
    double food = 450.0;
    double drink = 120.0;
    double tip = 50;
    int person = 4;

    double totalBill = food + drink + tip;
    double prPerson = totalBill / person;

    System.out.println(prPerson);


    //opgave 3
    double originalPrice = 300.0;
    double discountPercent = 20.0;
    double discounted = originalPrice - (originalPrice * discountPercent / 100.0);

    double taxPercent = 25.0;
    double finalPrice = discounted + (discounted * taxPercent / 100.0);

    System.out.println(originalPrice);
    System.out.println(discounted);
    System.out.println(finalPrice);


    //opgave 4
    int guests = 15;
    int cupcakes = 40;
    int cupcakesPrGuest = cupcakes / guests;
    int cupcakesLeftovers = cupcakes % guests;

    System.out.println("Each guest gets " + cupcakesPrGuest + " cupcakes");
    System.out.println(cupcakesLeftovers + " cupcakes left over");


    //opgave 5
    StringBuilder sb = new StringBuilder();
    String name = "Hannah";
    int age = 23;

    sb.append("Hello, ");
    sb.append(name);
    sb.append("! ");
    sb.append("You are ");
    sb.append(age);
    sb.append(" years old.");

    System.out.println(sb.toString());


    //opgave 6
    int score = 100;
    System.out.println(score);

    score += 50;
    System.out.println(score);

    score += 25;
    System.out.println(score);


    //opgave 7
    int health = 100;
    health -= 15;
    System.out.println(health);

    health -= 20;
    System.out.println(health);


    //opgave 8
    double price = 50.0;
    System.out.println(price);

    price *= 2;
    System.out.println(price);


    //opgave 9
    int count = 10;
    System.out.println(count);

    count ++;
    System.out.println(count);

    count --;
    System.out.println(count);


    //opgave 10
    int number = 10;
    number += 5;
    System.out.println(number);

    number -= 3;
    System.out.println(number);

    number ++;
    System.out.println(number);

    number --;
    System.out.println(number);


    //opgave 11
    String productName = "Laptop";
    double productPrice = 7999.99;
    boolean inStock = true;
    int stockQuantity = 15;
    double discountPercents = 10.0;
    String category = "Electronics";


    //opgave 12
    String studentName = "Anna";
    int testScore = 85;
    int homeworkScore = 92;
    double finalGrade = 88.5;
    boolean passedCourse = true;


    //opgave 13
    String guestName = "Peter Hansen";
    int roomNumber = 204;
    int numberOfNights = 3;
    double pricePrNight = 899.00;
    boolean breakfastIncluded = true;
    double totalCost = 2697.00;


    //opgave 14
    int stepsToday = 8547;
    int goalSteps = 10000;
    double distanceKm = 6.2;
    int caloriesBurned = 420;
    boolean goalReached = false;


    //opgave 15
    String bookTitle = "Dead Poets Society";
    String authorName = "Nancy H. Kleinbaum";
    String isbn = "978-0-553282-98-6";
    int numberOfPages = 176;
    boolean isAvailable = true;
    String currentBorrower = "No one";
    String dueDate = "2026-02-01";
    double fineAmount = 20.0;
    boolean isBestseller = true;
    double rating = 4.2;

}