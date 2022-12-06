import java.util.ArrayList;
import java.util.List;


public class Loteria {


    public Loteria() {
    }
    public List<Integer> JugadaSuperKino(){
        List<Integer> jugadaSK = new ArrayList<>();
        
        for(int i=1;i<=10; i++)
        {
            int aleatorios=(int) (Math.random()*81+1);
            jugadaSK.add(aleatorios);
            //System.out.println(aleatorios);
        }
        return jugadaSK;
    }
    public List<Integer> SorteoSuperKino(){
        List<Integer> sorteoSK = new ArrayList<>();
        
        for(int i=1;i<=20; i++)
        {
            int aleatorios=(int) (Math.random()*81+1);
            sorteoSK.add(aleatorios);
            //System.out.println(aleatorios);
        }
        return sorteoSK;
       
    }
    public ArrayList<Integer> ConfirmarJugada(){

        ArrayList<Integer> a1 = (ArrayList<Integer>) JugadaSuperKino();
        ArrayList<Integer> a2 = (ArrayList<Integer>) SorteoSuperKino();
        
        a1.retainAll(a2);
        //System.out.println("Los numeros en comunes son:" + a1);
        //System.out.println("");
        //System.out.println("a1 es un arreglo de " + a1.size() + " elementos");
        //System.out.println("");

        int nelementos = a1.size();
        if (nelementos == 0) {
            System.out.println("Fellicidades!!. Usted a ganado 80 pesos.");
        }else if (nelementos == 5) {
            System.out.println("Felicidades!!. Usted a ganado 60 pesos.");
        }else if (nelementos == 6) {
            System.out.println("Fellicidades!!. Usted a ganado 300 pesos.");
        }else if (nelementos == 7) {
            System.out.println("Fellicidades!!. Usted a ganado 1,000 pesos.");
        }else if (nelementos == 8) {
            System.out.println("Fellicidades!!. Usted a ganado 10,000 pesos.");
        }else if (nelementos == 9) {
            System.out.println("Fellicidades!!. Usted a ganado 150,000 pesos.");
        }else if (nelementos == 10) {
            System.out.println("Fellicidades!!. Usted a ganado 25 millones de pesos.");
        } else{
            System.out.println("No hubo acierto, Buena Suerte en su proxima jugada!!");
        }        

        return a1;
        
    }

}
