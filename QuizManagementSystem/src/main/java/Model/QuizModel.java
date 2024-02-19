
package Model;


public class QuizModel {
    private String sub="";
    private String marks="";
    private int attempt=0;
    private String stuName="";
    
    public QuizModel(String sub, String marks, int attempt,String stuName){
        this.sub=sub;
        this.marks=marks;
        this.attempt=attempt;
        this.stuName=stuName;
    }
    
    public String getSub(){
        return sub;
    }
    
    public String getMarks(){
        return marks;
    }
    
    public int getAttempt(){
        return attempt;
    }
    
    public String getStuName(){
        return stuName;
    }
}
