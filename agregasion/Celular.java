
public class Celular {
    private String modelo;
    private int nroChips;
    private Chip[] chips;

   public  Celular(String modelo, int nroChips, int chips){
    this.modelo = modelo;
    this.nroChips = 0;
    this.chips = new Chip[2];
   }
    public void mostrar(){
        System.out.println("Modelo:" +modelo);
        System.out.println("Numero de Chips:" +nroChips);
        for(int i = 0; i < nroChips; i++){
            chips[i].mostrar();
        }
    }
    public void agregarChip(Chip nuevoChip){

        if (nroChips < 2){
            chips[nroChips]=nuevoChip;
            nroChips++;
        }
    } 
}