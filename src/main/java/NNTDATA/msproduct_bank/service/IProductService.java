package NNTDATA.msproduct_bank.service;

import NNTDATA.msproduct_bank.entity.Product;
import reactor.core.publisher.Mono;

public interface IProductService {
    Mono<Product> findById(String id);
    Mono<Product> save(Product product);
}
