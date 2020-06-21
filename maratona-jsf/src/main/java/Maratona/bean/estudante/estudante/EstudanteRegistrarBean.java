package Maratona.bean.estudante.estudante;

import Maratona.bean.estudante.estudante.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Allyson 20/06/2020
 * */

@Named

public class EstudanteRegistrarBean implements Serializable{

    private Estudante estudante = new Estudante();

    private String [] nomesArray = {"Ana","Lobo","Vovo"};

    private List<String> nomeList = asList ("Ana", "Lobo", "Vovo");

    private Set<String> nomesSet = new HashSet<>(asList ("Ana", "Lobo", "Vovo"));

    private Map<String , String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("One", "Primeiro");
        nomesMap.put("Segundo", "dDoius");
        for(String nome: nomesSet){
            System.out.println(nome);
        }
    }

    public void executar(){
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os BD");
        System.out.println("Exibindo os BD");
    }

    public void executar(String param){
        System.out.println("Fazendo uma busca no BD " + param);
        System.out.println("Processando os BD");
        System.out.println("Exibindo os BD");
    }

    public String executarRetorno(String param){
        return "Ola allyson" + param;
    }

    public String pageIndex2(String param){
        return "index2";
    }
    public String pageIndex2(){
        return "index2?faces-redirect=true";
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomeList() {
        return nomeList;
    }

    public void setNomeList(List<String> nomeList) {
        this.nomeList = nomeList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
