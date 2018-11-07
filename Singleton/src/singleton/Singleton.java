
package singleton;


public class Singleton {

    
    public static void main(String[] args) {
       
        Uni universidad = Uni.getinstance();
        universidad.setNombreUni("Universidad Autonoma de Nuevo Leon");
        System.out.println(" Juan Lopez " + universidad.getNombreUni());
        
        Uni universidad2 = Uni.getinstance();
        System.out.println(" Leonardo Castillo " + universidad2.getNombreUni());
    }
    
}
