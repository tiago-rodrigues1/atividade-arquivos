package br.edu.ifrn.sc.peoo.arquivos.gson;


import br.edu.ifrn.peoo.aulas.arquivos.ManipuladorArquivoTexto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class Teste {

    public static void main(String[] args) {
        
        //Convertendo um objeto da classe Aluno para arquivo JSON
        Aluno a1 = new Aluno("123", "Fulano", 100);
        String arquivoJSON = converterObjetoParaJson(a1);
        ManipuladorArquivoTexto.escrever(arquivoJSON, "json.txt");
        System.out.println("Convertendo um objeto do tipo Aluno para formato JSON");
        System.out.println(arquivoJSON);
        System.out.println();
        
        //Convertendo um JSON para objeto da classe Aluno
        Aluno aluno = converterJsonParaObjeto(arquivoJSON);
        System.out.println("Convertendo um JSON para objeto da classe Aluno");
        System.out.println(aluno.toString());
        System.out.println();
        
        //Convertendo uma lista de objetos da classe Aluno para JSON
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("123", "Fulano", 100));
        alunos.add(new Aluno("321", "Sicrano", 90));
        alunos.add(new Aluno("132", "Beltrano", 88.8));
        
        String listaJSON = converterListaParaJSON(alunos);
        System.out.println("Convertendo uma lista de objetos da classe Aluno para JSON");
        System.out.println(listaJSON);
        System.out.println();
        
        
        //Convertendo um arquivo JSON contendo vários alunos para uma Lista de Objetos da Classe Aluno
        System.out.println("Convertendo um arquivo JSON contendo vários alunos para uma Lista de Objetos da Classe Aluno");
        ArrayList<Aluno> alunosRecuperados = converterJsonParaLista(listaJSON);
        System.out.println("Imprimindo os objetos:");
        
        for (Aluno alunoRecuperado : alunosRecuperados) {
            
            System.out.println(alunoRecuperado.toString());
        }
        
    }
    
    private static String converterObjetoParaJson(Aluno a1) {
        
        Gson conversor = new Gson();
        String arquivoJSON = conversor.toJson(a1);
        return arquivoJSON;
    }
    
    private static Aluno converterJsonParaObjeto(String arquivoJSON) {
        
        Gson conversor = new Gson();
        Aluno a1 = conversor.fromJson(arquivoJSON, Aluno.class);
        return a1;
    }
    
    private static String converterListaParaJSON(ArrayList<Aluno> lista) {
        Gson conversor = new Gson();
        return conversor.toJson(lista);
    }
    
    private static ArrayList<Aluno> converterJsonParaLista(String arquivoJSON) {
        Gson conversor = new Gson();
        Type tipoLista = new TypeToken<ArrayList<Aluno>>() {}.getType();
        ArrayList<Aluno> lista = conversor.fromJson(arquivoJSON, tipoLista);
        return lista;
    }
}
