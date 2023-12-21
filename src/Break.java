public class Break {

    public static void main(String[] args){
        for (int i = 0; i < 10 ; i++){ 	
            if(i == 5){ 		
                break; 	 
                //continue; 
            } 	
        
            System.out.print(i); }

        //si utilizamos break, el programa imprimirá los numero de el 0 al 4 si utilizamos continue, el programa imprimirla los numero del 0 al 9, excepto el 5.
    }
}