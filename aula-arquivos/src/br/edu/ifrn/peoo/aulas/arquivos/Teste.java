package br.edu.ifrn.peoo.aulas.arquivos;

import br.edu.ifrn.peoo.aulas.arquivos.atividade1.Pessoa;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
         //   Pessoa p = new Pessoa("Lyonara", 19);
            
           Pessoa pessoaLida = ManipuladorArquivoTexto.lerTextoComDelimitador("info2M");
            System.out.println(pessoaLida.getNome());
	}

}
