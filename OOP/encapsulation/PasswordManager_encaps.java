class PasswordManager_encaps{
    private String username;
    private String password;

    public PasswordManager_encaps(String username, String password){
        this.username=username;
        this.password=password;
    }

    public boolean changePassword(String oldpwd, String newpwd){
        if(this.password.equals(oldpwd)){
            this.password=newpwd;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPasswordStrong(){
        if(password.length() < 6){
            return false;
        }
        if(password.contains(username)){
            return false;
        }
        boolean flag=false;
        for(char Char: this.password.toCharArray()){
            if(Character.isDigit(Char)){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        PasswordManager_encaps pm1=new PasswordManager_encaps("bhagya","abc123");

        System.out.println(pm1.isPasswordStrong());
        boolean result=pm1.changePassword("abc123","a1b2c3");
        System.out.println(result);
    }
}