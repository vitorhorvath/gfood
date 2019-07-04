package org.generation.brazil.gfood.cliente;

import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;
    // C R E A T E
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save (@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    // R E A D
    @GetMapping ("/clientes")
    public List<Cliente> findAll () {
        return repository.findAll();
    }

    @PostMapping("/cliente/nome")
    public List<Cliente> findByNome(@RequestParam String nome){
        return repository.findByNome(nome);
    }

    @GetMapping("/cliente/{dataNascimento}")
    public List<Cliente> findAllByNascimento (@RequestParam Date dataNascimento){
        return repository.findAllByNascimento(dataNascimento);
    }

    @PostMapping("/clientes/nomeAndData")
    public List<Cliente> findAllByNascimentoAndNome(@RequestParam String nome, Date nascimento){
        return repository.findAllByNascimentoAndNome(nome, nascimento);
    }

    // U P D A T E
    @PutMapping("/clientes/{id}")
    public Cliente saveOrUpdate(@PathVariable Long id, @RequestBody Cliente cliente)
    throws ResourceNotFoundException {
        return repository.findById(id).map(c -> {
            c.setNome(cliente.getNome());
            c.setEndereco(cliente.getEndereco());
            c.setNascimento(cliente.getNascimento());
            return repository.save(c);
        }).orElseThrow(() ->
          new ResourceNotFoundException("Não existe cliente cadastrado"));
    }

    @Transactional
    @PutMapping("/cliente/update/{id}")
    public void updateByNome(@PathVariable Long id, @RequestParam String nome){
        repository.updateByNome(nome, id);
    }

    // D E L E T E
    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    @Transactional
    @DeleteMapping("/cliente/delete")
    public void deleteByNome(@RequestParam String nome, Date nascimento){
        repository.deleteByNomeAndNascimento(nome,nascimento);
    }
}
