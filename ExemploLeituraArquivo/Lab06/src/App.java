import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // caminho do arquivo clientesPF.csv
        String caminho = "./clientesPF.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                // System.out.println(linha);
                String[] campos = linha.split(",");
                String cpf = campos[0];
                String nome = campos[1];
                String telefone = campos[2];

                System.out.println("CPF: " + cpf);
                System.out.println("Nome " + nome);
                System.out.println("Telefone: " + telefone);
                System.out.println();
            }
        } catch (IOException e) {
            // Tratar exception
        }
    }
}
