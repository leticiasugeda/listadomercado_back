package br.com.mercadolele.appmercado.service;

import java.util.List;

import br.com.mercadolele.appmercado.model.Produto;

public interface IProdutoService {
	public Produto criarNovoProduto(Produto prod);
	public Produto alterarProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public Produto buscarPorId(Integer id);
}// essas funcionalidades foram tiradas do java utils
// só tenho a especificacao do meu servico, nao tenho a implementacoa dele
// se eu crio o teste, tenho problema porque nao tenho a implementacao dele