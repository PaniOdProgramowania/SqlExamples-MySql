package pl.paniodprogramowania.sqlexamplesdancers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.paniodprogramowania.sqlexamplesdancers.domain.Dancers;

@Repository
public interface DancersRepository extends JpaRepository<Dancers, Long> {
}
