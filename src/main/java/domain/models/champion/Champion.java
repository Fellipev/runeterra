package domain.models.champion;
import domain.Lanes;
import domain.Tier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "champions")
@Entity(name = "champions")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Champion {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Long city_id;
    private String name;
    private Lanes lane;
    private Tier tier;
}
