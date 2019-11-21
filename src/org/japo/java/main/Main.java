/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        final int NUM_AMIGOS = 2;
        final double D_INI = 2.00;
        final double P_PELI = 1.30;
        final double P_PALOMITAS = 0.90;
        double repartoPalomitas = P_PALOMITAS / NUM_AMIGOS;
        double gastosIndividuales = P_PELI + repartoPalomitas;
        double dRestante = D_INI - gastosIndividuales;

        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");

        System.out.printf(Locale.ENGLISH, "Dinero inicial .....: %.2f €%n", D_INI);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Precio película ....: %.2f €%n", P_PELI);
        System.out.printf(Locale.ENGLISH, "Parte palomitas ....: %.2f €%n", repartoPalomitas);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Gastos por persona .: %.2f €%n", gastosIndividuales);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Dinero restante ....: %.2f €%n", dRestante);

    }

}
