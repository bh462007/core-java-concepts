class Movie{
    String name;
    int rating;

    public Movie(String name, int rating){
        this.name=name;
        this.rating=rating;
    }
    void displayMovie(){
        System.out.println("Name :"+this.name);
        System.out.println("Rating :"+this.rating);
    }
    public static void main(String[] args) {
        Movie m1=new Movie("Avengers",5);
        m1.displayMovie();

    }
}