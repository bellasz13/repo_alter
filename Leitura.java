package caixaleitura;

import javax.swing.JOptionPane;
public class Leitura {
public static void main(String args[]){
String nome, sobrenome, nomeCompleto;

nome = JOptionPane.showInputDialog("Digite o seu primeiro nome: ");
sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
nomeCompleto = nome + " " + sobrenome;
JOptionPane.showMessageDialog(null, "Seu nome completo é: " +
nomeCompleto);
	}
}
