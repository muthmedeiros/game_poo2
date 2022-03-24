import com.personagens.Inimigo;
import com.personagens.Personagem;
import com.personagens.Pessoa;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame implements KeyListener{

	private JPanel contentPane;
    private GamePanel gamePanel;
	private Personagem personagem;
    private ArrayList<Inimigo> inimigos;
    private final ArrayList<JLabel> jTextPaneInimigos = new ArrayList<>();
    private JLabel jTextPanePersonagem;

	public GameFrame(Personagem personagem, ArrayList<Inimigo> inimigos) {
		super();
        setPersonagem(personagem);
        setInimigos(inimigos);
        
		buildFrame();
		criaScoreVidas();

        addKeyListener(this);
        repaint();
	}
	
	public void buildFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);
        setTitle("JOGO - POO2");
        setVisible(true);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        gamePanel = new GamePanel(personagem, inimigos);
        contentPane.add(gamePanel);
	}
	
	@Override
    public void repaint() {
        if (this.personagem.getObservadores().size() == 0) {
            int dialogResult = JOptionPane.showConfirmDialog(
                    null,
                    "Você venceu!",
                    "VITÓRIA",
                    JOptionPane.OK_CANCEL_OPTION);
            System.exit(dialogResult);
        } else if (this.personagem.getVida() <= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(
                    null,
                    "Você morreu!",
                    "DERROTA",
                    JOptionPane.OK_CANCEL_OPTION);
            System.exit(dialogResult);
        } else {
            super.repaint();
        }
    }
	
	@Override
    public void keyPressed(KeyEvent e) {
        if (this.personagem.getVida() > 0) {
            gamePanel.keyPressed(e);
            alteraLabelText();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public String labelText(Pessoa pessoa) {
        return pessoa.getNome() + ": " + pessoa.getVida() + " (Estado.Estado: " + pessoa.getEstado().getClass().getName() + ")";
    }
    
    public void criaScoreVidas() {
        int yPosition = 140;
        for (Pessoa pessoa : inimigos) {
            JLabel textPaneInimigo = new JLabel();
        	textPaneInimigo.setText(labelText(pessoa));
        	textPaneInimigo.setBounds(10, yPosition, 200, 20);
            textPaneInimigo.setBackground(Color.red);

        	jTextPaneInimigos.add(textPaneInimigo);
        	contentPane.add(textPaneInimigo);

            yPosition += 20;
        }
        jTextPanePersonagem = new JLabel();
        jTextPanePersonagem.setText(labelText(personagem));
        jTextPanePersonagem.setBounds(10, 120, 200, 20);
        jTextPanePersonagem.setBackground(Color.blue);

		contentPane.add(jTextPanePersonagem);
    }
    
    private void alteraLabelText() {
        for(int i = 0; i < inimigos.size(); i++) {
        	jTextPaneInimigos.get(i).setText(labelText(inimigos.get(i)));
        }
        jTextPanePersonagem.setText(labelText(personagem));
    }
}
