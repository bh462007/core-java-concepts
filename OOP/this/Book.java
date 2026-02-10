class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void printDetails(){
        System.out.println("Title :"+this.title);
        System.out.println("Author :"+this.author);
        System.out.println("Price :"+this.price);
    }
    public static void main(String[] args) {
        Book b1=new Book("Secret","Rhonda byrne",800);
        b1.printDetails();
    }
}