package pl.paniodprogramowania.sqlexamplesdancers.domain;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DancePlay {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long dancePlayId;

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "primaballerina", referencedColumnName = "dancerId")
    private Dancers primaballerina;

    @Override
    public String toString() {
        return String.join(", ", String.valueOf(dancePlayId), title, String.valueOf(primaballerina.getDancerId()));
    }
}