package ma.xproce.controlearchii.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import ma.xproce.controlearchii.dao.entities.Book;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDTO {
    private String titre;
    private String publisher;
    private String datePublication;
    private double price;
    private String resume;

    public static Builder builder() {
        return new Builder();
    }
}
