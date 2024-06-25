package pe.edu.upc.renstate;

//import org.junit.jupiter.api.Test;

//import org.springframework.boot.test.context.SpringBootTest;

//package com.testRenstate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PropiedadManagerTest {

	@Test
    public void testPublicarPropiedadExitosa() {
       
        TestingFramework.loginAsUser("arrendador456");

        
        DetallesPropiedad detallesPropiedad = new DetallesPropiedad("Av. Principal 123", new String[]{"3 dormitorios", "2 baños", "amoblado"}, 1500);

        String resultado = Lambders.publicarPropiedad(detallesPropiedad);

        assertEquals("Publicación exitosa", resultado);
    }

    @Test
    public void testPublicarPropiedadConInformacionIncompleta() {
        
        TestingFramework.loginAsUser("arrendador456");

        
        DetallesPropiedad detallesPropiedadIncompleta = new DetallesPropiedad("Av. Principal 123", null, 1500);

        String resultado = Lambders.publicarPropiedad(detallesPropiedadIncompleta);

        assertEquals("Error: Información incompleta. Por favor, complete todos los campos requeridos.", resultado);
    }

    
    static class TestingFramework {
        public static void loginAsUser(String usuario) {
            
        }
    }

    
    static class DetallesPropiedad {
        private String direccion;
        private String[] caracteristicas;
        private double precio;

        public DetallesPropiedad(String direccion, String[] caracteristicas, double precio) {
            this.direccion = direccion;
            this.caracteristicas = caracteristicas;
            this.precio = precio;
        }

        
        public String getDireccion() {
            return direccion;
        }

        public String[] getCaracteristicas() {
            return caracteristicas;
        }

        public double getPrecio() {
            return precio;
        }
    }

    
    static class Lambders {
        public static String publicarPropiedad(DetallesPropiedad detallesPropiedad) {
            if (detallesPropiedad.getDireccion() != null && detallesPropiedad.getCaracteristicas() != null && detallesPropiedad.getPrecio() > 0) {
                
                return "Publicación exitosa";
            } else {
                return "Error: Información incompleta. Por favor, complete todos los campos requeridos.";
            }
        }
    }

}
