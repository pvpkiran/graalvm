package in.phani.graalvm;

import in.phani.graalvm.config.HintsRegistrationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(HintsRegistrationConfig.class)
public class GraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmApplication.class, args);
	}
}
