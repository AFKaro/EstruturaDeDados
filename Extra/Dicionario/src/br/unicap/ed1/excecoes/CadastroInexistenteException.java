
package br.unicap.ed1.excecoes;
public class CadastroInexistenteException extends Exception{
    
    public CadastroInexistenteException(String obj) {
        super(obj+" com Cadastro Inexistente!");
    }
}
