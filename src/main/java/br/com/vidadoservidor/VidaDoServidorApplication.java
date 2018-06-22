package br.com.vidadoservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class VidaDoServidorApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Vida do Servidor";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VidaDoServidorApplication.class, args);
	}
}
