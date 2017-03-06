class Money{

    public static void main(){
        Scanner in = new Scanner(System.in);
        
        // Get user input, and send to method
        getChange(in.nextInt());
    }
    
    public static void getChange(int amount) {
    
        //Remove dollars
        int _dollars = amount/100;
        amount %= 100;
        
         // Remove Quarters
        int _quarters = amount/25;
        amount %= 25;

         // Remove Dimes
        int _dimes = amount/10;
        amount %= 10;

         // Remove Nickels
        int _nickels = amount/5;
        amount %= 5;

        System.out.println(" Quarters:" + _quarters);
        System.out.println(" Dimes:" + _dimes);
        System.out.println(" Nickels:" + _nickels);
        System.out.println(" Pennies:" + amount);
    }
    
}
