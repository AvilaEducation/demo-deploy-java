package techlab.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private Long id;
    private String name;
    private String price;
}
