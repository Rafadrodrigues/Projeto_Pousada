/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer a conexão do Java com o Banco de Dados
 * @author rafar
 */
public class DataBase {
    
    /*Realizando a conexao com o banco de dados (MySQL)*/
    private static Connection conexao = null;

   //Construtor criado para impedir a criação de instâncias, por isso o "private"
    private DataBase() throws SQLException {
    }
    
    /*Função responsável por realizar o procedimento de conexão.*/
    public static Connection estabelecerConexao() throws SQLException{
        /*Tratamento de excessão caso erro durante as tentativas de conexão.*/
        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*Preenchendo as informações com URL,USER,SENHA */
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/milhoverde", "root", "88554663");
            /*Após a conexão estabelecida, será retorno da função*/
            return conexao;
        } catch (ClassNotFoundException ex) {
            /*Cláusula caso a base de dados seja inexistente*/
            System.out.println("Driver do Banco de Dados não foi encontrado");
        } catch (SQLException ex) {
            /*Cláusula caso esteja encontrando dificuldade em estabelecer a conexão*/
            System.out.println("Erro ao acesso o banco de dados" + ex.getMessage());
        }
        return conexao;
    }
}
