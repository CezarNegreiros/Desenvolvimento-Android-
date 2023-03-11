package devandroid.cezar.applistacurso.model;

public class Curso {

    private String nomeDoCursoDesejado;

    public Curso(String nomeCurso){
        this.nomeDoCursoDesejado = nomeCurso;
    }

    public String getNomeDoCursoDesejado(){
        return nomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado){
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}
