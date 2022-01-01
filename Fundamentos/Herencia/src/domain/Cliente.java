package domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(boolean vip,String nombre, char genero, int edad, String direccion,Date fechaRegistro){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
