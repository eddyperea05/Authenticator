public class BasicAuthenticador extends AbtractAuthenticador {

    public BasicAuthenticador(){
        this.authMethod = "Basic";
    }

    @Override
    public String authenticate(String tokString) {

        if ("0000".equals(tokString)) {
            return "Este si es un token JWT";

        }
        return "No mi rey, intente de nuevo ese token";
    }

}
