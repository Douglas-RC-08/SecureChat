package src.interfacegrafica;

import javax.swing.*;
import java.awt.*;

public class Pagina_cadastro extends JFrame {
    public Pagina_cadastro() {
        setTitle("SecureChat - Cadastro");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());

        JPanel topo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topo.setBackground(Color.WHITE);
        JLabel logo = Metodo.carregarImagem("src/imagens/Logo_SecureChat.png");
        topo.add(logo);

        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.setBackground(Color.WHITE);
        centro.setBorder(BorderFactory.createEmptyBorder(20, 60, 20, 60));

        JLabel titulo = new JLabel("Cadastro");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(176, 0, 32));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        centro.add(titulo);
        centro.add(Box.createRigidArea(new Dimension(0, 20)));

        centro.add(Metodo.criarCampoComLabel("Nome:"));
        centro.add(Box.createRigidArea(new Dimension(0, 15)));

        centro.add(Metodo.criarCampoComLabel("Email:"));
        centro.add(Box.createRigidArea(new Dimension(0, 15)));

        centro.add(Metodo.criarCampoSenha("Senha:"));
        centro.add(Box.createRigidArea(new Dimension(0, 30)));

        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBackground(new Color(176, 0, 32));
        cadastrar.setForeground(Color.WHITE);
        cadastrar.setFont(new Font("Arial", Font.BOLD, 14));
        cadastrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        centro.add(cadastrar);

        principal.add(topo, BorderLayout.NORTH);
        principal.add(centro, BorderLayout.CENTER);

        add(principal);
        setVisible(true);
    }
}
