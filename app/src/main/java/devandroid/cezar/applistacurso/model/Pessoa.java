package devandroid.cezar.applistacurso.model;

public class Pessoa {

    // Construtor
    // Atributos - Objetos - Molde - Modelo - Template
    //Métodos de acesso - Getts and Setts

    private String primeiroNome;
    private String sobrenome;
    private String numeroContato;
    private String cursoDesejado;

    public Pessoa(){
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroContato(){
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato){
        this.numeroContato = numeroContato;
    }

    public String getCursoDesejado(){
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado){
        this.cursoDesejado = cursoDesejado;
    }


    //To String
    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numeroContato='" + numeroContato + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                '}';
    }
}
