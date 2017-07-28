package francisco_lab2;

public class Usuario {

    public String nombre;
    public int edad;
    public String lugar;
    public String username;
    public String password;
    public String listaA;
    public String solicitud;
    public String enviados;
    public String buzon;

    public Usuario() {
        
    }

    public Usuario(String nombre, int edad, String lugar, String username, String password) {
        this.nombre = nombre;
        this.edad=edad;
        this.lugar=lugar;
        this.username=username;
        this.password=password;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public String getlugar(){
        return lugar;
    }
    public void setlugar(String lugar){
        this.lugar=lugar;
    }
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username=username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password=password;
    }
}
