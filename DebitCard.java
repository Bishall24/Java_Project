  
/**
 * Write a description of class DebitCard here.
 *
 * @author (Bishal Prasain)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{   //Attributes
    private int pinNumber;
    private int withDrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    

    public DebitCard(double BalanceAmount,int cardId,String bankAccount,String issuerBank,
     String clientName,int pinNumber){
     
     super(BalanceAmount,cardId,bankAccount,issuerBank);//Inheriting constructor from parent class 
     super.setClientName(clientName);//Inheriting mutator setClientName(clientName) from parent class
     //Assigning attributes with parameter values
     this.pinNumber = pinNumber;
     this.hasWithdrawn = false;
     }
     
    
    public int getPinNumber(){
        return pinNumber;
    }

    public int getWithDrawalAmount(){
        return withDrawalAmount;
    }

    public String getDateOfWithDrawal(){
        return dateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn(){
        return hasWithdrawn;
    }
    
    
    public void setWithDrawalAmount(int withDrawalAmount){
        this.withDrawalAmount=withDrawalAmount;
    }
    
    public void Withdraw(int withDrawalAmount,String dateOfWithdrawal,int pinNumber){
        if (this.pinNumber == pinNumber){//Checking if the pin number passed as parameters to Withdraw method equalizes the pin number of the current class
            if(withDrawalAmount <= super.getBalanceAmount()){//Checking if withDrawalAmount is less or equal to BalanceAmount of Parent class
            this.hasWithdrawn = true;
            super.setBalanceAmount(super.getBalanceAmount()-withDrawalAmount);//Setting new balance amount with the help of mutator(overiding)
            this.withDrawalAmount = withDrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            
            System.out.println("Successfully withdrawn,Remaining Amount:" +super.getBalanceAmount());
            }
                else{
                    System.out.println("You have insufficient Balance");
                }
            } else{
                System.out.println("You have entered invalid pinnumber");
            }
        }
    //method
    public void display(){
        super.display();//inheriting display method from parent class
        System.out.println("Pin Number:"+this.pinNumber);
        if(hasWithdrawn == true){//Verifying if withdrawn process has been carried out.
            System.out.println("Withdrawal Amount:"+this.withDrawalAmount);
            System.out.println("Date Of Withdrawal:"+this.dateOfWithdrawal);
            }
            else{
                 System.out.println("No any withdrawal has been made so far,Balance Amount:"+super.getBalanceAmount());
            }
    }
}

