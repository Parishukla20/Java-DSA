//Packages in Java and access modifier 

package bank;

class Account{
    public String name;     //can be accessible by any class or an package
    protected String email;   // can be accessible in currnt package , also in another package but in only sub-classes of that package   
    private String password;  
}

public class NinetySeven {
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name = "customer1";
        acc1.email = "parishuklagmail.com";
        //acc1.password ="abcd"; having error beacuse it is not accessible
    }
}
