package br.unip.dsd.modelos;

/**
 * Created by dirceu on 8/30/15.
 */
public class Endereco {
    private Long id;
    private String complemento;
    private Rua rua;


    public Endereco(Long id, String complemento, Rua rua, Estado estado, Cidade cidade, TipoLogradouro tipoLogradouro) {
        this.id = id;
        this.complemento = complemento;
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.tipoLogradouro = tipoLogradouro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;

        Endereco endereco = (Endereco) o;

        if (cidade != null ? !cidade.equals(endereco.cidade) : endereco.cidade != null) return false;
        if (complemento != null ? !complemento.equals(endereco.complemento) : endereco.complemento != null)
            return false;
        if (estado != null ? !estado.equals(endereco.estado) : endereco.estado != null) return false;
        if (id != null ? !id.equals(endereco.id) : endereco.id != null) return false;
        if (rua != null ? !rua.equals(endereco.rua) : endereco.rua != null) return false;
        if (tipoLogradouro != null ? !tipoLogradouro.equals(endereco.tipoLogradouro) : endereco.tipoLogradouro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (tipoLogradouro != null ? tipoLogradouro.hashCode() : 0);
        return result;
    }

    private Estado estado;
    private Cidade cidade;
    private TipoLogradouro tipoLogradouro;

}
