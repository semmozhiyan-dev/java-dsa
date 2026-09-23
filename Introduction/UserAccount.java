public class UserAccount {
    private String user_name;
    private String password;
    private String email;
    private int loginAttempts;
    UserAccount(String user_name,String password,String email,int loginAttempts){
        this.user_name=user_name;
        this.password=password;
        this.email=email;
        this.loginAttempts=loginAttempts;
    }
    public String getuser_name(){
        return user_name;
    }
    public String getemail(){
        return email;
    }
    void login(String password){
        
            if(loginAttempts>=3){
                System.out.println("login attempt reached maximum");
                return;
            }
            
            else{
                if(this.password.equals(password)){
                System.out.println("login successfull");
                return;
            }
else(f(loginAttempts==3){
                    System.out.println("locked");
                    return ;
                }
        }}
        public String resetPassword(String oldPassword,String newPassword){
            if(oldPassword.equals(password)){
                this.password=newPassword;
                loginAttempts=0;
                System.out.println("password changed successfully");
            }
            else{
                loginAttempts++;
                System.out.println("password is incorrect");
                if(loginAttempts==3){
                    System.out.println("locked");
                    return ;
                }
            }
            
    }
    public static void main(String[] args){
        UserAccount user1=new UserAccount("sem","sem123","sem@gmail.com",0);
        System.out.println(user1.getuser_name());
        System.out.println(user1.getemail());
        user1.login("3245");
        user1.login("4567");
        user1.login("6789");
        user1.resetPassword("sem","sem12");
        user1.login("sem12");

    }


    
    
}
