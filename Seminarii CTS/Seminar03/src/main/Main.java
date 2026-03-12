package main;
import acs.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        //Hotel hotel=new Hotel();
        Hotel hotel1=Hotel.getInstance("Intercontinental", 7, 5);
        Hotel hotel2=Hotel.getInstance("MegaHotel", 200, 0);
        //in spate am aceeasi instanta de aia este singleton
        //lucrare punctaj implementare si testare, ca sa arat ca oricate as implementa, in spate am aceeasi instanta(aici de la Intercontinental)



        hotel1.rezervaCamera();
        hotel1.rezervaCamera();
        hotel2.rezervaCamera();
        hotel2.rezervaCamera();


    }
}