/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.edu.tarea2_patronordenamiento;

/**
 *
 * @author jf001
 */
public class Tarea2_PatronOrdenamiento {

    public static void main(String[] args) {
               String cadena = "{,[,(,),],}­";
        StringBuilder builder = new StringBuilder();
        int count = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                count++;
                builder.append("{".repeat(count)).append("\n");
                if (c == '[' || c == '(') {
                    builder.append("{".repeat(count)).append(" [").append("\n");
                }
            } else if (c == ')' || c == ']' || c == '}') {
                if (count > 0) {
                    count--;
                }
                builder.append("{".repeat(count)).append("\n");
            }
        }

        System.out.println(builder.toString());
    }
}
