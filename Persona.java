public class Persona {
    private String lugar;
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona(){}
    public Persona(String lugar,String nombre, String apellido, Fecha fNacimiento){
        this.lugar=lugar;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNacimiento=fNacimiento;
    }
    public Persona(String lugar,String nombre, String apellido,int dia, int mes, int año){
        this.nombre=nombre;
        this.apellido=apellido;
        this.lugar=lugar;
        /*opción 1
        fNacimiento= new Fecha();//sin está linea no funciona
        this.fNacimiento.setDia(dia);
        this.fNacimiento.setMes(mes);
        this.fNacimiento.setAño(año);*/
        //opción2
        fNacimiento=new Fecha(dia, mes, año);
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNacimiento=fNacimiento;
    }

    public Persona(String nombre, String apellido,int dia, int mes, int año){
        this.nombre=nombre;
        this.apellido=apellido;
        /*opción 1
        fNacimiento= new Fecha();//sin está linea no funciona
        this.fNacimiento.setDia(dia);
        this.fNacimiento.setMes(mes);
        this.fNacimiento.setAño(año);*/
        //opción2
        fNacimiento=new Fecha(dia, mes, año);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public Fecha getFNacimiento(){
        return fNacimiento;
    }

    public void setFechaNacimiento(Fecha fNacimiento){
        this.fNacimiento=fNacimiento;
    }

    public String getLugar(){
        return lugar;
    }

    public void setLugar(String lugar){
        this.lugar=lugar;
    }

    @Override
    public String toString(){
        if (lugar==null) {
            return "Persona{nombre="+nombre+" apellido="+apellido+" Fecha de nacimiento="+fNacimiento+"}";
        } else {
            return "{"+lugar+"="+nombre+" apellido="+apellido+" Fecha de nacimiento="+fNacimiento+"}";
        }
    }
}
