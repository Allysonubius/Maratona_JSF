package bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Allyson 20/06/2020
 * */

@Named

public class EstudanteRegistrarBean implements Serializable{

    private String nome = "Allyson";
    private String sobrenome = "Oliveira";

    private double nota_1;
    private double nota_2;
    private double nota_3 = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getNota_3() {
        return nota_3;
    }

    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;
    }
}
