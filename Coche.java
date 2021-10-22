class Coche {
    //Sección de atributos
    private String color;
    private String marca;
    private int numPuertas;
    private int año;
    private int potencia;
    private boolean automatico;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    //Sección de contructores
    public Coche(){

    }

    public Coche(String marca, int año, String color, int numPuertas,boolean automatico, int potencia,Persona chofer,Persona copiloto,Persona pasajero1,Persona pasajero2){
        this.marca =marca;
        this.año =año;
        this.color= color;
        this.numPuertas = numPuertas;
        this.automatico = automatico;
        this.potencia = potencia;
        this.chofer=chofer;
        this.copiloto=copiloto;
        this.pasajero1=pasajero1;
        this.pasajero2=pasajero2;
    }

    public Coche(String marca, int año, String color, int numPuertas,boolean automatico, int potencia,String nombre1,String apellido1,int dia1,int mes1, int año1,String nombre2,String apellido2,int dia2,int mes2, int año2,String nombre3,String apellido3,int dia3,int mes3, int año3,String nombre4,String apellido4,int dia4,int mes4, int año4 ){
        this.marca =marca;
        this.año =año;
        this.color= color;
        this.numPuertas = numPuertas;
        this.automatico = automatico;
        this.potencia = potencia;
        chofer= new Persona(nombre1,apellido1,dia1,mes1,año1);
        copiloto=new Persona(nombre2,apellido2,dia2,mes2,año2);
        pasajero1=new Persona(nombre3,apellido3,dia3,mes3,año3);
        pasajero2=new Persona(nombre4,apellido4,dia4,mes4,año4);
    }
    //Sección de metodos
    public void encender(){
        System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
    }
    public void avanzar(boolean avanza) {
        //avanza == true
        //true == true -> true
        if (avanza) {
            System.out.println("Estoy avanzando a 10 Km/h");
        } else {
            System.out.println("Voy a cero kilometros por hora");
        }         
    }
    public void Apagar() {
        System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
    }
    public void frenar(boolean frena) {
        if (frena) {
            System.out.println("Estoy frenando");
        } else {
            System.out.println("No estoy frenando");
        }        
    }
    public void abrirPuertas(int numPuertasAAbrir) {
        if (numPuertasAAbrir>numPuertas) {
            System.out.println("El número de puertas al abrir es mayor que el número de puertas");            
        } else {
            System.out.println("Abriendo");
        }
        switch (numPuertasAAbrir) {
            case 1:
                System.out.println("Solo se abrió una puertas");
                break;
            case 2:
                System.out.println("Solo se abrieron 2 puertas");
                break;
            case 3:
                System.out.println("Solo se abrieron 3 puertas");
                break;
            case 4:
                System.out.println("Se abrieron 4 puertas");
                break;
            default:
                if (numPuertasAAbrir>numPuertas) {
                    break;
                }
                System.out.println("se abrieron"+numPuertasAAbrir);
                break;
        }        
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas=numPuertas;
    }

    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año=año;
    }

    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia=potencia;
    }

    public boolean getAtomatico(){
        return automatico;
    }
    public void setAutomatico(boolean automatico){
        this.automatico=automatico;
    }

    public Persona getChofer(){
        return chofer;
    }
    public void setChofer(Persona chofer){
        this.chofer=chofer;
    }

    public Persona getCopiloto(){
        return copiloto;
    }
    public void setCopiloto(Persona copiloto){
        this.copiloto=copiloto;
    }

    public Persona getPasajero1(){
        return pasajero1;
    }
    public void setPasajero1(Persona pasajero1){
        this.pasajero1=pasajero1;
    }
    public Persona getPasajero2(){
        return pasajero2;
    }
    public void setPasajero2(Persona pasajero2){
        this.pasajero2=pasajero2;
    }


    @Override
    public String toString(){
        return"Coche{"+" marca="+marca+" año="+año+" color="+color+" automatico="+automatico+" potencia="+potencia+" Chofer="+chofer+" Copiloto="+
        copiloto+" Pasajero1="+pasajero1+" Pasajero2="+pasajero2+"}";
    }
}