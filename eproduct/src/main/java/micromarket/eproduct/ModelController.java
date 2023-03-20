package micromarket.eproduct;

import micromarket.eproduct.model.ProductRepository;
import micromarket.eproduct.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ModelController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/find_all")
    public Iterable<Products> getAllProducts(){

        return productRepository.findAll();
    }

    @GetMapping("/find_by_id")
    public Optional<Products> findById(Integer id) {
        return  productRepository.findById(id);
    }




}
