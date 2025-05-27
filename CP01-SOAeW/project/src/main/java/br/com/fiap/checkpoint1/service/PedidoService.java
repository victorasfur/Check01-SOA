package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repository;
    
    public List<Pedido> findAll() {
        return repository.findAll();
    }
    
    public Optional<Pedido> findById(Long id) {
        return repository.findById(id);
    }
    
    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}