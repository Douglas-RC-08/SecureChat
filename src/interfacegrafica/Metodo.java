package src.interfacegrafica;

import javax.swing.*;
import java.awt.*;

public class Metodo {
    public static JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(211, 47, 47));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setFont(new Font("Segoe UI", Font.BOLD, 16));
        botao.setPreferredSize(new Dimension(150, 40));
        botao.setMaximumSize(new Dimension(150, 40));
        botao.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        return botao;
    }

    public static JLabel carregarImagem(String caminhoImagem) {
        try {
            ImageIcon icone = new ImageIcon(caminhoImagem);
            Image imagemReduzida = icone.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            return new JLabel(new ImageIcon(imagemReduzida));
        } catch (Exception e) {
            System.out.println("Imagem não encontrada: " + caminhoImagem);
            return new JLabel(); // retorna vazio se não achar
        }
    }

    public static JPanel criarCampoComLabel(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.BLACK);

        JTextField campo = new JTextField(20);
        campo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBackground(Color.WHITE);
        painel.add(label);
        painel.add(campo);

        return painel;
    }

    public static JPanel criarCampoSenha(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.BLACK);

        JPasswordField campo = new JPasswordField(20);
        campo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBackground(Color.WHITE);
        painel.add(label);
        painel.add(campo);

        return painel;
    }
}
