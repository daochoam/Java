/**
 * Número de votos influenciados por televisión
 * Adicione el atributo necesario en la clase Candidato que modele el contador de 
 * los votos obtenidos por el medio de comunicación de televisión (votosInfluenciaTelevision). 
 * (Nota: Cada vez que se genere un voto por televisión, se debería adicionar al atributo un voto).
 * 
 */
 
 private int votosInfluenciaTelevision;


 /**
* Agregue el método correspondiente para obtener el valor del nuevo atributo creado. 
Además el método de retorno debe llamarse darVotosInfluenciaTelevision().
*
* Devuelve el número de votos influenciados por television.
* @return número de votos influenciados por television.
*/
public int darVotosInfluenciaTelevision(){
        return votosInfluenciaTelevision;
}


/**
* Cree, en la clase Candidato, el método inicializarInfluenciaTelevision() para que 
se asigne un valor de 0 al atributo previamente creado. Este método únicamente modifica 
los valores del atributo, no debe retornar ningún valor.
* 
* Inicializa los atributos correspondientes a la influencia de los canales de televisión y radio en 0.
* También puede ser usado para el reinicio de los atributos de votos por influencia de la television y de la radio 
* a su valor inicial.
*/
public void inicializarInfluenciaTelevision()
{	 
    votosInfluenciaTelevision = 0;
    votosInfluenciaRadio = 0;
}

/**
* En la clase Candidato cree el método para agregar votos por televisión (agregarVotoInfluenciaTelevision( )) 
para que aumente el atributo correspondiente. Tenga en cuenta que este método no debe 
retornar ningún valor.
*
* Agrega un voto influenciado por la televisión al atributo correspondiente
*/
    public void agregarVotoInfluenciaTelevision(){

        votosInfluenciaTelevision += 1;

    }

/**
*En la clase Candidato, cree un método de nombre darPorcentajeVotosInfluenciaTelevisionCanditato()
que retorne el porcentaje de votos que son influenciados por televisión del total de votos que 
recibió el candidato. Tenga en cuenta que en la clase Candidato existe el atributo votos que lleva 
la suma total de votos recibidos por el candidato, además el valor de retorno del método debe tener 
decimales y debe ser porcentual, es decir que debe estar entre 0.0 y 100.0 (EJ: 10.1) y de no haber 
votos el valor por defecto a retornar es 0.0.
* 
* Devuelve el porcentaje de votos de influencia teniendo en cuenta los votos de televisiÃ³n 
* sobre el total de votos recibidos.
* @return procentaje de votos total que fueron recibidos por television 
*/
    public double darPorcentajeVotosInfluenciaTelevisionCanditato(){
        int VotosTotal = darVotos();
        int VotosTV = darVotosInfluenciaTelevision();
        if (votos !=0) {
            return (VotosTV/votos)*100;}
        else{
            return 0.0;
        }
}

/**
* En la clase Urna, cree el método darPromedioPorcentajeVotosInfluenciaTelevisionRadioCandidatos() 
para que devuelva el porcentaje promedio de votos que los candidatos recibieron por influencia de 
la televisión. Tenga en cuenta que dentro de la aplicación existen tres candidatos candidato1, candidato2, 
y candidato3 y el valor de retorno del método debe tener decimales y ser porcentual, es decir que debe 
estar entre 0.0 y 100.0 (EJ: 10.1). 

* Devuelve el promedio de porcentaje de influencia de votos de television para todos los candidatos.
* @return promedio del porcentaje de votos influenciados por televisiÃ³n para todos los candidatos.
*/

public double darPromedioPorcentajeVotosInfluenciaTelevisionRadioCandidatos() {
    double PorcentajeVotosTvCandidato1 = candidato1.darPorcentajeVotosInfluenciaTelevisionCanditato();
    double PorcentajeVotosTvCandidato2 = candidato2.darPorcentajeVotosInfluenciaTelevisionCanditato();
    double PorcentajeVotosTvCandidato3 = candidato3.darPorcentajeVotosInfluenciaTelevisionCanditato();

    return (PorcentajeVotosTvCandidato1+PorcentajeVotosTvCandidato2+PorcentajeVotosTvCandidato3)/3;
}