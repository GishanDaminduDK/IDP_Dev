public class Book {
    private String title;
    private String author;
    private int numberofpages;

    public Book(String title, String author, int numberofpages){
        this.title=title;
        this.author=author;
        this.numberofpages=numberofpages;

    }
    public void displayINfo(){
        System.out.println("Title:"+title);
        System.out.println("Author:" + author);
        System.out.println("Numberofpages:" + numberofpages);
    }

}
