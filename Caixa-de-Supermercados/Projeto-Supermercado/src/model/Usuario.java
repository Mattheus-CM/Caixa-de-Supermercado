package model;

public class Usuario {

    private int idUsuario;
    private String usuario;
    private String senha;

    public Usuario(int idUsuario, String usuario, String senha) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
