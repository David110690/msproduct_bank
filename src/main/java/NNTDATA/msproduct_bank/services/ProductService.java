package NNTDATA.msproduct_bank.services;

import NNTDATA.msproduct_bank.documents.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    public Flux<Product> findAll();
    public Mono<Product> findById(String id);
    public Mono<Product> save(Product product);
    public Mono<Void> delete(Product product);
}
