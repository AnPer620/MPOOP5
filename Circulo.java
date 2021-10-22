class Circulo{
    private float radio;

    public Circulo(){}
    public float perimetro(){
        return 2*(float) Math.PI* radio;
    }

    public float area(){
        return (float) Math.PI * radio * radio;
    }

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        if (radio<0) {
            this.radio = Math.abs(radio);
        } else {
            this.radio= radio;
        }
    }

    @Override
    public String toString() {
        return "Circulo{radio "+radio+"}";
    }
}