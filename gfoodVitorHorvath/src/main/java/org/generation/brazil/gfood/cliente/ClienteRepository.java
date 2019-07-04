package org.generation.brazil.gfood.cliente;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);

    List<Cliente> findAllByNascimento(Date nascimento);

    List<Cliente> findAllByNascimentoAndNome(String nome, Date nascimento);

    @Modifying
    @Query("UPDATE Cliente c SET c.nome = :nome WHERE c.id = :id")
    int updateByNome(@Param("nome") String nome, @Param("id") Long id);

    int deleteByNomeAndNascimento (String nome, Date nascimento);
}
