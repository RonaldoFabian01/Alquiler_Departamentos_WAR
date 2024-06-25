package pe.edu.upc.renstate;

public class ArrendadorCalificacion {

    // Clase para representar un contrato de arrendamiento
    static class Contrato {
        private String arrendador;

        public Contrato(String arrendador) {
            this.arrendador = arrendador;
        }

        public String getArrendador() {
            return arrendador;
        }
    }

    // Clase para realizar operaciones relacionadas con arrendadores
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

    public static void main(String[] args) {
        // Ejemplo de uso
        String idContrato = "id_contrato";
        Contrato contrato = Lambders.obtenerContrato(idContrato);
        int calificacion = 4;
        String comentario = "El arrendador fue muy amable y atento.";
        String resultado = Lambders.calificarArrendador(contrato.getArrendador(), calificacion, comentario);
        System.out.println(resultado);
    }
}