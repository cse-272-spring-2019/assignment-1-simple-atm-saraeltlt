

public class transaction {



    //variables>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    String[] trans= new String[15];
    private int balance =0;
    public int i=0;


    //withdraw>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public  int withdrawM (int withdraw) {
    if (balance>=withdraw && withdraw!=0){
        balance = balance - withdraw;
        trans[i]="withdraw= "+ withdraw;
        i++;
        return 1;
    }
    else if (withdraw==0)
        return 0;
    else
        return -1;
}


    //deposit>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void depositM ( int deposit){
        balance = balance + deposit;
         trans[i]= "deposit= "+deposit;
          i++;
      }


    //balance >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void returnbalanceH(){
        trans[i]="balance= " + balance;
        i++;
    }
    public int getBalance (){ return balance; }



    //operations for history >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public int decI(){
         i--;
         return i;
        }

    public int incI(){
        i++;
        return i;
        }
    public int getI() {return i; }



    public String[] getTrans() { return trans;}




}