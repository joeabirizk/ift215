package project;

public class code{
 private int amount;
     private String type;
     private int nbOfyears;
     private int rate;
     private static final String bankName="Bank of Beirut";
    
    public code(int amount, String type, 
            int nbOfYears, int rate){
        this.amount=amount;
        this.type=type;
        this.nbOfyears=nbOfyears;
        this.rate=rate;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int amount){
        this.amount=amount;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type=type;
    }
    
    public int getnbOfYears(){
        return nbOfyears;
    }
    
    public void setnbOfyears(int nbOfyears){
        this.nbOfyears=nbOfyears;
    }
    
    public int getRate(){
        return rate;
    }
    
    public void setRate(int rate){
        this.rate=rate;
    }
    
    public int getMonthlypayment(){
         int monthlyPayment;
        monthlyPayment= (amount+(amount*rate/100*nbOfyears))/(12*nbOfyears);
                return monthlyPayment;
    }
}
