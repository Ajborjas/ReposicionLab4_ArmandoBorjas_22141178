
public class Pelea {

    // Atributos
    protected static boolean Win = false;
    // Avatar
    protected static String name;
    protected static int vidaA;
    protected static int ataque1A;
    protected static int ataque2A;
    protected static int ataque3A;
    protected static int ataque4A;
    protected static int ataque5A;
    protected static int ataque6A;
    protected static int ataque7A;
    protected static int ataque8A;
    // Maestro 1
    protected static int vida1;
    protected static int ataque1;
    protected static int ataque2;
    // Maestro 2
    protected static int vida2;
    protected static int ataque3;
    protected static int ataque4;
    // Maestro Fuego 1
    protected static int vidaF1;
    protected static int ataqueF1;
    protected static int ataqueF2;
    // Maestro Fuego 2
    protected static int vidaF2;
    // Maestro Fuego 3
    protected static int vidaF3;
    // Maestro Fuego 4
    protected static int vidaF4;


    public static void addMaestros(String name, String rango, int edad, int tipo) {
        if (tipo == 1) {
            Maestros.MaestroAire.listaMaestros.add(new Maestros.MaestroAire(name, rango, edad));
        } else if (tipo == 2) {
            Maestros.MaestroAgua.listaMaestros.add(new Maestros.MaestroAgua(name, rango, edad));
        } else if (tipo == 3) {
            Maestros.MaestroTierra.listaMaestros.add(new Maestros.MaestroTierra(name, rango, edad));
        } else if (tipo == 4) {
            Maestros.MaestroFuego.listaMaestros.add(new Maestros.MaestroFuego(name, rango, edad));
        } else if (tipo == 5) {
            Maestros.Avatar.listaMaestros.add(new Maestros.Avatar(name, rango, edad));
        }
    }

