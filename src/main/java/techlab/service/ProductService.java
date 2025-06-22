package techlab.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import techlab.dto.request.ProductRequestDTO;
import techlab.dto.response.ProductResponseDTO;
import techlab.entity.Product;
import techlab.exception.ProductNotFoundException;
import techlab.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productRequestDTO, product);

        this.repository.save(product);

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        BeanUtils.copyProperties(product, productResponseDTO);
        return productResponseDTO;
    }

    public List<ProductResponseDTO> getProducts(){
        return this.repository.findAll()
                .stream()
                .map(this::mapperToDTO)
                .toList();
    }

    public List<ProductResponseDTO> searchProductByName(String queryName){
        List<Product> foundProducts = this.repository.findProductByName(queryName);

        if (foundProducts.isEmpty()) {
            throw new ProductNotFoundException(queryName);
        }

        return foundProducts
                .stream()
                .map(this::mapperToDTO)
                .toList();
    }

    /**
     * Convertir la entidad de *Product* en un *ProductResponseDTO* para la respuesta
     * @param p - producto a convertir
     * @return ProductResponseDTO
     */
    public ProductResponseDTO mapperToDTO(Product p){
        ProductResponseDTO dto = new ProductResponseDTO();
        BeanUtils.copyProperties(p, dto);
        return dto;
    }
}
