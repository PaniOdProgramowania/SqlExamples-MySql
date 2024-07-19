package pl.paniodprogramowania.sqlexamplesdancers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.paniodprogramowania.sqlexamplesdancers.domain.DancePlay;
import pl.paniodprogramowania.sqlexamplesdancers.domain.Dancers;
import pl.paniodprogramowania.sqlexamplesdancers.repositories.DancePlayRepository;
import pl.paniodprogramowania.sqlexamplesdancers.repositories.DancersRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DancersApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "local");
		var context = SpringApplication.run(DancersApplication.class, args);

		DancersRepository dancersRepository = context.getBean(DancersRepository.class);
		DancePlayRepository dancersPlayRepository = context.getBean(DancePlayRepository.class);
		List<Dancers> dancers = dancersRepository.findAll();
		dancers.forEach(dancer -> {
			System.out.println(dancer.getDancerId() + ", name: " + dancer.getFirstName() + ", nr of " +
					"plays: " + dancer.getDancePlays().size());
		});
		System.out.println();
		List<DancePlay> dancePlays = dancersPlayRepository.findAll();
		dancePlays.forEach(dancePlay -> {
			System.out.println(dancePlay.getDancePlayId() +", title: " + dancePlay.getTitle() +", " +
					"dancer: " + Optional.ofNullable(dancePlay.getPrimaballerina()).map(Dancers::getFirstName).orElse("null"));
		});

		DancePlay newDancePlay = dancersPlayRepository.save(DancePlay.builder().title("Storm").primaballerina(dancers.get(3)).build());
		System.out.println("new dance play - Storm - added");
		System.out.println(newDancePlay);
		System.out.println(dancersPlayRepository.findById(newDancePlay.getDancePlayId()));

	}

}
