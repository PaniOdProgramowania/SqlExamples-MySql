package pl.paniodprogramowania.sqlexamplesdancers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.paniodprogramowania.sqlexamplesdancers.domain.DancePlay;

@Repository
public interface DancePlayRepository extends JpaRepository<DancePlay, Long> {
}
