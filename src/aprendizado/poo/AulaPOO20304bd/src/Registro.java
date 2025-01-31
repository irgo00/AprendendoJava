package aprendizado.poo.AulaPOO20304bd.src;

import java.util.Date;

public class Registro {
    
    private int id;
    
    private String descricao;
    
    private Date dataHora;

    public Registro() {
        id = 0;
        descricao = "";
        dataHora = new Date();
    }

    public Registro(int id, String descricao, Date dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
}
