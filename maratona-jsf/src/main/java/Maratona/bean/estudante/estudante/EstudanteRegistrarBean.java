package Maratona.bean.estudante.estudante;

import Maratona.bean.estudante.estudante.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Allyson 20/06/2020
 * */

@Named

public class EstudanteRegistrarBean implements Serializable{

    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
