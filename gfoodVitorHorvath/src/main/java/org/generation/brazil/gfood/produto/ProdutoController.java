package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // C R E A T E
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save (@RequestBody Produto produto) {
        return repository.save(produto);
    }

    // R E A D
    @GetMapping("/produtos")
    public List<Produto> findAll(){
        return repository.findAll();
    }


    @PostMapping("/produtos/nome")
    public List<Produto> findByNome(@RequestParam String nome){
        return repository.findByNome(nome);
    }




    // U P D A T E
    public Produto update(@PathVariable Long id, @RequestBody Produto produto)
    throws ResourceNotFoundException {
        return repository.findById(id).map(p ->{
            p.setNome(produto.getNome());
            p.setDescricao(produto.getDescricao());
            p.setPreco(produto.getPreco());
            return repository.save(p);
        }).orElseThrow(()->
            new ResourceNotFoundException("Não existe produto"));
    }

    // D E L E T E
    @DeleteMapping("/produtos/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
