
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class BankGUI here.
 *
 * @author (22067995 Bishal Prasain)
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener
{
    private JFrame frame;

    //scooping ComboBox
    private JComboBox dayCombo_0,monthCombo_0,yearCombo_0,dayCombo_1,monthCombo_1,yearCombo_1;

    //scooping common components
    private JLabel clientnameLabel,issuerbankLabel,bankaccountLabel,cardidLabel_0,balanceamtLabel;
    private JTextField clientnameTxt,issuerbankTxt,bankaccountTxt,cardidTxt_0,balanceamtTxt;

    //scooping components of DebitCard
    private JLabel pinnumberLabel,cardidLabel_1,withdrawalamtLabel,withdrawaldateLabel;
    private JTextField pinnumberTxt,cardidTxt_1,withdrawalamtTxt;

    //scooping components of CreditCard
    private JLabel titleLabel_0,titleLabel_1,titleLabel_2, cvcnumberLabel,interestrateLabel,ExpirationdateLabel,cardidLabel_2,creditlimitLabel,graceperiodLabel;
    private JTextField cvcnumberTxt,interestrateTxt,cardidTxt_2,creditlimitTxt,graceperiodTxt;

    //scooping Buttons
    private JButton addBtn_0,displayBtn_0,displayBtn_1,addBtn_1,withdrawBtn,clearBtn,cancelBtn,setBtn;

    //ArrayList of BankCard
    ArrayList<BankCard> bankCardsArraylists = new ArrayList<BankCard>();

    public BankGUI(){
        //setting label,Textfield, and Buttons

        frame = new JFrame();
        titleLabel_0 = new JLabel("BANK DETAILS");
        titleLabel_1 = new JLabel("DEBIT CARD");
        titleLabel_2 = new JLabel("CREDIT CARD");

        //Setting Font Size of Titles
        Font font_0 = new Font("Arial",Font.BOLD,20);
        Font font_1 = new Font("Arial",Font.BOLD,16);
        Font font_2 = new Font("Arial",Font.BOLD,16);

        clientnameLabel = new JLabel("Client Name:");
        clientnameTxt = new JTextField();

        issuerbankLabel = new JLabel("Issuer Bank:");
        issuerbankTxt = new JTextField();

        bankaccountLabel = new JLabel("Bank Account:");
        bankaccountTxt = new JTextField();

        cardidLabel_0 = new JLabel("Card ID:");
        cardidTxt_0 = new JTextField();

        balanceamtLabel = new JLabel("Balance Amount:");
        balanceamtTxt = new JTextField();

        pinnumberLabel = new JLabel("PIN No:");
        pinnumberTxt = new JTextField();

        cardidLabel_1 = new JLabel("Card Id:");
        cardidTxt_1 = new JTextField();

        withdrawalamtLabel = new JLabel("Withdrawal Amount:");
        withdrawalamtTxt = new JTextField();

        cvcnumberLabel = new JLabel("CVC No:");
        cvcnumberTxt = new JTextField();

        interestrateLabel = new JLabel("Interest Rate:");
        interestrateTxt = new JTextField();

        cardidLabel_2 = new JLabel("Card Id:");
        cardidTxt_2 = new JTextField();

        creditlimitLabel = new JLabel("Credit Limit:");
        creditlimitTxt = new JTextField();

        graceperiodLabel = new JLabel("Grace Period:");
        graceperiodTxt = new JTextField();

        withdrawaldateLabel = new JLabel("Withdrawal Date:");
        String[] days_0 = {"1","2","3","4","5","6","7","8","9","10","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String[] months_0 = {"January", "february", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] years_0 = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};

        //ComboBox for withdrawDate
        dayCombo_0 = new JComboBox(days_0);
        monthCombo_0 = new JComboBox(months_0);
        yearCombo_0 = new JComboBox(years_0);

        JLabel expirationdateLabel = new JLabel("Expiration Date:");
        String[] days_1 = {"1","2","3","4","5","6","7","8","9","10","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String[] months_1 = {"January", "february", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] years_1 = {"2024","2025","2026","2027","2028","2029","2030"};

        dayCombo_1 = new JComboBox(days_1);
        monthCombo_1 = new JComboBox(months_1);
        yearCombo_1 = new JComboBox(years_1);

        displayBtn_0 = new JButton("Display");
        displayBtn_1 = new JButton("Display");
        addBtn_0 = new JButton("Add");
        addBtn_1 = new JButton("Add");

        withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setBackground(new Color(154, 232, 74));
        clearBtn = new JButton("Clear");
        clearBtn.setBackground(new Color(232, 229, 74));

        cancelBtn = new JButton("Cancel");
        cancelBtn.setBackground(new Color(235, 82, 82));
        setBtn = new JButton("Set");

        titleLabel_0.setBounds(340,27,200,20);
        titleLabel_0.setFont(font_0);
        titleLabel_1.setBounds(96,351,200,20);
        titleLabel_1.setFont(font_1);
        titleLabel_2.setBounds(652,351,200,20);
        titleLabel_2.setFont(font_2);

        clientnameLabel.setBounds(253,95,81,20);
        clientnameTxt.setBounds(366,91,218,32);

        issuerbankLabel.setBounds(253,145,78,20);
        issuerbankTxt.setBounds(366,139,218,32);

        bankaccountLabel.setBounds(252,193,90,20);
        bankaccountTxt.setBounds(366,187,218,32);

        cardidLabel_0.setBounds(252,242,50,20);
        cardidTxt_0.setBounds(366,236,218,32);

        balanceamtLabel.setBounds(252,291,106,20);
        balanceamtTxt.setBounds(366,285,218,32);

        pinnumberLabel.setBounds(9,404,80,20);
        pinnumberTxt.setBounds(143,400,218,32);

        cardidLabel_1.setBounds(9,536,50,20);
        cardidTxt_1.setBounds(143,530,218,32);

        withdrawalamtLabel.setBounds(9,586,124,20);
        withdrawalamtTxt.setBounds(143,580,218,32);

        cvcnumberLabel.setBounds(496,408,59,20);
        cvcnumberTxt.setBounds(609,404,218,32);

        interestrateLabel.setBounds(496,456,84,20);
        interestrateTxt.setBounds(609,454,218,32);

        expirationdateLabel.setBounds(496,503,101,24);

        cardidLabel_2.setBounds(496,657,50,20);
        cardidTxt_2.setBounds(609,651,218,32);

        creditlimitLabel.setBounds(496,707,75,20);
        creditlimitTxt.setBounds(609,707,218,32);

        graceperiodLabel.setBounds(496,757,86,20);
        graceperiodTxt.setBounds(609,751,218,32);

        withdrawaldateLabel.setBounds(9,636,105,20);

        dayCombo_0.setBounds(140,630,55,26);
        monthCombo_0.setBounds(195,630,83,26);
        yearCombo_0.setBounds(278,630,83,26);

        dayCombo_1.setBounds(609,504,55,26);
        monthCombo_1.setBounds(664,504,83,26);
        yearCombo_1.setBounds(747,504,83,26);

        displayBtn_0.setBounds(194,701,101,32);
        displayBtn_1.setBounds(712,811,101,32);
        addBtn_0.setBounds(145,466,101,32);
        addBtn_1.setBounds(662,570,101,32);
        withdrawBtn.setBounds(78,701,101,32);
        clearBtn.setBounds(133,867,101,32);
        cancelBtn.setBounds(669,867,86,32);
        setBtn.setBounds(598,811,101,32);

        displayBtn_0.addActionListener(this);
        displayBtn_1.addActionListener(this);
        addBtn_0.addActionListener(this);
        addBtn_1.addActionListener(this);
        withdrawBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
        setBtn.addActionListener(this);

        frame.add(titleLabel_0);
        frame.add(titleLabel_1);
        frame.add(titleLabel_2);
        frame.add(clientnameLabel);
        frame.add(clientnameTxt);
        frame.add(issuerbankLabel);
        frame.add(issuerbankTxt);
        frame.add(bankaccountLabel);
        frame.add(bankaccountTxt);
        frame.add(cardidLabel_0);
        frame.add(cardidTxt_0);
        frame.add(balanceamtLabel);
        frame.add(balanceamtTxt);
        frame.add(pinnumberLabel);
        frame.add(pinnumberTxt);
        frame.add(cardidLabel_1);
        frame.add(cardidTxt_1);
        frame.add(withdrawalamtLabel);
        frame.add(withdrawalamtTxt);

        frame.add(cvcnumberLabel);
        frame.add(cvcnumberTxt);
        frame.add(interestrateLabel);
        frame.add(interestrateTxt);
        frame.add(cardidLabel_2);
        frame.add(cardidTxt_2);
        frame.add(creditlimitLabel);
        frame.add(creditlimitTxt);
        frame.add(graceperiodLabel);
        frame.add(graceperiodTxt);

        frame.add(withdrawaldateLabel);

        frame.add(dayCombo_0);
        frame.add(monthCombo_0);
        frame.add(yearCombo_0);

        frame.add(expirationdateLabel);

        frame.add(dayCombo_1);
        frame.add(monthCombo_1);
        frame.add(yearCombo_1);

        frame.add(addBtn_0);
        frame.add(addBtn_1);
        frame.add(displayBtn_0);
        frame.add(displayBtn_1);
        frame.add(withdrawBtn);
        frame.add(clearBtn);
        frame.add(cancelBtn);
        frame.add(setBtn);

        frame.setSize(850,950);
        frame.getContentPane().setBackground(new Color(214, 219, 213));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //main method for creating an object of class BankGUI
    public static void main(String[] args){
        BankGUI obj = new BankGUI();
    }

    //event Listener
    public void actionPerformed(ActionEvent e){
        //implementing Event Listener of add button of Debit Card
        if (e.getSource()== addBtn_0){

            if(balanceamtTxt.getText().isEmpty() || cardidTxt_0.getText().isEmpty()||bankaccountTxt.getText().isEmpty()||  issuerbankTxt.getText().isEmpty()|| clientnameTxt.getText().isEmpty()|| pinnumberTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"Text field cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    ////getting input values from text fields
                    double BalanceAmount = Double.parseDouble(balanceamtTxt.getText());
                    int cardId = Integer.parseInt(cardidTxt_0.getText());
                    String bankAccount = bankaccountTxt.getText();
                    String issuerBank = issuerbankTxt.getText();
                    String clientName = clientnameTxt.getText();
                    int pinNumber = Integer.parseInt(pinnumberTxt.getText());
                    //adding flag to keep track of an object
                    boolean toAdd = true;
                    DebitCard debitCard;

                    if(bankCardsArraylists.isEmpty()){
                        debitCard = new DebitCard(BalanceAmount,cardId,bankAccount,issuerBank,clientName,pinNumber);
                        bankCardsArraylists.add(debitCard);
                        JOptionPane.showMessageDialog(frame,"Debit Card has been added Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else{
                        for(BankCard card:bankCardsArraylists){

                            if(card instanceof DebitCard){
                                debitCard = (DebitCard) card;

                                if(debitCard.getCardId()==cardId){
                                    JOptionPane.showMessageDialog(frame,"DebitCard cannot be added", "Input Error", JOptionPane.ERROR_MESSAGE);
                                    toAdd = false;
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Debit Card cannot be added", "Input Error", JOptionPane.ERROR_MESSAGE);
                                toAdd = false;
                                break;
                            }
                        }

                        if(toAdd == true){
                            debitCard = new DebitCard(BalanceAmount,cardId,bankAccount,issuerBank,clientName,pinNumber);
                            bankCardsArraylists.add(debitCard);
                            JOptionPane.showMessageDialog(frame,"Debit Card has been added Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }

                    }

                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Invalid Input", "Input Error", JOptionPane.ERROR_MESSAGE);
                }    
            }
        }

        //implementing Event Listener of add Button of credit Card    
        if (e.getSource()== addBtn_1){
            if(cardidTxt_0.getText().isEmpty()||clientnameTxt.getText().isEmpty()||issuerbankTxt.getText().isEmpty()||bankaccountTxt.getText().isEmpty()||balanceamtTxt.getText().isEmpty()||cvcnumberTxt.getText().isEmpty()||interestrateTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"Text field cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    //getting input values from text fields
                    int cardId = Integer.parseInt(cardidTxt_0.getText());
                    String clientName = clientnameTxt.getText();
                    String issuerBank = issuerbankTxt.getText();
                    String bankAccount = bankaccountTxt.getText();
                    double BalanceAmount = Double.parseDouble(balanceamtTxt.getText());
                    int CVCNumber = Integer.parseInt(cvcnumberTxt.getText());
                    double interestRate = Double.parseDouble(interestrateTxt.getText());
                    String days_1 = (String) dayCombo_1 .getSelectedItem();
                    String months_1 = (String) monthCombo_1.getSelectedItem();
                    String years_1 = (String) yearCombo_1.getSelectedItem();
                    String expirationDate = days_1 + " " + months_1 + " " + years_1;
                    boolean toAdd = true;
                    CreditCard creditCard;

                    if(bankCardsArraylists.isEmpty()){

                        creditCard = new CreditCard(BalanceAmount,cardId,bankAccount,issuerBank, clientName, CVCNumber, interestRate,expirationDate);
                        bankCardsArraylists.add(creditCard);
                        JOptionPane.showMessageDialog(frame,"Credit Card has been added Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        for(BankCard card:bankCardsArraylists){

                            if(card instanceof CreditCard){
                                creditCard = (CreditCard) card;
                                if(creditCard.getCardId()==cardId){
                                    JOptionPane.showMessageDialog(frame,"Credit Card cannot be added", "Input Error", JOptionPane.ERROR_MESSAGE);
                                    toAdd = false;
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Card  not found", "Input Error", JOptionPane.ERROR_MESSAGE);
                                toAdd = false;
                                break;
                            }
                        }

                        if(toAdd == true){
                            creditCard = new CreditCard(BalanceAmount,cardId,bankAccount,issuerBank, clientName, CVCNumber, interestRate,expirationDate);
                            bankCardsArraylists.add(creditCard);
                            JOptionPane.showMessageDialog(frame,"Credit Card has been added Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }

                    }

                }

                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Invalid Input", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //impementing Event Listener of display button for DebitCard
        if (e.getSource()== displayBtn_0){

            //retrieving values from text fields
            String days_0 =(String) dayCombo_0.getSelectedItem();
            String months_0 =(String) monthCombo_0.getSelectedItem();
            String years_0 =(String) yearCombo_0.getSelectedItem();
            String dateOfWithdrawal = days_0 + " " + months_0 + " "+ years_0;

            if (bankCardsArraylists.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Card has not been added,nothing to display","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(BankCard card:bankCardsArraylists){

                    if(card instanceof DebitCard){
                        DebitCard debitCard = (DebitCard) card;
                        //calling display method from DebitCard class
                        debitCard.display();

                        String popUp_1 = "Card Id: " + cardidTxt_0.getText() + "\nIssuer Bank:" +issuerbankTxt.getText() + "\nBank Account" +bankaccountTxt.getText()+ "\nBalance Amount" +balanceamtTxt.getText()+ "\nClient Name:"+clientnameTxt.getText()+ "\nPinNumer:" +pinnumberTxt.getText()+ "\nWithdrawal Amount:" +withdrawalamtTxt.getText()+ "\nDate Of Withdrawal:"+dateOfWithdrawal;
                        JOptionPane.showMessageDialog(frame,popUp_1,"Info",JOptionPane.INFORMATION_MESSAGE);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Debit Card not Found", "Error", JOptionPane.ERROR_MESSAGE);   
                    }
                }
            }
        }

        //implementing Action Listener of display button for credit card
        if (e.getSource() == displayBtn_1){

            //retrieving values from text fields
            String days_1 =(String) dayCombo_0.getSelectedItem();
            String months_1 =(String) monthCombo_0.getSelectedItem();
            String years_1 =(String) yearCombo_0.getSelectedItem();
            String expirationDate = days_1 + " " + months_1 + " "+ years_1;

            if (bankCardsArraylists.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Card has not been added,nothing to display","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(BankCard card:bankCardsArraylists){

                    if(card instanceof CreditCard){
                        CreditCard creditCard = (CreditCard) card;
                        //calling display method from DebitCard class
                        creditCard.display();

                        String popUp_2 = ("Client Name:"+clientnameTxt.getText()+ "\nCard Id: " + cardidTxt_2.getText() + "\nIssuer Bank:" +issuerbankTxt.getText() + "\nBank Account" +bankaccountTxt.getText()+ "\nBalance Amount" +balanceamtTxt.getText()+ "\nCVC NO.:" +cvcnumberTxt.getText()+ "\nInterestRate:"+interestrateTxt.getText()+"\nCredit Limit:"+creditlimitTxt.getText()+ "\nGrace Period:" +graceperiodTxt.getText()+ "\nExpiration Date:" +expirationDate);
                        JOptionPane.showMessageDialog(frame,popUp_2,"Info",JOptionPane.INFORMATION_MESSAGE);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Debit Card not Found", "Error", JOptionPane.ERROR_MESSAGE);   
                    }
                }
            }
        }

        //implementing Event Listener of withdraw button
        if (e.getSource()==withdrawBtn){
            if(cardidTxt_1.getText().isEmpty()||withdrawalamtTxt.getText().isEmpty()||pinnumberTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"Text field cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    //retrieving values from text fields
                    int cardId = Integer.parseInt(cardidTxt_1.getText());
                    int withDrawalAmount = Integer.parseInt(withdrawalamtTxt.getText());
                    int pinNumber = Integer.parseInt(pinnumberTxt.getText());
                    String days_0 =(String) dayCombo_0.getSelectedItem();
                    String months_0 =(String) monthCombo_0.getSelectedItem();
                    String years_0 =(String) yearCombo_0.getSelectedItem();
                    String dateOfWithdrawal = days_0 + " " + months_0 + " "+ years_0;
                    boolean availableCard = false;
                    if(bankCardsArraylists.isEmpty()){

                        JOptionPane.showMessageDialog(frame,"Card has not been added","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else{ //if debit card is already present:

                        for(BankCard card:bankCardsArraylists){
                            if(card instanceof DebitCard){
                                //downcast
                                DebitCard debitCard = (DebitCard) card;
                                if(debitCard.getCardId() == cardId && debitCard.getPinNumber()==pinNumber){
                                    double initialAmount = debitCard.getBalanceAmount();
                                    debitCard.Withdraw(withDrawalAmount,dateOfWithdrawal,pinNumber);
                                    double remainingAmount = initialAmount - withDrawalAmount;
                                    if(withDrawalAmount > 0){
                                        if( withDrawalAmount<=initialAmount){

                                            String popUp_0 ="Amount has been withdrawn successfully,your remaining balance is:"+ remainingAmount+ "\nCard Id: " + cardId + "\nWithdrawal Amount: " +withDrawalAmount + "\nDate Of Withdrawal: " +dateOfWithdrawal + "\nPIN Number:" +pinNumber;
                                            JOptionPane.showMessageDialog(frame,popUp_0,"Info", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(frame,"Dear user,You have insufficient Balance", "Alert", JOptionPane.ERROR_MESSAGE);

                                        }
                                    }

                                    else{
                                        JOptionPane.showMessageDialog(frame,"Please input valid number", "Error", JOptionPane.ERROR_MESSAGE); 

                                    }
                                    availableCard = true;
                                    break;

                                }
                            }
                        }
                        if(!availableCard){
                            JOptionPane.showMessageDialog(frame,"Your CardId or Pin Number is incorrect", "Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }

                }     catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
        //implementing Event Listener of set Button
        if (e.getSource() == setBtn){

            try{
                //retrieving values form text fields
                int cardId = Integer.parseInt(cardidTxt_2.getText());
                double newCreditLimit  =  Double.parseDouble(creditlimitTxt.getText());
                int newgracePeriod  =  Integer.parseInt(graceperiodTxt.getText());
                boolean availableCard = false;
                if(bankCardsArraylists.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Card has not been added","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{ //if debit card is already present:

                    //loop through the array list
                    for(BankCard card:bankCardsArraylists){
                        // cheking if the object of card is debitCard or not
                        if(card instanceof CreditCard){
                            //downcast  
                            CreditCard creditCard = (CreditCard) card;
                            if(creditCard.getCardId() == cardId){
                                availableCard = true;
                                //calling setCreditLimit method from CreditCard Class
                                creditCard.setCreditLimit(newCreditLimit,newgracePeriod);
                                if(newCreditLimit<=2.5*creditCard.getBalanceAmount()){
                                    JOptionPane.showMessageDialog(frame,"CreditLimit has been set:\nnew Credit Limit:"+newCreditLimit+"\nnew Grace Period:"+newgracePeriod,"Alert", JOptionPane.INFORMATION_MESSAGE);

                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Credit limit cannot be issued", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                //breaking the loop after finding valid card ID
                                break;

                            }
                        }
                    }

                    if(!availableCard){
                        JOptionPane.showMessageDialog(frame,"Matching card not found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }  catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == cancelBtn){
            try{
                int cardId = Integer.parseInt(cardidTxt_2.getText());
                double newCreditLimit  =  Double.parseDouble(creditlimitTxt.getText());
                int newgracePeriod  =  Integer.parseInt(graceperiodTxt.getText());

                if(bankCardsArraylists.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Card has not been added","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{ 
                    //loop through the array list

                    for(BankCard card:bankCardsArraylists){
                        //is the card debit card or not?
                        if(card instanceof CreditCard){
                            //downcast
                            CreditCard creditCard = (CreditCard) card; 
                            if(creditCard.getCardId() == cardId){

                                //calling cancelCreditcard method from CreditCard Class
                                creditCard.cancelCreditcard();
                                creditlimitTxt.setText("");
                                graceperiodTxt.setText("");
                                cardidTxt_2.setText("");

                                JOptionPane.showMessageDialog(frame,"Credit Card has been Cancelled","Alert", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Dear user,your Card Id is incorrect", "Error", JOptionPane.ERROR_MESSAGE);     

                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Card not found", "Error", JOptionPane.ERROR_MESSAGE);

                        }

                    }
                }
            }

            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }  

        //implementing Action Listener of display button for clearBt
        if(e.getSource() ==clearBtn){
            //Setting every textfield to empty
            balanceamtTxt.setText("");
            bankaccountTxt.setText("");
            issuerbankTxt.setText("");
            clientnameTxt.setText("");
            pinnumberTxt.setText("");
            cardidTxt_0.setText("");
            cardidTxt_1.setText("");
            cardidTxt_2.setText("");
            clientnameTxt.setText("");
            cvcnumberTxt.setText("");
            graceperiodTxt.setText("");
            interestrateTxt.setText("");
            withdrawalamtTxt.setText("");
        }
    }
}   