package pe.edu.upc.renstate;

public class PropiedadManager {

    // Clase para representar los detalles de una propiedad
    static class DetallesPropiedad {
        private String direccion;
        private String[] caracteristicas;
        private double precio;

        public DetallesPropiedad(String direccion, String[] caracteristicas, double precio) {
            this.direccion = direccion;
            this.caracteristicas = caracteristicas;
            this.precio = precio;
        }

        // Getters para los detalles de la propiedad
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

    // Clase para realizar operaciones relacionadas con propiedades
    static class Lambders {
        public static String publicarPropiedad(DetallesPropiedad detallesPropiedad) {
            if (detallesPropiedad.getDireccion() != null && detallesPropiedad.getCaracteristicas() != null && detallesPropiedad.getPrecio() > 0) {
                // Implementación simulada de publicar la propiedad
                return "Publicación exitosa";
            } else {
                return "Error: Información incompleta. Por favor, complete todos los campos requeridos.";
            }
        }
    }

    public static void main1(String[] args) {
        // Ejemplo de uso
        DetallesPropiedad detallesPropiedad = new DetallesPropiedad("Av. Principal 123", new String[]{"3 dormitorios", "2 baños", "amoblado"}, 1500);
        String resultado = Lambders.publicarPropiedad(detallesPropiedad);
        System.out.println(resultado);
    }
}
