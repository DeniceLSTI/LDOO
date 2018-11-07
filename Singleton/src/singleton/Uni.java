
package singleton;


public class Uni {
    
    private static Uni instance;
    private String nombreUni;
    
    private Uni (){
    }
    
    public static Uni getinstance(){
        if(instance == null){
           instance = new Uni();
        }
        return instance;
    
    }

    
    public String getNombreUni() {
        return nombreUni;
    }

    
    public void setNombreUni(String nombreUni) {
        this.nombreUni = nombreUni;
    }
    
    
    
    
}
