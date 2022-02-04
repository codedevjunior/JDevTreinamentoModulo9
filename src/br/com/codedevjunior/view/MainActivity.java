package br.com.codedevjunior.view;

import br.com.codedevjunior.model.Aluno;

import javax.swing.*;

public class MainActivity {

    public static void main(String[] args) {
        /*
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno? ");
        String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno? ");
        String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno? ");
        String nomeMae = JOptionPane.showInputDialog("Qual nome da mae do aluno? ");
        String nomePai = JOptionPane.showInputDialog("Qual nome do pai do aluno? ");
        String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno? ");
        String nomeEscola = JOptionPane.showInputDialog("Qual nome da escola do aluno? ");
        String serieMatriculado = JOptionPane.showInputDialog("Qual a serie do aluno? ");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno? ");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno? ");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno? ");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno? ");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatriculado);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno1.toString());
        System.out.println(aluno1.getMediaNota());
        System.out.println(aluno1.getAlunoAprovado());
         */

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Vilson");
        aluno1.setNumeroCpf("092.776.659-04");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Vilson");
        aluno2.setNumeroCpf("092.776.659-04s");

        if(aluno1.equals(aluno2)){
            System.out.println("São Iguais");
        } else{
            System.out.println("São Diferentes");
        }
    }
}
