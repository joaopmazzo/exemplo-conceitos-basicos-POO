package poo;

import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "17280-000";
        // Dados do endereço

        Cliente cLiente = new Cliente();
        // Dados do cliente

        try {
            cLiente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereço:: "+e.getMessage());
        }
    }
}
