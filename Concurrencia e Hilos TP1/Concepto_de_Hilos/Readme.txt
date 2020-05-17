Prueba de concepto sobre el manejo de hilos 
---------------------------------------

	A los fines didacticos se Implementa esta prueba para ver en pantalla las opciones a demostrar 
	Se pretende mostrar el funcionamiento de hilos de ejecución. 


	Ejemplo queremos mostrar dos proceso ejecutandose para lo cual tomo un bucle for y los hago ejecutar
	por 5 veces. 



            for (int i=0; i<=5; i++){
                System.out.println("proceso 1");
            }
            
            System.out.println("");
            
            for (int i=0; i<=5; i++){
                System.out.println("proceso 2");
            }



Resultado:
-----------


	se pretende mostrar la ejecución de un mensaje como lo es Proceso1 y Proceso2 
	la prueba de concepto pretende mostrar como se ejecuta un numero determinado de veces cada uno 
	de los procesos. 


Salida en pantalla: 
-------------------

proceso 1
proceso 1
proceso 1
proceso 1
proceso 1
proceso 1

proceso 2
proceso 2
proceso 2
proceso 2
proceso 2
proceso 2

Conclusion 
----------

	En este ejemplo no vemos la ejecucion concurrente de hilos sino que los vemos por separado. 
