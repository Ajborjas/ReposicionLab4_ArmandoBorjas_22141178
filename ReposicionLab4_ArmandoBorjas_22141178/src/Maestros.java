import java.util.ArrayList;

public class Maestros {

    // Atributos
    protected String nombre;
    protected String tipoM;
    protected String rango;
    protected int edad;
    protected int pointsH;
    protected int pointD1;
    protected int pointD2;
    protected static ArrayList<Maestros> listaMaestros = new ArrayList<>();

    public Maestros(String nombre, String rango, int edad) {
        this.nombre = nombre;
        this.tipoM = "";
        this.rango = rango;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoM() {
        return tipoM;
    }

    public String getRango() {
        return rango;
    }

    public int getEdad() {
        return edad;
    }

    public int getPointsH() {
        return pointsH;
    }

    public void setPointsH(int pointsH) {
        this.pointsH = pointsH;
    }

    public int getPointD1() {
        return pointD1;
    }

    public void setPointD1(int pointD1) {
        this.pointD1 = pointD1;
    }

    public int getPointD2() {
        return pointD2;
    }

    public void setPointD2(int pointD2) {
        this.pointD2 = pointD2;
    }

    public String toString() {
        return "Nombre: " + nombre + " Maestro: " + tipoM + " Rango: " + rango + " Edad: " + edad +
                " Puntos de Vida: " + pointsH + " Puntos de daño ataque 1: " + pointD1 + " Puntos de daño ataque 2: " + pointD2;
    }

    public int getPointsD3() {
        return Avatar.pointsD3;
    }

    public int getPointsD4() {
        return Avatar.pointsD4;
    }

    public int getPointsD5() {
        return Avatar.pointsD5;
    }
    public int getPointsD6() {
        return Avatar.pointsD6;
    }
    public int getPointsD7() {
        return Avatar.pointsD7;
    }
    public int getPointsD8() {
        return Avatar.pointsD8;
    }



    public static class MaestroAire extends Maestros {

        public MaestroAire(String nombre, String rango, int edad) {
            super(nombre, rango, edad);
            this.tipoM = "Aire";
            pointsH = 125;
            pointD1 = 35;
            pointD2 = 42;
        }

    }

    public static class MaestroAgua extends Maestros {

        public MaestroAgua(String nombre, String rango, int edad) {
            super(nombre, rango, edad);
            this.tipoM = "Agua";
            pointsH = 145;
            pointD1 = 38;
            pointD2 = 45;
        }
    }

    public static class MaestroTierra extends Maestros {

        public MaestroTierra(String nombre, String rango, int edad) {
            super(nombre, rango, edad);
            this.tipoM = "Tierra";
            pointsH = 200;
            pointD1 = 40;
            pointD2 = 52;
        }
    }

    public static class MaestroFuego extends Maestros {

        public MaestroFuego(String nombre, String rango, int edad) {
            super(nombre, rango, edad);
            this.tipoM = "Fuego";
            pointsH = 160;
            pointD1 = 40;
            pointD2 = 45;
        }
    }

    public static class Avatar extends Maestros {
        // Atributos
        protected int pointsH;
        protected int pointsD1;
        protected int pointsD2;
        protected static int pointsD3;
        protected static int pointsD4;
        protected static int pointsD5;
        protected static int pointsD6;
        protected static int pointsD7;
        protected static int pointsD8;

        public Avatar(String nombre, String rango, int edad) {
            super(nombre, rango, edad);
            this.tipoM= "Avatar";
            this.pointsH = 350;
            this.pointsD1 = 35;
            this.pointsD2 = 42;
            pointsD3 = 38;
            pointsD4 = 45;
            pointsD5 = 40;
            pointsD6 = 52;
            pointsD7 = 40;
            pointsD8 = 45;
        }

        @Override
        public int getPointsH() {
            return pointsH;
        }

        public int getPointsD1() {
            return pointsD1;
        }

        public int getPointsD2() {
            return pointsD2;
        }

        public int getPointsD3() {
            return pointsD3;
        }

        public int getPointsD4() {
            return pointsD4;
        }

        public int getPointsD5() {
            return pointsD5;
        }

        public int getPointsD6() {
            return pointsD6;
        }

        public int getPointsD7() {
            return pointsD7;
        }

        public int getPointsD8() {
            return pointsD8;
        }

        public String toString() {
            return  "Nombre: " + nombre + " Maestro: " + tipoM + " Rango: " + rango + " Edad: " + edad + " Puntos de Vida: "
                    + pointsH + " Puntos de daño ataque 1: " + pointsD1 + " Puntos de daño ataque 2: " + pointsD2 +
                    " Puntos de daño ataque 3: " + pointsD3 + " Puntos de daño ataque 4: " + pointsD4 + " Puntos de daño ataque 5: "
                    + pointsD5 + " Puntos de daño ataque 6: " + pointsD6 + " Puntos de daño ataque 7: " + pointsD7 + " Puntos de daño ataque 8: " + pointsD8;
        }

    }

}
