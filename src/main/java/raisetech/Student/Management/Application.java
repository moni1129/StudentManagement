package raisetech.Student.Management;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  private String name ="Enami Kouji";
	private String age ="37";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	@GetMapping("/studentInfo")
	public String studentInfo(){
		return name + " " + age +"sai";
	}

	@PostMapping("/name")
	public void setstudentInfo(String name) {
		this.name = name;
		this.age = age;
	}

	@GetMapping("/test")
	public String test(){
		Map<String, Integer> nameAgeMap = new HashMap<>();
		nameAgeMap.put("tarou", 20);
		nameAgeMap.put("sakura", 24);
		nameAgeMap.put("miku", 43);
		return nameAgeMap.toString();
	}
}

