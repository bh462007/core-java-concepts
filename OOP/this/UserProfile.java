class UserProfile{
    String username;
    String email;

    public UserProfile(String username, String email){
        this.username=username;
        this.email=email;
    }
    public void showProfile(){
        System.out.println("Username :"+this.username);
        System.out.println("E-mail :"+this.email);
    }

    public static void main(String[] args) {
        UserProfile up=new UserProfile("bh0406","abc@gmail.com");
        up.showProfile();
    }
}