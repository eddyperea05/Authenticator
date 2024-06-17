public class JWTAuthenticator extends AbtractAuthenticador {

    public JWTAuthenticator() {
        this.authMethod = "JWT";
    }

    @Override
    public String authenticate(String token) {
        if ("0000".equals(token))
            return "Este token esta melo";

        return "No mi rey, estas pero es equivocado";
    }

}
