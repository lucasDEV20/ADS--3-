/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model_lucas.enumeradores.EnumConstantes;

/**
 *
 * @author vovostudio
 */
public class ArquivoCONN {

    
    //ATRIBUTOS QUE TERAM LOCOMOÇAO DENTRO DO ARQUIVO
    private final String so = System.getProperty("os.name").toLowerCase();
    private final String barra = so.contains("windows") ? "\\" : "/";
    private final String dirHome = System.getProperty("user.home");
    private final String dirBd = "DbSbs"; // Nome do diretório para os arquivos de dados
    private final String DAOName = dirHome + barra + dirBd;
    private final String extensao = ".txt";
    private File file = null;
    private String className = "";

    //--- FIM ATRIBUTOS ---------------------------------------------------------------------------|
    //
    //--- CONSTRUTORES ---------------------------------------------------------------------------->
    //
    public ArquivoCONN(String className) throws Exception {

        if (className.trim().length() == 0) {
            throw new Exception("O nome da classe é inválido!");
        }
        //CLASSE NOME QUE TRANSITA ULTILIZANDO 

        this.className = className;

        File dir = new File(DAOName);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        garantirArquivo(className);

    }

    //--- FIM CONSTRUTORES ------------------------------------------------------------------------|
    //
    //--- GET ------------------------------------------------------------------------------------->
    //
    private void garantirArquivo(String className) throws Exception {
        file = new File(DAOName + barra + className + extensao);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    protected ArrayList<String> getResults() throws Exception {
        try {
            ArrayList<String> linhas = new ArrayList<String>();
            FileReader fr = new FileReader(file.getCanonicalPath());
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                if (linha.trim().length() > 0) {
                    linhas.add(linha.trim());
                }
            }

            br.close();

            return linhas;

        } catch (Exception e) {
            throw new Exception("Erro ao ler o arquivo [" + file.getCanonicalPath() + "]!\n" + e.getMessage());
        }
    }

    protected int lastID(int indexPrimaryKey) throws Exception {
        int id = 0;
        int idArquivo = 0;

        if (file == null) {
            garantirArquivo(className);
        }

        for (String linha : getResults()) {
            idArquivo = Integer.parseInt(linha.split(EnumConstantes.SeparadorSplit.getConstante())[indexPrimaryKey]);
            id = (idArquivo > id) ? idArquivo : id;
        }
        return id;
    }

    //--- FIM GET ---------------------------------------------------------------------------------|
    //
    //--- SET ------------------------------------------------------------------------------------->
    //
    protected void executeUpdate(ArrayList<String> linhasArquivo) throws Exception {

        try {
            garantirArquivo(className);
            FileWriter fw = new FileWriter(file.getCanonicalPath());
            BufferedWriter bw = new BufferedWriter(fw);
            for (String linha : linhasArquivo) {
                bw.write(linha + "\n");
            }
            bw.close();
        } catch (Exception e) {
            throw new Exception("Erro ao escrever no arquivo [" + file.getCanonicalPath() + "]!\n" + e.getMessage());
        }
    }
    //--- FIM SET ---------------------------------------------------------------------------------|
    //
}
