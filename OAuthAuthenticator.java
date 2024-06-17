public class OAuthAuthenticator extends AbtractAuthenticador {

    public OAuthAuthenticator() {
        this.authMethod = "OAuth";
    }

    @Override
    public String authenticate(String tokString) {
        if("0000".equals(tokString))
            return "Este token esta melo, por OA";

        return "No mi rey, estas pero es equivocado";
    }

}
