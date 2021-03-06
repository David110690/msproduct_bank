package NNTDATA.msproduct_bank.services;

import NNTDATA.msproduct_bank.dao.ProductDao;
import NNTDATA.msproduct_bank.documents.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao dao;

    @Override
    public Flux<Product> findAll() {
        return dao.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        return dao.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return dao.save(product);
    }

    @Override
    public Mono<Void> delete(Product product) {
        return dao.delete(product);
    }
}
