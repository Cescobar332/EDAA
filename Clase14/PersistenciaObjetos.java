package Clase14;

import java.io.*;
public class PersistenciaObjetos {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        try {

            ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("carlosescobar.amc"));
            EscarabajoTortugadeOro e1 = new EscarabajoTortugadeOro();
            e1.setNombre("Jair");
            objout.writeObject(e1);
            ObjectInputStream objin = new ObjectInputStream(new FileInputStream("carlosescobar.amc"));
            EscarabajoTortugadeOro e2 = (EscarabajoTortugadeOro) objin.readObject();
            System.out.println(e2.getNombre());


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}