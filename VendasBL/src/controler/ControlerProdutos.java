
package controler;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

public class ControlerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    /**
     * Salvar produtos controller
     * @param pModelProdutos
     * @return 
     */
    public int salvarProdutoControler(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
        
    }
    /**
     * Excluir um produto pelo código
     * @param pCodigo
     * @return 
     */
  public boolean excluirProdutoControler(int pCodigo ){
      return this.daoProdutos.excluirProdutoDAO(pCodigo);
  }  
  /**
   * Alterar um produto
   * @param pModelProdutos
   * @return 
   */
    public boolean alterarProdutoControler(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    /**
     * Retornar produto pelo código
     * @param pCodigo
     * @return 
     */
    public ModelProdutos retornarProdutoControler (int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    /**
     * Retornar lista de produtos
     * 
     * @return LIsta Model Produtos
     */
    public ArrayList <ModelProdutos> retornarListaProdutoControler(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
}
