package src.interfacegrafica;

import javax.swing.*;
import java.awt.*;

public class Pagina_bemvindo extends JFrame {

    public Pagina_bemvindo() {
        setTitle("SecureChat - Bem-vindo");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

        JLabel logo = Metodo.carregarImagem("src/imagens/Logo_SecureChat.png");
        logo.setSize(200, 200);
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(logo);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel texto = new JLabel("Bem-vindo ao SecureChat!");
        texto.setFont(new Font("Arial", Font.BOLD, 22));
        texto.setForeground(new Color(176, 0, 32));
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(texto);

        panel.add(Box.createRigidArea(new Dimension(0, 40)));

        JPanel botoesPanel = new JPanel();
        botoesPanel.setBackground(Color.WHITE);
        botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0)); // Espaço de 30px entre botões

        JButton login = Metodo.criarBotao("Login");
        JButton cadastro = Metodo.criarBotao("Cadastro");

        login.addActionListener(e -> {
            new Pagina_login();
            this.dispose();
        });
        cadastro.addActionListener(e -> {
            new Pagina_cadastro();
            this.dispose();
        });

        botoesPanel.add(login);
        botoesPanel.add(cadastro);

        panel.add(botoesPanel);

        add(panel);
        setVisible(true);
    }
}
