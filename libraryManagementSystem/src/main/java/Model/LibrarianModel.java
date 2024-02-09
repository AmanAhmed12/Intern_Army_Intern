
package Model;

public class LibrarianModel {
     private String libId;
    private String username;
    private String password;
    private String status;
    
    
    public LibrarianModel(String libId,String username,String password){
        this.libId=libId;
        this.username=username;
        this.password=password;
    }
    
    
    public String getLibId(){
        return libId;
        
    }
    
     public String getUsername(){
        return username;
        
    }
     
      public String getPassword(){
        return password;
        
    }
      
        public String getStatus(){
        return status;
        
    }
}
