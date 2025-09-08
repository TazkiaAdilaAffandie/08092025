public class Book {
    //properties 
    private String title;
    private int year;
    private double price;

    //constructor Default -->namanya sama dengan nama class
    public Book(){
        title = "Atomic Habits";
        year = 2018;
        price = 91.08;

    }

    //Constructor with parameter 
public Book(String title, int year, double price){
    this.title = title;
    this.year = year;
    this. price = price;
}

//Getter dan Setter
public String getTitle() {
    return title;
}
public void setTitle(  String Title) {
    this.title = title;
}

//method
public void display(){
System.out.println("Title of the book: "+ title);
System.out.println("Year of the book that is released on: "+ year);
System.out.println("Price of the book: "+ price);
}
    
}
    



    



    

