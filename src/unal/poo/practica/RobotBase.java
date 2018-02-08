package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2,Direction.SOUTH,10);
            
	    //Girar a la izquierda
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
        
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
                     
            //Girar a la izquierda
            estudiante.turnLeft();
         
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
              
            //Girar a la izquierda
            estudiante.turnLeft();
            
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
                          
              estudiante.pickThing();
            
            //Girar a la izquierda
            estudiante.turnLeft();
            estudiante.turnLeft();
                          
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
                     
            //Girar a la izquierda
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
                       
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            //Girar a la izquierda
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
                       
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
                   
       	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