    public static void deleteMaestros(String name) {
        for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
            if (Maestros.listaMaestros.get(i).getNombre().equals(name)) {
                Maestros.listaMaestros.remove(i);
            }
        }
    }

    public static void showMaestros(int tipo) {
        if (tipo == 1) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getTipoM().equals("Aire")) {
                    System.out.println(Maestros.listaMaestros.get(i).toString());
                }
            }
        } else if (tipo == 2) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getTipoM().equals("Agua")) {
                    System.out.println(Maestros.listaMaestros.get(i).toString());
                }
            }
        } else if (tipo == 3) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getTipoM().equals("Tierra")) {
                    System.out.println(Maestros.listaMaestros.get(i).toString());
                }
            }
        } else if (tipo == 4) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getTipoM().equals("Fuego")) {
                    System.out.println(Maestros.listaMaestros.get(i).toString());
                }
            }
        } else if (tipo == 5) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getTipoM().equals("Avatar")) {
                    System.out.println(Maestros.listaMaestros.get(i).toString());
                }
            }
        } else {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                System.out.println(Maestros.listaMaestros.get(i).toString());
            }
        }
    }

    public static boolean verifyMaestros(String name, String name2) {
        for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
            if (Maestros.listaMaestros.get(i).getNombre().equals(name)) {
                for (int j = 0; j < Maestros.listaMaestros.size(); j++) {
                    if (Maestros.listaMaestros.get(j).getNombre().equals(name2)) {
                        if (Maestros.listaMaestros.get(i).getTipoM().equals(Maestros.listaMaestros.get(j).getTipoM())) {
                            System.out.println("Los maestros son del mismo tipo");
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int ataqueR() {
        return (int) (Math.random() * 2 + 1);
    }

    public static int ataqueRA() {
        return (int) (Math.random() * 8 + 1);
    }

    public static void Pelea1(String name, String name2) {
        if (verifyMaestros(name, name2)) {
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getNombre().equals(name)) {
                    vida1 = Maestros.listaMaestros.get(i).getPointsH();
                    ataque1 = Maestros.listaMaestros.get(i).getPointD1();
                    ataque2 = Maestros.listaMaestros.get(i).getPointD2();
                }
            }
            for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
                if (Maestros.listaMaestros.get(i).getNombre().equals(name2)) {
                    vida2 = Maestros.listaMaestros.get(i).getPointsH();
                    ataque3 = Maestros.listaMaestros.get(i).getPointD1();
                    ataque4 = Maestros.listaMaestros.get(i).getPointD2();
                }
            }
            for (int k = 0; k < Maestros.listaMaestros.size(); k++) {
                if (Maestros.listaMaestros.get(k).getTipoM().equals("Fuego")) {
                    vidaF1 = Maestros.listaMaestros.get(k).getPointsH();
                    ataqueF1 = Maestros.listaMaestros.get(k).getPointD1();
                    ataqueF2 = Maestros.listaMaestros.get(k).getPointD2();
                    vidaF2 = Maestros.listaMaestros.get(k).getPointsH();
                }
            }
            do {
                if (ataqueR() == 1 && vida1 > 0 && vidaF1 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque1 + " puntos de daño al maestro Zuko");
                    vidaF1 = vidaF1 - ataque1;
                    System.out.println("El maestro Zuko ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vida1 = vida1 - ataqueF1;
                } else if (ataqueR() == 2 && vida1 > 0 && vidaF1 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque2 + " puntos de daño al maestro Zuko");
                    vidaF1 = vidaF1 - ataque2;
                    System.out.println("El maestro Zuko ataco con " + ataqueF2 + " puntos de daño al maestro " + name);
                    vida1 = vida1 - ataqueF2;
                }

                if (ataqueR() == 1 && vida2 > 0 && vidaF2 > 0) {
                    System.out.println("El maestro " + name2 + " ataco con " + ataque3 + " puntos de daño al maestro Azula");
                    vidaF2 = vidaF2 - ataque3;
                    System.out.println("El maestro Azula ataco con " + ataqueF1 + " puntos de daño al maestro " + name2);
                    vida2 = vida2 - ataqueF1;
                } else if (ataqueR() == 2 && vida2 > 0 && vidaF2 > 0) {
                    System.out.println("El maestro " + name2 + " ataco con " + ataque4 + " puntos de daño al maestro Azula");
                    vidaF2 = vidaF2 - ataque4;
                    System.out.println("El maestro Azula ataco con " + ataqueF2 + " puntos de daño al maestro " + name2);
                    vida2 = vida2 - ataqueF2;
                }

                if (vida1 <= 0 && vida2 <= 0) {
                    System.out.println("Los maestros " + name + " y " + name2 + " se han quedado sin vida");
                    deleteMaestros(name);
                    deleteMaestros(name2);
                } else if (vida1 <= 0) {
                    System.out.println("El maestro " + name + " se ha quedado sin vida");
                    deleteMaestros(name);
                } else if (vida2 <= 0) {
                    System.out.println("El maestro " + name2 + " se ha quedado sin vida");
                    deleteMaestros(name2);
                }

                if (vidaF1 <= 0 && vidaF2 <= 0) {
                    System.out.println("Los maestros Zuko y Azula se han quedado sin vida");
                    deleteMaestros("Zuko");
                    deleteMaestros("Azula");
                    break;
                } else if (vidaF1 <= 0) {
                    System.out.println("El maestro Zuko se ha quedado sin vida");
                    deleteMaestros("Zuko");
                } else if (vidaF2 <= 0) {
                    System.out.println("El maestro Azula se ha quedado sin vida");
                    deleteMaestros("Azula");
                }
            } while (vida1 > 0 && vida2 > 0);
        }
    }

    public static void Pelea2() {
        for (int i = 0; i < Maestros.listaMaestros.size(); i++) {
            if (Maestros.listaMaestros.get(i).getTipoM().equals("Avatar")) {
                name = Maestros.Avatar.listaMaestros.get(i).getNombre();
                vidaA = Maestros.Avatar.listaMaestros.get(i).getPointsH();
                ataque1A = Maestros.Avatar.listaMaestros.get(i).getPointD1();
                ataque2A = Maestros.Avatar.listaMaestros.get(i).getPointD2();
                ataque3A = Maestros.Avatar.listaMaestros.get(i).getPointsD3();
                ataque4A = Maestros.Avatar.listaMaestros.get(i).getPointsD4();
                ataque5A = Maestros.Avatar.listaMaestros.get(i).getPointsD5();
                ataque6A = Maestros.Avatar.listaMaestros.get(i).getPointsD6();
                ataque7A = Maestros.Avatar.listaMaestros.get(i).getPointsD7();
                ataque8A = Maestros.Avatar.listaMaestros.get(i).getPointsD8();
            }
            for (int j = 0; j < Maestros.Avatar.listaMaestros.size(); j++) {
                if (Maestros.listaMaestros.get(j).getTipoM().equals("Iroh")) {
                    vidaF3 = Maestros.listaMaestros.get(j).getPointsH();
                    ataqueF1 = Maestros.listaMaestros.get(j).getPointD1();
                    ataqueF1 = Maestros.listaMaestros.get(j).getPointD2();
                }
            }
            for (int k = 0; k < Maestros.listaMaestros.size(); k++) {
                if (Maestros.listaMaestros.get(k).getTipoM().equals("Ozai")) {
                    vidaF4 = Maestros.listaMaestros.get(k).getPointsH();
                    ataqueF2 = Maestros.listaMaestros.get(k).getPointD1();
                    ataqueF2 = Maestros.listaMaestros.get(k).getPointD2();
                }
            }

            do {
                if (ataqueRA() == 1 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque1A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque1A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                } else if (ataqueRA() == 2 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque2A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque2A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                } else if (ataqueRA() == 3 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque3A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque3A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                } else if (ataqueRA() == 4 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque4A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque4A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                } else if (ataqueRA() == 5 && vidaA > 0 && vidaF1 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque5A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque5A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF1 + " puntos de vida");
                } else if (ataqueRA() == 6 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque6A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque6A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF1 + " puntos de vida");
                } else if (ataqueRA() == 7 && vidaA > 0 && vidaF3 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque7A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF3 - ataque7A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                } else if (ataqueRA() == 8 && vidaA > 0 && vidaF1 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque8A + " puntos de daño al maestro Iroh");
                    vidaF3 = vidaF1 - ataque8A;
                    System.out.println("El maestro Iroh ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF1;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Iroh tiene " + vidaF3 + " puntos de vida");
                }

                if (ataqueRA() == 1 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque1A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque1A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF4 + " puntos de vida");
                } else if (ataqueRA() == 2 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque2A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque2A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF4 + " puntos de vida");
                } else if (ataqueRA() == 3 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque3A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque3A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF2 + " puntos de vida");
                } else if (ataqueRA() == 4 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque4A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque4A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF2 + " puntos de vida");
                } else if (ataqueRA() == 5 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque5A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque5A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF2 + " puntos de vida");
                } else if (ataqueRA() == 6 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque6A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque6A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF4 + " puntos de vida");
                } else if (ataqueRA() == 7 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque7A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque7A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF4 + " puntos de vida");
                } else if (ataqueRA() == 8 && vidaA > 0 && vidaF4 > 0) {
                    System.out.println("El maestro " + name + " ataco con " + ataque8A + " puntos de daño al maestro Ozai");
                    vidaF4 = vidaF4 - ataque8A;
                    System.out.println("El maestro Ozai ataco con " + ataqueF1 + " puntos de daño al maestro " + name);
                    vidaA = vidaA - ataqueF2;
                    System.out.println("El maestro " + name + " tiene " + vidaA + " puntos de vida");
                    System.out.println("El maestro Ozai tiene " + vidaF4 + " puntos de vida");
                }

                if (vidaA <= 0) {
                    System.out.println("El maestro " + name + " ha muerto");
                }

                if (vidaF3 <= 0 || vidaF4 <= 0) {
                    System.out.println("El maestro Iroh y Ozai ha muerto");
                    Win = true;
                    break;
                } else if (vidaF1 <= 0) {
                    System.out.println("El maestro Iroh ha muerto");
                } else if (vidaF2 <= 0) {
                    System.out.println("El maestro Ozai ha muerto");
                }
            } while (vidaA > 0);
        }
    }
}

