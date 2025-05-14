package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    // implementar método: validarCorreo(String correo)
    // aceptar emial que contengan @ y .
    public static String validarCorreo (String correo){
        if(correo == null || correo.isBlank()){
            return null;
        }
        if (correo.contains("@") && correo.contains(".")){
            return correo;
        }
        return null;

    }


    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
        public static String validarContrasena(String contrasena){
        if(contrasena == null || contrasena.isBlank()){
            return null;
        }
        if (contrasena.length() >= 9){
            return contrasena;
        }
        return null;
        
    }

    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
    public static String validarEdadUsusario(String edadTexto){
            int edadUsuario = Integer.parseInt(edadTexto); 
            if (edadUsuario >= 15 && edadUsuario <= 50){
                return edadTexto;
            }
            return null;
        
    }
}
    

