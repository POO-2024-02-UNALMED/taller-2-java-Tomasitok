package test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String nuevoColor){
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};

        boolean colorValido = false;

        for(String colorPermitido : coloresPermitidos){
            if(colorPermitido.equals(nuevoColor)){
                colorValido = true;
                break;
            }
        }

        if(colorValido){
            this.color = nuevoColor;
        }
    }
}
