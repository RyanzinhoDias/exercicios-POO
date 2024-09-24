public class Funcionario {
    private String nome;
    private String departamento;
    private float horasTrabalhadas;
    private float horasExtrasTrabalhadas;
    private float salarioPorHora;
    private float salarioPorHoraExtra;

    public Funcionario(String nome, String departamento, float horasTrabalhadas, float horasExtrasTrabalhadas, float salarioPorHora, float salarioPorHoraExtra){
        this.nome = nome;
        this.departamento = departamento;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getHorasExtrasTrabalhadas() {
        return horasExtrasTrabalhadas;
    }
    public void setHorasExtrasTrabalhadas(float horasExtrasTrabalhadas) {
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }

    public float getSalarioPorHora() {
        return salarioPorHora;
    }
    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public float getSalarioPorHoraExtra() {
        return salarioPorHoraExtra;
    }
    public void setSalarioPorHoraExtra(float salarioPorHoraExtra) {
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }

    public void mostrarDados(){
        System.out.printf("Funcionário: %s\nDepartamento: %s\nHoras trabalhadas: %s\nSalário por hora: %s",
                getNome(), getDepartamento(), getHorasTrabalhadas(), getSalarioPorHora());
    }

    public float calculaSalarioMensal(){
        float res = 0;
        boolean diretoria = getDepartamento().equals("Diretoria");
        boolean horasNormais = (getHorasTrabalhadas() > 0 && getSalarioPorHora() > 0);
        boolean horasNormaiseExtras = (getHorasExtrasTrabalhadas() > 0 && getSalarioPorHoraExtra() > 0) && (getHorasTrabalhadas() > 0 && getSalarioPorHora() > 0);

        if (horasNormaiseExtras && !diretoria) {
            res = (getSalarioPorHoraExtra() * getHorasExtrasTrabalhadas()) + getSalarioPorHora() * getHorasTrabalhadas();

        } else if (horasNormais && diretoria) {
            float totalSalarioNormaleExtra = (getHorasExtrasTrabalhadas() * getSalarioPorHoraExtra());
            float totalSalarioNormal = getSalarioPorHora() * getHorasTrabalhadas();
            res = (totalSalarioNormaleExtra + totalSalarioNormal) + (((float) 10 /100) * totalSalarioNormal);

        }else if (horasNormais) {
            res = getSalarioPorHora() * getHorasTrabalhadas();
        }

        return res;
    }
}
