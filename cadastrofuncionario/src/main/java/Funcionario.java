public class Funcionario {
    public String nome;
    public String endereco;
    public double salario;
    public String dataAniversario;
    public String rg;
    public String cpf;
    private boolean contratado;

    public Funcionario(String nome, String endereco, double salario, String dataAniversario, String rg, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.dataAniversario = dataAniversario;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean contratar(){
        return contratado = true;
    }

    public boolean demitir(){
        return contratado = false;
    }

    public void aumentoSalario(double valor){
        setSalario(getSalario()+valor);
    }

    public void reducaoSalario(double valor){
        setSalario(getSalario()-valor);
    }

    public void entrarDeFerias(){
        System.out.println("Hoje se iniciam suas férias, tenha um excelente descanso!");
    }

    public void voltardasFerias(){
        System.out.println("Hoje você retorna, esperamos que tenha aproveitado bastante!");
    }
}
