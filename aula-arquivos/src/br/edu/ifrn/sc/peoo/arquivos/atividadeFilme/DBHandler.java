/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sc.peoo.arquivos.atividadeFilme;


import br.edu.ifrn.peoo.aulas.arquivos.ManipuladorArquivoTexto;
import com.google.gson.Gson;

/**
 *
 * @author 20201114010042
 */
public class DBHandler {

    private static String converterObjetoParaJson(Filme f) {

        Gson conversor = new Gson();
        String arquivoJSON = conversor.toJson(f);
        return arquivoJSON;
    }

    private static Filme converterJsonParaObjeto(String arquivoJSON) {

        Gson conversor = new Gson();
        Filme f = conversor.fromJson(arquivoJSON, Filme.class);
        return f;
    }
    
    public static boolean DBPostFilme(Filme f) {
        String objetoConvertido = converterObjetoParaJson(f);
        
        boolean dbResponse = ManipuladorArquivoTexto.escrever(objetoConvertido, "data.txt");
        
        return dbResponse;
    }
}
