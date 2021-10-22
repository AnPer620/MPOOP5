public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(){

    }

    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        if (dia<1 || dia>31) {
            System.out.println("ERROR, día incorrecto");
        } else {
            this.dia=dia;
        }
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        if (mes<1 || mes>12) {
            System.out.println("ERROR, mes incorrecto");            
        } else {
            this.mes=mes;
        }
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        if (año<1) {
            System.out.println("ERROR, no puede haber años negativos");
        } else {
            this.año=año;
        }
    }

    @Override
    public String toString() {
        return "Fecha{día="+dia+" mes="+mes+" año="+año+"}";

    }
}
