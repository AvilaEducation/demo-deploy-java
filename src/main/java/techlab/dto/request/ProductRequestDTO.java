package techlab.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {

  private String name;
  private String price;
  private String description;
  private String img;
}
