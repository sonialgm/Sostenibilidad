import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ConsumoElectrico {
    public static void main(String[] args) {

        if(args.length<1){
            System.out.println("Se debe pasar al menos un argumento (ruta del csv).");
            return;
        }

        String ruta= args[0]; //Ruta al CSV como argumento
        int numero= 3; //Se mostrará el top 3 de municipios por defecto
        if(args.length >= 2){ //Si se pasa un segundo parámetro indicará cuantos muncipios mostrar
            numero= Integer.parseInt(args[1]);
        }

        try { 
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            br.readLine(); //Saltar la cabecera del CSV

            ArrayList<Vivienda> viviendas = new ArrayList<>(); 

            String linea;
            while ((linea = br.readLine()) != null && !linea.isEmpty()) {
                String[] partes = linea.split(";"); 
                
                String codigo = partes[2];       
                String territorio = partes[3]; 
                String valorStr = partes[4];    

                if (valorStr.equals("-")) { //Cambiamos el valor de los guiones por 0
                    valorStr = "0";
                }

                int valor = Integer.parseInt(valorStr);

                viviendas.add(new Vivienda(codigo, territorio, valor));
                
            }

            br.close();

            Collections.sort(viviendas); //Ordenamos la lista de viviendas

            for(int i = 0; i < numero; i++){ //Imprimir los resultados
                System.out.println((i+1)+") "+viviendas.get(i)); 

            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
