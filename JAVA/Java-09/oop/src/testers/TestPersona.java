package testers;

import oop.clases.persona;

public class TestPersona {
    public static void main(String[] args) {
        persona p = new persona();
        System.out.println("--> "+ p.nombre);
        p.setnombre("Maria");
        System.out.println(">>> "+p.getnombre());
        
        persona p0 = new persona("Pepe");
        System.out.println("--> "+p0.getNombre());
    
         
        persona p1 =new persona("Tata " + "", 90 , 1.85, 85.3,"Sagitario");
        System.out.println("---> "+ p1.datosPersona());
        
    }
}
