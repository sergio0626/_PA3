public class Main {

    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0); //initialize this
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifytheInterestRate(4.0);
        System.out.println("Month       Saver1        Saver2");


        for(int i=1; i<=12; ++i){

            System.out.print("Month " + i + ":      ");
            saver1.showtheBalance();
            System.out.print("    ");
            saver2.showtheBalance();
            System.out.println();
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println();

        System.out.println("Set the Interest Rate to 5.0%");
        System.out.println();
        SavingsAccount.modifytheInterestRate(5.0);


        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();


        System.out.print("Month 13:     ");
        saver1.showtheBalance();
        System.out.print(" ");
        saver2.showtheBalance();
        System.out.println();
    }
}


class SavingsAccount{     //create class of savingaccount
    static double annualInterestRate = 0.0;
    //initialize 0
    double savingsBalance;


    SavingsAccount(double quant){
        this.savingsBalance = quant;
    }





    void showtheBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }


    static void modifytheInterestRate(double newRate){
        annualInterestRate = newRate; //change this cheeky variable
    }

    void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

}

