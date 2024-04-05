public class Main {
    public static void main(String[] args) {
       



        Mensaje nuevo = (nombre) -> {System.out.println("El nombre ingresado fue ... "+nombre); return nombre.toUpperCase();}; 

        

        System.out.println(nuevo.saludar("Juan"));
    }
}
