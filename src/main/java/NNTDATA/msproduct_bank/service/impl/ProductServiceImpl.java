package NNTDATA.msproduct_bank.service.impl;

import NNTDATA.msproduct_bank.entity.Product;
import NNTDATA.msproduct_bank.repository.IProductReposiroty;
import NNTDATA.msproduct_bank.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final IProductReposiroty repository;

    @Override
    public Mono<Product> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return repository.save(product);
    }
}
