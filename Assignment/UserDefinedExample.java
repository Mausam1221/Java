class MinBalanceException extends Exception{
    public MinBalanceException(){
        System.out.println("Balance is low");
    }
}
public class UserDefinedExample{
    public static void main(String args[]){
        try{
            int acc[]={100,101,102,103,104,105};
            double balance[]={900,2000,5000,1560,1765.50};
            for(int i=0;i<5;i++){
                System.out.println("Account no:"+acc[i]+" "+"Balance: "+balance[i]);
                if(balance[i]<1000){
                    throw new MinBalanceException();
                }

            }
        }
            catch (MinBalanceException e){
                System.out.println("Exception caught");
            }
        }
    }

    
