
package Model;


public class BookModel {
    private String bookId;
    private String bookName;
    private String author;
    private String status;
    
    
    public BookModel(String bookId,String bookName,String author, String status){
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
        this.status=status;
    }
    
    public String getBookId(){
        return bookId;
    }
    
     public String getName(){
        return bookName;
    }
     
      public String getAuthor(){
        return author;
    }
      
       public String getStatus(){
        return status;
    }
}
