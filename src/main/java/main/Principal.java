package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        try{
            Socket server = new Socket("localhost", 4444);//Endereço e porta de entrada pro server
            
            PrintWriter out = new PrintWriter(server.getOutputStream(),true); //Criando um printwriter e associando ele ao output do server
            String mensagem = "";
            
            while(!mensagem.equals("fim")){
                mensagem = JOptionPane.showInputDialog("Digite a mensagem, ou 'fim' para sair");
            
                out.println(mensagem);//escreve a mensagem
            }
            
        }catch(IOException io){
        System.err.println("Problema com o IO");
    }
    }
}
