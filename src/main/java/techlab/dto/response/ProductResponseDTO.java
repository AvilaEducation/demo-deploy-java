package techlab.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {

  private Long id;
  private String name;
  private String image;
  private Double price;
  private Integer stock;
  private String category;
  private String description;
}
