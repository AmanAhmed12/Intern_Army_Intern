
package Model;

public class AdminModel {
    private String adminId;
    private String username;
    private String password;
    private String status;
    
    
    public AdminModel(String adminId,String username,String password){
        this.adminId=adminId;
        this.username=username;
        this.password=password;
    }
    
    
    public String getAdminId(){
        return adminId;
        
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
