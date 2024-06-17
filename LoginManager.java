public class LoginManager {

    private Authenticador authenticador;
    


    public LoginManager(Authenticador authenticador) {
        this.authenticador = authenticador;
    }



    String login(String token){
        return authenticador.authenticate(token);
    }
    
}
