
package javaapplication10;

public class pen {
    public static void main(String[] args) {
        int pen = 3;
        
//        System.out.println("There"+((pen==1)?"Is":"are")+"pen"+((pen==1)?"":"s"));
        String verb,plural;
        
        if(pen==1){
            verb="is";
            plural="";
        } else {
            verb="are";
            plural="s";
        }    
        System.out.println("There"+verb+pen+"pen"+plural);
            
    }
    
}
