class Movie_encaps{
    private String name;
    private float rating;

    public void setName(String name){
        this.name=name;
    }
    public void setRating(float rating){
        this.rating=rating;
    }
    public String getName(){
        return name;
    }
    public float getRating(){
        return rating;
    }
    public void displayMovie(){
        System.out.println("Name: "+name+"\nRating: "+rating);
    }

    public static void main(String[] args) {
        Movie_encaps m1=new Movie_encaps();

        m1.setName("Pardes");
        m1.setRating((float) 4.5);

        m1.displayMovie();
    }
}