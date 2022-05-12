package estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public String nome;
    private List<Produto> produtos = new ArrayList<>();
    private int id;
    private static int contadorId = 0;

    public Estoque() {
        this.id = ++contadorId;
    }

    public Estoque(String nome) {
        this();
        this.nome = nome;
    }

    public void adicionarProduto(Produto novoProduto){
        for (Produto p : produtos){
            if(p.getNome().toLowerCase().equals(novoProduto.getNome().toLowerCase())
                && p.getMarca().toLowerCase().equals(novoProduto.getMarca().toLowerCase())) {
                p.setQuantidade(novoProduto.getQuantidade() + p.getQuantidade());
                return;
            }
        }
        this.produtos.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Não há produtos no estoque!");
        }
        else {
            for (Produto p : produtos){
                System.out.println(p.toString());
            }
        }
    }

    public void deletarProdutoPorId(int id){
        for(Produto p : produtos){
            if (p.getId() == id){
                produtos.remove(id);
                System.out.println("Produto deletado com sucesso!");
                return;
            }
            System.out.println("Produto não encontrado!");

        }
    }

    public void deletarProduto(Produto produto){
        if(verificarSeProdutoExiste(produto)){
            produtos.remove(produto);
        }
    }

    public void atualizarProdutoPorId(int id, String nome,String sessao, String tipo,
                                      int quantidade, String marca ){
        for(Produto p : produtos){
            if (p.getId() == id){
                p.setNome(nome);
                p.setSessao(sessao);
                p.setTipo(tipo);
                p.setQuantidade(quantidade);
                p.setMarca(marca);
            }
        }
    }

    public void listarDadosDoProdutoPorId(int id){
        for(Produto p : produtos){
            if(p.getId() == id){
                System.out.println(p.toString());
                return;
            }
            System.out.println("Produto não encontrado!");
        }
    }

    public void listarProduto(Produto produto){
        if(verificarSeProdutoExiste(produto)){
            produto.toString();
        }
        else {
            System.out.println("Produto não encontrado!");
        }
    }

    public boolean verificarSeProdutoExiste(Produto produto){
        if (produtos.contains(produto)){
            return true;
        }
        else {
            return false;
        }
    }

}
