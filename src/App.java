public class App {
    public static void main(String[] args) throws Exception {
        SistemaAlumnos sistema = new SistemaAlumnos();

        Alumno alumno1 = new Alumno("Juan", 18);
        Alumno alumno2 = new Alumno("María", 19);

        sistema.agregarAlumno(alumno1);
        sistema.agregarAlumno(alumno2);

        sistema.agregarCalificacion(alumno1, 8.5);
        sistema.agregarCalificacion(alumno1, 7.9);
        sistema.agregarCalificacion(alumno2, 9.2);

        sistema.mostrarInformacionAlumnos();

        double cantidadDolares = 100;
        double cantidadEuros = ConversorMonedas.dolaresAEuros(cantidadDolares);
        System.out.println(cantidadDolares + " dólares equivalen a " + cantidadEuros + " euros");

        double cantidadPesos = 5000;
        double cantidadDolaresDesdePesos = ConversorMonedas.pesosADolares(cantidadPesos);
        System.out.println(cantidadPesos + " pesos equivalen a " + cantidadDolaresDesdePesos + " dólares");

        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + Calculadora.sumar(num1, num2));
        System.out.println("Resta: " + Calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(num1, num2));

        try {
            System.out.println("División: " + Calculadora.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Hotel hotel1 = new Hotel("Hotel Tairona Inn", 5);
        Hotel hotel2 = new Hotel("Hotel Buenos Aires", 3);

        Cliente cliente1 = new Cliente("Juan Pérez", "123456789", "Empresa X");
        Cliente cliente2 = new Cliente("María López", "987654321", "Empresa Y");

        ReservarHotel reservaHotel = new ReservarHotel();
        reservaHotel.realizarReserva(hotel1, cliente1, hotel1.getHabitacionesDisponibles().get(0));
        reservaHotel.realizarReserva(hotel1, cliente2, hotel1.getHabitacionesDisponibles().get(1));
        reservaHotel.realizarReserva(hotel2, cliente2, hotel2.getHabitacionesDisponibles().get(0));

        System.out.println("Reservas:");
        reservaHotel.mostrarInformacionReservas();
    }
}
