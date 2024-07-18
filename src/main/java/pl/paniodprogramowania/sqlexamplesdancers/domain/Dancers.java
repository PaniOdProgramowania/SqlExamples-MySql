package pl.paniodprogramowania.sqlexamplesdancers.domain;

import jakarta.persistence.*;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Dancers {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long dancerId;

    @Column
    private String firstName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "primaballerina")
    private List<DancePlay> dancePlays;

}
