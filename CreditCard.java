
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067995 Bishal Prasain )
 * @version (a version number or a date)
 */
public class  CreditCard extends BankCard
{
    //Attribute
    private int CVCNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor
    public CreditCard(double BalanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int CVCNumber,double interestRate,String 
    expirationDate){
        super(BalanceAmount,cardId,bankAccount,issuerBank);//Inheriting Constructor from parent clas
        super.setClientName(clientName);//Calling settermethod from parent class
        //Assigning attributes with parameter values
        this.CVCNumber=CVCNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
        }
        
    //Accessor methods
    public int getCVcNUmber(){
        return CVCNumber;
    }
    
    public double getCreditLimit(){
        return creditLimit ;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    public String getExpirationDate(){
        return expirationDate;
    }
    
    public int getGracePeriod(){
        return gracePeriod;
    }
    
    public boolean getIsGranted(){
        return isGranted;
    }
    
    public void setCreditLimit(double newcreditLimit,int newgracePeriod){
        if(newcreditLimit<=(2.5*super.getBalanceAmount())){//Checking if local variable newcreditlimit is less or equal to 2.5 times the current Balanceamount called from parent class
            this.creditLimit=newcreditLimit;
            this.gracePeriod=newgracePeriod;
            this.isGranted=true;
            System.out.println("The credit has been issued:"+newcreditLimit);
        }else{
            System.out.println("The credit amount cannot be granted to the client");
        }
    }
    
    public void cancelCreditcard(){
        this.CVCNumber=0;
        this.creditLimit=0;
        this.gracePeriod=0;
        this.isGranted=false;
    }
    
    public void display(){
        super.display();//Calling method display of super class BankCard
        if(isGranted==true){//verifying if isGranted is equal to "true"
            System.out.println("Credit Limit:"+this.creditLimit);
            System.out.println("Grace Period:"+this.gracePeriod);
            System.out.println("Expiration Date:"+this.expirationDate);
            System.out.println("Interest Rate:"+this.interestRate);
            System.out.println("CVC Number:"+this.CVCNumber);
        }
        else{
            System.out.println("Credit limit cannot be granted");
        }
    }
    
}
