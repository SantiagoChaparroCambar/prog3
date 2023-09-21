import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehiculo {
    private String placa;
    private String tipo;
    private String horaIngreso;
    private String horaSalida;

    public Vehiculo(String placa, String tipo, String horaIngreso) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaIngreso = horaIngreso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double calcularValor() {
        int tiempoMinutos = calcularTiempoEnMinutos();
        switch (tipo) {
            case "Automovil":
                return tiempoMinutos * 0.12; // 60 pesos por minuto
            case "Motocicleta":
                return tiempoMinutos * 0.06; // 30 pesos por minuto
            case "Bicicleta":
                return tiempoMinutos * 0.04; // 20 pesos por minuto
            default:
                return 0.0;
        }
    }

    public int calcularTiempoEnMinutos() {
        try {
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

            Date horaIngresoDate = formatoHora.parse(horaIngreso);
            Date horaSalidaDate = formatoHora.parse(horaSalida);

            long diferenciaEnMilisegundos = horaSalidaDate.getTime() - horaIngresoDate.getTime();
            return (int) (diferenciaEnMilisegundos / (3 * 1000));
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
