package barricada_ejercicio;

import java.util.Scanner;

public class AppRegistro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leer correo, contraseña y edad
        System.out.println("Ingrese su correo");
        String entradaCorreo = in.nextLine();

        System.out.println("Ingrese su contraseña");
        String entradaContrasena = in.nextLine();

        System.out.println("Ingrese su edad");  
        String entradaEdad = in.nextLine();
     

        // Validación (barricada)
        String correoValidado = ValidadorUsuario.validarCorreo(entradaCorreo);
        String contrasenaValidada = ValidadorUsuario.validarContrasena(entradaContrasena);
        String edadVlidada = ValidadorUsuario.validarEdadUsusario(entradaEdad);

        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error 
        if (correoValidado == null ){
            System.out.println("El correo no es valido");
        } 
        if (contrasenaValidada == null){
            System.out.println("La contraseña no es valida");
        } 
        if (edadVlidada == null){
            System.out.println("La edad no es valida");
        }
        
        Usuario usuario = new Usuario(correoValidado, contrasenaValidada, edadVlidada);
        usuario.mostrarInformacionUsuario();

        in.close();
   
    }

}
