/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad1;

import java.util.ArrayList;

public class Universidad1 {

    static ArrayList<Facultad> facultad = new ArrayList<Facultad>();
    static ArrayList<Formacion> formacion = new ArrayList<Formacion>();
 

    public static void rellenardatos() {

        for (int i = 0; i < 10; i++) {

            Facultad facu = new Facultad("calle/irlanda " + i, "Badajoz " + i);

            Formacion form = new Formacion(345 + i, facu);

            Grado gra = new Grado(60 + i, 15 + i, facu);
            formacion.add(gra);

            Master mas = new Master("lengua " + i, 50 + i, facu);
            formacion.add(mas);

            Mpostgrado mpost = new Mpostgrado(300 + i, "biologia " + i, 40 + i, facu);
            formacion.add(mpost);

            Moficial mof = new Moficial("ingeniero " + i, "fisica " + i, 80 + i, facu);
            formacion.add(mof);

            Regular reg = new Regular("juan " + i, 25 + i);
            form.alumno.add(reg);

            Becario bec = new Becario("matematicas " + i, "jose " + i, 21 + i);
            form.alumno.add(bec);

            Intercambio inter = new Intercambio("Caceres " + i, "luis " + i, 30 + i);
            form.alumno.add(inter);

        }
    }

    public static void main(String[] args) {
        rellenardatos();
    }

}
