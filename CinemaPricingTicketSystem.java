public class CinemaPricingTicketSystem{
    public static void main(String[] args)
    {

        int age = 16;
        int ticketType = 2;
        double basePrice = 120;
        int tickets = 2;
        int totalCost;
        int seatNumber = 5;
        int bonusPoints = 0;
         String ticketDescription;

        switch(ticketType)
        {
            case 1:
                System.out.println("ticketType: Standard" );
                break;

            case 2: basePrice = basePrice + 30;
                System.out.println("ticketType: 3D Movie" );
                break;

            case 3: basePrice= basePrice + 50;
                System.out.println("ticketType: IMAX");
                break;
            
            default: 
            ticketDescription = "invalid Ticket Type";

        };

        // AGE DISCOUNTS
        System.out.println("Age: " + age);
        if (age < 12){
            basePrice = basePrice * 0.5;
            System.out.println(basePrice);
            System.out.println("Discount applied: 50%");

        }else if (age >= 12 && age <= 17){
            basePrice = basePrice * 0.8;
            System.out.println(basePrice);
            System.out.println("Discount applied: 20%");

        }else if (age>= 18 && age <=59){
            System.out.println(basePrice);
            System.out.println("No discount");

        }else {
            basePrice = basePrice * 0.3;
            System.out.println(basePrice);
            System.out.println("Discount applied: 30%");

        }
        // MULTIPLE TICKET PURCHASE

        System.out.println("Tickets purchached: " + tickets );
        totalCost =  (int) (tickets * basePrice);
        System.out.println("Total Cost: R" + totalCost );

        // Operator Precedence
        System.out.println("Seat Test:");
        System.out.println(seatNumber++);
        System.out.println(seatNumber);
        System.out.println(++seatNumber);
        System.out.println(seatNumber);
    }
}
