//Mdelo
//interface
//repositorio
//servicio
//controlador


package BackReto4_Ciclo4;

import BackReto4_Ciclo4.interfaces.InterfaceOrder;
import BackReto4_Ciclo4.interfaces.InterfaceSupplements;
import BackReto4_Ciclo4.interfaces.InterfaceUser;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Reto4WebApplication implements CommandLineRunner {

    @Autowired
    private InterfaceSupplements interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder ;

    public static void main(String[] args) {
       SpringApplication.run(Reto4WebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll(); 
    }
}