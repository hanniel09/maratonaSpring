package estudosSpring.maratonaSpring.repository;

import estudosSpring.maratonaSpring.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
