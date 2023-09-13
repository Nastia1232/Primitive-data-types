public class Main {
    public static void main(String[] args) {

        double ticketPrice = 13676;
        double milesPerRuble = 20;


        int milesEarned = (int) (ticketPrice / milesPerRuble);


        System.out.println("За билет стоимостью " + ticketPrice + " рублей начислено " + milesEarned + " миль.");
    }
}
