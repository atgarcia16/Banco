import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();


        LocalDate fecha1 = LocalDate.of(2012, 04, 15);
        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(fecha1, momentoActual);
        
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        Cuenta[] cuentas = {cuenta1, cuenta2};

        Prestamo prestamo1 = new Prestamo(1, 2000f);
        
        Prestamo[] prestamos = {prestamo1};

        if (Cliente.getIngresoMensual() > 2000 && Cliente.calculoAntiguedad() > 12 ) {
            
            ClienteA cliente = new ClienteA ();
        }else if (Cliente.getIngresomensual() > 0) {

            ClienteB clienteb = new Clienteb();
        }else {
            Estudiante estudiante = new Estudiante(null, null, null, null, null, fecha1, cuenta2)
        }

        Long idBucado = 5l;    
        
        Float ingresoMensual = 0f;

        Cliente cliente = new Cliente;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == id) {
                clientes.remove(i);
                
            }
        }

       /*
        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        clientes.add(clienteA1);
        clientes.add(clienteB1);

        System.out.println(clientes); */ 
    }   
}
