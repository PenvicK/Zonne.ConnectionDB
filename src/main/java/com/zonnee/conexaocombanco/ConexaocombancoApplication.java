package com.zonnee.conexaocombanco;

import com.zonnee.conexaocombanco.dao.StateDAO;
import com.zonnee.conexaocombanco.model.State;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConexaocombancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConexaocombancoApplication.class, args);
		State state = new State(1, "Paraná", "RR");

		StateDAO stateDAO = new StateDAO();
		stateDAO.insertStates(state);
		stateDAO.listStates();
	}

}
