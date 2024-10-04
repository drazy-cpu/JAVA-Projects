import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class torresDeHanoi extends JPanel {

    // Definir cores
    private final Color[] CORES_DISCOS = {new Color(255, 100, 100), new Color(100, 100, 255),
            new Color(100, 255, 100), new Color(255, 255, 100),
            new Color(255, 165, 0), new Color(160, 32, 240)};

    // Definir dimensões
    private final int bordaLargura = 600;
    private final int bordaAltura = 500;
    private final int larguraHaste = 10;
    private final int alturaHaste = 250;
    private final int alturaDisco = 20;

    private List<List<Integer>> torres;
    private final Point[] posicoesHastes = {
            new Point(bordaLargura / 4, bordaAltura - 50),
            new Point(bordaLargura / 2, bordaAltura - 50),
            new Point(3 * bordaLargura / 4, bordaAltura - 50)
    };

    private int totalMovimentos = 0;  // Contador de movimentos
    private Timer timer; // Timer para mover discos de forma controlada
    private List<int[]> movimentos; // Lista de movimentos a serem realizados
    private int indiceMovimento = 0; // Índice atual de movimento

    public torresDeHanoi(int numeroDiscos) {
        this.setPreferredSize(new Dimension(bordaLargura, bordaAltura));
        this.torres = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            torres.add(new ArrayList<>());
        }
        // Inicializar a primeira torre com discos
        for (int i = numeroDiscos; i > 0; i--) {
            torres.get(0).add(i - 1);
        }
        this.movimentos = new ArrayList<>();
    }

    // Desenhar as torres e os discos
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(139, 69, 19)); // Cor de madeira
        g.fillRect(50, bordaAltura - 50, bordaLargura - 100, 10); // Suporte de madeira

        // Desenhar as hastes
        for (Point posicao : posicoesHastes) {
            g.fillRect(posicao.x - larguraHaste / 2, posicao.y - alturaHaste, larguraHaste, alturaHaste);
        }

        // Desenhar os discos
        for (int indiceHaste = 0; indiceHaste < torres.size(); indiceHaste++) {
            List<Integer> torre = torres.get(indiceHaste);
            for (int altura = 0; altura < torre.size(); altura++) {
                int disco = torre.get(altura);
                int larguraDisco = (disco * 20) + 40; // Discos maiores têm mais largura
                int x = posicoesHastes[indiceHaste].x - larguraDisco / 2;
                int y = posicoesHastes[indiceHaste].y - (altura + 1) * alturaDisco;
                g.setColor(CORES_DISCOS[disco % CORES_DISCOS.length]);
                g.fillRect(x, y, larguraDisco, alturaDisco);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, larguraDisco, alturaDisco); // Borda preta
            }
        }
    }

    // Função para iniciar o movimento dos discos com um timer
    public void iniciarMovimento() {
        timer = new Timer(1000, e -> executarProximoMovimento()); // A cada 1.5 segundos
        timer.start();
    }

    // Função para mover um disco de uma torre para outra
    public void executarProximoMovimento() {
        if (indiceMovimento < movimentos.size()) {
            int[] movimento = movimentos.get(indiceMovimento);
            moverDisco(movimento[0], movimento[1]);
            indiceMovimento++;
        } else {
            timer.stop(); // Para o timer quando todos os movimentos forem realizados
            JOptionPane.showMessageDialog(this, "Número de movimentos: " + totalMovimentos);
        }
    }

    // Função que move o disco e atualiza o contador de movimentos
    public void moverDisco(int origem, int destino) {
        if (!torres.get(origem).isEmpty()) {
            int disco = torres.get(origem).remove(torres.get(origem).size() - 1);
            torres.get(destino).add(disco);
            totalMovimentos++;
            repaint();
        }
    }

    // Função recursiva para resolver a Torre de Hanói e registrar os movimentos
    public void resolverTorreHanoi(int numeroDiscos, int origem, int destino, int auxiliar) {
        if (numeroDiscos == 1) {
            movimentos.add(new int[]{origem, destino});
        } else {
            resolverTorreHanoi(numeroDiscos - 1, origem, auxiliar, destino);
            movimentos.add(new int[]{origem, destino});
            resolverTorreHanoi(numeroDiscos - 1, auxiliar, destino, origem);
        }
    }

    // Função para gerar a tabela binária
    public static List<List<Integer>> gerarTabelaBinaria(int n) {
        int maxNum = (int) Math.pow(2, n);
        List<List<Integer>> tabela = new ArrayList<>();
        for (int i = 0; i < maxNum; i++) {
            List<Integer> linha = new ArrayList<>();
            String binario = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            for (char c : binario.toCharArray()) {
                linha.add(c - '0');
            }
            tabela.add(linha);
        }
        return tabela;
    }

    // Função para imprimir a tabela binária
    public static void imprimirTabelaBinaria(List<List<Integer>> tabela, int n) {
        System.out.println("\nTabela Binária:");
        for (int i = 0; i < n; i++) {
            System.out.print("2^" + (n - i - 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < tabela.size(); i++) {
            System.out.printf("%2d ", i);
            for (int bit : tabela.get(i)) {
                System.out.print(bit + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Solicitar o número de discos
        String input = JOptionPane.showInputDialog("Quantos discos são? (máximo até 5)");
        int numeroDiscos = Integer.parseInt(input);

        if (numeroDiscos <= 0 || numeroDiscos > 5) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número de discos entre 1 e 5.");
            return;
        }

        // Gerar a tabela binária (continua sendo gerada, mas não será impressa)
        List<List<Integer>> tabela = gerarTabelaBinaria(numeroDiscos);

        // Criar a janela Swing
        JFrame frame = new JFrame("Torre de Hanói");
        torresDeHanoi torresDeHanoi = new torresDeHanoi(numeroDiscos);
        frame.add(torresDeHanoi);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Resolver a Torre de Hanói
        torresDeHanoi.resolverTorreHanoi(numeroDiscos, 0, 2, 1);

        // Iniciar a animação dos movimentos
        torresDeHanoi.iniciarMovimento();

        imprimirTabelaBinaria(tabela, numeroDiscos);
    }
}
