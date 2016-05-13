/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios.pruebas;

import horarios.logica.Horarios;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amoto
 */
public class horariosTest {
    @Test
    public void deBug() {
        int n=2,h=4;
        ArrayList<int[]> coeficientes= new ArrayList<>();
        int[] tmp=new int[2];
        
        tmp[0]=3;tmp[1]=2;coeficientes.add(tmp);
        tmp=new int[2];
        tmp[0]=2;tmp[1]=1;coeficientes.add(tmp);
        
        Horarios hor = new Horarios(n, h,coeficientes);
        //System.out.println(hor.getPromedio()+"\n"+Arrays.toString(hor.getHorasPorProyecto())+"\n"+Arrays.toString(hor.getNotasProyecto()));
        Assert.assertEquals("No calcula adecuadamente el promedio", hor.getPromedio(), 6.5, 0 );
    }
}
