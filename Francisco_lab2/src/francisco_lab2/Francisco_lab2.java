package francisco_lab2;

import java.util.*;
import javax.swing.JOptionPane;

public class Francisco_lab2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Usuario> users = new ArrayList();
        Usuario p = new Usuario();
        String r = "s";
        while ("S".equals(r) || "s".equals(r)) {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(("|||||| Red Social ||||||\n"
                    + "1. Crear Usuario\n"
                    + "2. Modificar El Usuario\n"
                    + "3. Eliminar Usuario\n"
                    + "4. Log In\n"
                    + "Ingrese la Opcion a desarrollar")));

            switch (opc) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el Nombre:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su Edad:"));
                    String lugar = JOptionPane.showInputDialog("Ingrese Lugar de Nacimiento:");
                    String username = JOptionPane.showInputDialog("Ingrese el Username:");
                    String password = JOptionPane.showInputDialog("Ingrese la Contraseña:");
                    for (Usuario object : users) {
                        while (username.equals(object.getusername())) {
                            username = JOptionPane.showInputDialog("El usuario ya existe ingrese otro:");
                        }
                        users.add(new Usuario(nombre, edad, lugar, username, password));
                    }
                    break;
                case 2:
                    String nuevo="";
                    for (Object t : users) {
                        if (t instanceof Usuario) {
                            nuevo +=(users.indexOf(t)+1)+"-."+((Usuario) t).getnombre()+"\n";
                        }
                    }
                    int user= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del usuario que desea modificar"));
                    int Num_User = Integer.parseInt(JOptionPane.showInputDialog(
                              "1. Nombre"
                            + "2. Edad"
                            + "3. Lugar de Nacimiento"
                            + "4. Username"
                            + "5. Password"
                            + "Ingrese la Opcion que desea Modificar "));
                    switch (Num_User) {
                        case 1:
                            
                            
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                    }

                    break;
                case 3:
                    int Num2_User = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Usuario que desea eliminar:"));

                    break;
                case 4:

                    break;
            }
        }
    }
}
