package main;

public class Informações {
    public String Nome;
    public  String Endereco;
    public String CPF;
    public String FORMAPAGA;
    public String Ncartao;
    public String Ntitular;
    public int DVALID;
    public int CVC;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCPF(String cpf) {
        return CPF;
    }

    public String getFORMAPAGA() {
        return FORMAPAGA;
    }

    public void setFORMAPAGA(String FORMAPAGA) {
        this.FORMAPAGA = FORMAPAGA;
    }

    public String getNcartao() {
        return Ncartao;
    }

    public void setNcartao(String ncartao) {
        Ncartao = ncartao;
    }

    public String getNtitular() {
        return Ntitular;
    }

    public void setNtitular(String ntitular) {
        Ntitular = ntitular;
    }

    public int getDVALID() {
        return DVALID;
    }

    public void setDVALID(int DVALID) {
        this.DVALID = DVALID;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;


    }

    @Override
    public String toString() {
        return "Informações: " +
                "\nNome: " + Nome +
                "\nEndereco:" + Endereco +
                "\nCPF:" + CPF +
                "\nnFORMAPAGA: " + FORMAPAGA +
                "\nNcartao: " + Ncartao +
                "\nNtitular: " + Ntitular +
                "\nDVALID: " + DVALID +
                "\nCVC:" + CVC;
    }
}

