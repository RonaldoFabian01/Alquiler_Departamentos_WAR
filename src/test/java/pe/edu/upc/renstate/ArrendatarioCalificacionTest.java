package pe.edu.upc.renstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrendatarioCalificacionTest {

	 @Test
	    public void testCalificarArrendadorExitoso() {
	        // Simular iniciar sesión como arrendatario
	        TestingFramework.loginAsUser("arrendatario123");

	        // Simular acceso al contrato de arrendamiento finalizado
	        Contrato contrato = Lambders.obtenerContrato("id_contrato");

	        // Calificar al arrendador con una calificación válida
	        int calificacion = 4;
	        String comentario = "El arrendador fue muy amable y atento.";
	        String resultado = Lambders.calificarArrendador(contrato.getArrendador(), calificacion, comentario);

	        assertEquals("Calificación exitosa", resultado);
	    }

	    @Test
	    public void testCalificarArrendadorFueraDeRango() {
	        // Simular iniciar sesión como arrendatario
	        TestingFramework.loginAsUser("arrendatario123");

	        // Simular acceso al contrato de arrendamiento finalizado
	        Contrato contrato = Lambders.obtenerContrato("id_contrato");

	        // Intentar calificar al arrendador con una calificación fuera de rango
	        int calificacion = 6;
	        String comentario = "El arrendador fue poco profesional.";
	        String resultado = Lambders.calificarArrendador(contrato.getArrendador(), calificacion, comentario);

	        assertEquals("Error: La calificación debe estar entre 1 y 5 estrellas", resultado);
	    }

	    // Clase TestingFramework para simular el inicio de sesión
	    static class TestingFramework {
	        public static void loginAsUser(String usuario) {
	            // Implementación simulada del inicio de sesión
	        }
	    }

	    // Clase Contrato para representar un contrato de arrendamiento
	    static class Contrato {
	        private String arrendador;

	        public Contrato(String arrendador) {
	            this.arrendador = arrendador;
	        }

	        public String getArrendador() {
	            return arrendador;
	        }
	    }

	    // Clase Lambders para realizar operaciones relacionadas con arrendadores
	    static class Lambders {
	        public static Contrato obtenerContrato(String idContrato) {
	            // Implementación simulada de obtener un contrato
	            return new Contrato("arrendador123");
	        }

	        public static String calificarArrendador(String arrendador, int calificacion, String comentario) {
	            if (calificacion >= 1 && calificacion <= 5) {
	                // Implementación simulada de calificar al arrendador
	                return "Calificación exitosa";
	            } else {
	                return "Error: La calificación debe estar entre 1 y 5 estrellas";
	            }
	        }
	    }	    

}
