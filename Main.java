public class Main {
    public static void main(String[] args) {
        Authenticador basicAuth = AuthenticatorFactory.getAuthenticador("Basic");
        LoginManager basicToken = new LoginManager(basicAuth);

        System.out.println(basicToken.login("0000"));
    }
}
