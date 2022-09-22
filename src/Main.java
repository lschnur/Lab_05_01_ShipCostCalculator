public class Main
{
    public static void main(String[] args)
    {
        int input =101;
        double shipCost= input*.02;
        double totCost=shipCost+input;

        if(input >= 100)
            System.out.println("Your shipping is free, your total cost is "+input);
        else
            System.out.println("Your shipping cost is "+shipCost+ " and your total cost is "+totCost);
    }
}