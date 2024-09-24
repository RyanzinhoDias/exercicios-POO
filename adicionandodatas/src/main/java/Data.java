public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void inicializarData(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public boolean dataEValida(){
        boolean validade;
        switch(getMes()){
            case 1, 3, 5, 7, 8, 10, 12:
                validade = getDia() > 0 && getDia() <= 31 && getAno() >= 0;
                break;
            case 2:
                validade = getDia() > 0 && getDia() <= 28 && getAno() >= 0;
                break;
            case 4,6,9,11:
                validade = getDia() > 0 && getDia() <= 30 && getAno() >= 0;
                break;
            default:
                return false;

        }
        return validade;
    }

    public void imprimirData(){
        if (dataEValida()){
            System.out.printf("%d/%d/%d",getDia(), getMes(), getAno());
        }else{
            System.out.println("Data Inválida");
        }

    }
}
