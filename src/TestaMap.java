import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaMap {
    public static void main(String[] args) {
        Jipe jipe = new Jipe();
        jipe.setCor("Branco");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeMaxima(120);

        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setModelo("Voyage");
        carro.setVelocidadeMaxima(290);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeMaxima(270);

        Map<String, Automovel> mapa = new HashMap<>();
        mapa.put("Felipe", jipe);
        mapa.put("Carol", caminhonete);
        mapa.put("João", carro);

        Set<String> nomes = mapa.keySet();

        for (String nome : nomes){
            Automovel automovel = mapa.get(nome);
            System.out.println(nome + " dirige " +automovel.getModelo());
        }
    }
}
