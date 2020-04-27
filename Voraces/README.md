Algoritmos voraces
-------------------


Esquema Genérico:
-----------------

funcion voraz (C:conjunto) 
	devuelve conjunto
{C es el conj de todos los Candidatos}

principio 
	S=0; {S es el conj en el que se construye la solucion}

	mq solucion(S) ∧ C≠Ø hacer
	x:=elemento de C que
		maximiza seleccionar(x);
	C:=C-{x};

	Si completable (S∪{x})

		entoncesS:=S∪{x}

	fsi 

	fmq;

	si solucion(S) 
		entonces devuelve S 
	sino 
		devuelve "No hay Solucion"
	fsi 

fin 




Ref: https://webdiis.unizar.es/asignaturas/EDA/ea/slides/2-Algoritmos%20Voraces.pdf


 
