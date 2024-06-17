public class AuthenticatorFactory {

    static Authenticador getAuthenticador(String type) {

        switch (type) {
            case "Basic":
                return new BasicAuthenticador();
            case "OAuth":
                return new OAuthAuthenticator();
            case "JWT":
                return new JWTAuthenticator();

        }
        return null;

    }
}