package main;

public class Main {
    public static void main(String[] args) {
        Informações informações1 = new Informações();
        informações1.setNome("Jorge");
        informações1.setCPF("12345678912");
        informações1.setEndereco("Servidao da Maiorca");
        informações1.setFORMAPAGA("Boleto");
        informações1.setNcartao("7956 7898 7895 7893 ");
        informações1.setNtitular("Jorge D Silva");
        informações1.setDVALID(12/2040);
        informações1.setCVC(171);

        System.out.println(informações1);
        if (informações1.getFORMAPAGA() == "Cartão de Crédito") {System.out.println("Selecionado: Cartão de Crédito!" +
                "\n Informações:" + "\n" +
                "Número do cartão:" + informações1.Ncartao
                + "\n Nome do Titular:" + informações1.getNtitular() +
                "\n Data de validade: " + informações1.DVALID 
                +"\n CVV: " + informações1.getCVC());}
        else if(informações1.getFORMAPAGA() == "Boleto"){
            System.out.println("Boleto foi selecionado, Estamos gerando Aguarde");
        }


    }
}
