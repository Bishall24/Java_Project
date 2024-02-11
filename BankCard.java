
/**
 * Write a description of class BankCard here.
 *
 * @author (22067995 Bishal Prasain)
 * @version (1.0.0)
 */
public class BankCard
{
    //Attribute for BankCard class
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double BalanceAmount;
    //constructor
    public BankCard(double BalanceAmount,int cardId,String bankAccount,String issuerBank)
    {
        //Assigning attributes with parameter values
        this.clientName=""; //initializing to an empty String;
        this.BalanceAmount=BalanceAmount;
        this.cardId=cardId;
        this.bankAccount=bankAccount;
        this.issuerBank=issuerBank;
    }
    
     public int getCardId(){
            return cardId;
    }

      public String getClientName(){
            return clientName;
    }
    
    public void setClientName(String clientName){
             this.clientName=clientName;
        }
        
    public double getBalanceAmount(){
            return BalanceAmount;
        }
        
    public void setBalanceAmount(double BalanceAmount){
            this.BalanceAmount=BalanceAmount;
        }
        
    public void display(){
            System.out.println("Card ID=" +this.cardId);
            System.out.println("Issuer Bank=: " +this.issuerBank);
            System.out.println("Bank Account=: " +this.bankAccount);
            System.out.println("Balance Amount=: " +this.BalanceAmount);
            if(clientName==""){//Checking if clientName equals null value
                System.out.println("oops!! you must have client name assigned");
            }
            else{
                System.out.println("Client Name:"+this.clientName);
            }
        }
    }
    
    
    
       

    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        