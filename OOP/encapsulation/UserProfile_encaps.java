class UserProfile_encaps{
    private String username;
    private String email;

    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void displayUserProfile(){
        System.out.println("UserName: "+username+"\nEmail: "+email);
    }
    public static void main(String[] args) {
        UserProfile_encaps up1=new UserProfile_encaps();
        up1.setUsername("bh04062007");
        up1.setEmail("abc@gmail.com");
        up1.displayUserProfile();
    }
}