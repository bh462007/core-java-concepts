class Book_encaps{
    private String title;
    private String author;
    private float price;

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void printBookInfo(){
        System.out.println("Tite: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
    public static void main(String[] args) {
        Book_encaps b1=new Book_encaps();
        b1.setTitle("xyz");
        b1.setAuthor("abc");
        b1.setPrice(700);

        b1.printBookInfo();
    }
}