//Getter and Setter method in Java to access private modifiers

package bank;

class Account{
    private String password;
    
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }
}
public class NinetyEight {
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.setPass("abcd");
        System.out.println(acc1.getPass());
    }
}
