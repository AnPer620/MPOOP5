public class Main {
    public static void main(String[] args){
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5.6f);
        System.out.println(cir);
        cir.setRadio((float)7.33);
        System.out.println(cir);
        float var= 8.66f;
        cir.setRadio(var);
        System.out.println(cir);
        System.out.println("######################################Composición#######################################");
        Persona persona1=new Persona();
        persona1.setNombre("Susana");
        persona1.setApellido("Vazquez");
        Fecha fecha=new Fecha(2,1,2021);
        persona1.setFechaNacimiento(fecha);
        System.out.println(persona1);
        System.out.println(persona1.getFNacimiento());//Ya lo convirtio en una fecha;
        System.out.println(persona1.getFNacimiento().getAño());//Con lo siguiente se obtiene el año;
        System.out.println("######################################Composición2#######################################");
        //Fecha fecha2 = new Fecha(29,9,2002);
        //Persona persona2= new Persona("Rafael", "Zavala", fecha2);
        Persona persona2= new Persona("Rafael","Zavala",8,4, 1998);
        System.out.println(persona2);
        System.out.println("######################################Actividad#######################################");
        Coche coche1=new Coche("Mazda",2021,"Negro",4,false,300,"Angel", "Pérez", 29, 9, 2002,"Romi", "Román", 27, 11, 2003,"Ximena","Pérez", 30, 6, 2005,"Minda", "Bahena", 4, 12, 1971);
        System.out.println(coche1);
        System.out.println("\n######################################Metodo2#######################################");
        Persona chofer1= new Persona("Chofer","Angel", "Pérez", 29, 9, 2002);
        Persona copiloto1= new Persona("Copiloto","Romi", "Román", 27, 11, 2003);
        Persona pasajero11= new Persona("Pasajero1","Ximena", "Pérez", 30, 6, 2005);
        Persona pasajero21=new Persona("Pasajero2","Minda", "Bahena", 4, 12, 1971);
        Coche coche=new Coche("Toyota", 2021, "Negro", 4, true, 150,chofer1,copiloto1,pasajero11,pasajero21);
        System.out.println(coche);
        System.out.println("\n"+coche.getChofer());
        System.out.println("\n"+coche.getCopiloto());
        System.out.println("\n"+coche.getPasajero1());
        System.out.println("\n"+coche.getPasajero2());
    }
}
