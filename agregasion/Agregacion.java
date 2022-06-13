public class Agregacion {

    public static void main(String[] args) {
        Celular c1= new Celular ("A10PRO", 2, 2);
            
        Chip entel = new Chip("Entel", 9632198);
        Chip movistar = new Chip("Movistar", 986565);
        
        c1.agregarChip(entel);
        c1.agregarChip(movistar);
        
        c1.mostrar();
        }
    
}