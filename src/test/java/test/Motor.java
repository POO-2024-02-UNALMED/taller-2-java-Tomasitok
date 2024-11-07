package test;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int nuevoRegistro){
        registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo){
        if("electrico".equalsIgnoreCase(nuevoTipo) || "gasolina".equalsIgnoreCase(nuevoTipo)){
            this.tipo = nuevoTipo;
        }
    }
}
