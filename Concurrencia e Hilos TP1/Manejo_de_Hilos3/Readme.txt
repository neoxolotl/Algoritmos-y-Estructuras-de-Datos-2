Estados o ciclos de vida de un Hilo

Estado Nuevo (New)
------------------

	El hilo fue creado pero no inicializado es decir no hemos ejecutado start()

	Producira un mensaje de error (IllegalTrhadStateException) si se intenta
ejecutar cualquier metodo de la clase Trhead Excepto con el metodo Start()


Estado  Ejecutable (Runnable)
-----------------------------

	Cuando el metodo start() crea los recursos del sistema necesarios para 
ejecutar el hilo, probrama el trhad para ejecutarse, y llama al metodo run()
del trhad. En este punto el hilo esta en el estado Ejecutable 


Estado Bloqueado (Blocket o Not Runnable)
-----------------------------------------

	En este estado el hilo se encuentra en ejecución, pero existe una tarea
o actividad del mimo hilo que lo impide. 

cuarto y ultimo estado 

Estado de Muerto o finalizado (Dead)
------------------------------------
	Un hilo puede moriro de dos formas: 
	causas naturales una muerte natural se produce cuando run termina normalmente 

	siendo asesinado. o provocado se produce cuando existe una instrucccion que lo obligue 
	finalizar sin haber concluido sus tarea. 

https://docs.oracle.com/javase/7/docs/api/


