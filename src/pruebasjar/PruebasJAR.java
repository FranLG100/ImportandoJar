/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjar;

import Dep.*;
import java.time.LocalDate;

/**
 *
 * @author DAM
 */
public class PruebasJAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAOFactory factory=new SqlDbDAOFactory();
        //DAOFactory factory=new NeodatisDAOFactory();
        
        DepartamentoDAO dpto=factory.getDepartamentoDAO();
        EmpleadoDAO empleado=factory.getEmpleadoDAO();
        
        Departamento auxDpto=new Departamento(2, "Contabilidad", "Madrid");
        
        Empleado auxEm=new Empleado(5, "Sanchez", 2, 1, LocalDate.of(2019, 1, 19), "Becario", 350.0);
        
        
        //Insertamos Departamento
        
        //Modificamos Departamento
        
        //Eliminamos Departamento
        
        
        
        //Insertamos empleado
        empleado.InsertarEmpleado(auxEm);
        
        //Modificamos Empleado
        
        //Eliminamos Empleado
        
        
        
        
    }
    
}
