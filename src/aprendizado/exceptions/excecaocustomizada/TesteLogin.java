package aprendizado.exceptions.excecaocustomizada;

public class TesteLogin {
    public static void main(String[] args) {
        try {
            logar("admin", "1234");
        } catch (LoginInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    static void logar(String usuario, String senha) throws LoginInvalidoException {
        String usuarioDB = "igor";
        String senhaDB = "123";
        if (!usuarioDB.equals(usuario) || !senhaDB.equals(senha)) {
            throw new LoginInvalidoException("Usuário ou senha incorretos!");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
