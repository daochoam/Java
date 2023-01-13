/**
*Escriba un método que devuelva el número de pixeles en la imagen cuyo 
color es el dado como parámetro. Ayuda: No olvide que los objetos deben 
compararse con el método equals.

* Retorna el número de pixeles que tienen el color dado como parámetro
* @param colorBuscado - Color de los pixeles a contar
* @return - Número de pixeles en la imagen con el color dado
*/
public int cuantosPixelColor(Color colorBuscado)
{
    int contador=0;
    for( int i = 0; i < alto; i++ )
       {
         for(int j = 0; j < ancho;j++)
         {
           if(bitmap[i][j].equals(colorBuscado))
           {
             contador++;
           }
         } 
       }
       return contador;
}


/**
* Escriba un método que indique cuál es la tendencia de color de la imagen. Un píxel tiene un color de tendencia roja, si su índice es 
mayor que los otros dos. Lo mismo sucede con los demás colores. Este método retorna 0 si la imagen no tiene ninguna tendencia, 1 si la 
tendencia es roja, 2 si la tendencia es verde y 3 si la tendencia es azul.

* Retorna la tendencia de color de la imagen. Un pixel tiene un color de tendencia roja si su índice es mayor que los otros dos; lo mismo 
sucede para los otros componentes. La tendencia de color de la imagen está definida entonces como el componente que tenga más pixeles 
con tendencia a ese color.

* return - Tendencia de color de la imagen. Los posibles valores son:
* 0 si la imagen no presenta ninguna tendencia
* 1 si la tendencia es roja
* 2 si la tendencia es verde
* 3 si la tendencia es azul
*/
public int calcularTendencia()
{
    int red = 0;
    int green = 0;
    int blue = 0;
    int ninguna = 0;
    for(int i = 0; i < alto; i++)
    {
        for(int j = 0; j < ancho; j++)
        {
            Color color = bitmap[i][j];

            if(color.getRed()>color.getGreen() && color.getRed()>color.getBlue())
            {
                red++;
            }
            else if(color.getGreen()>color.getRed() && color.getGreen()>color.getBlue())
            {
                green++;
            }
            else if( color.getBlue()>color.getRed() && color.getBlue()>color.getGreen())
            {
                blue++;
            }
            else
            {
                ninguna++;
            }
        }
    }    
    if( red > green && red > blue )
    {
        red = 1;
        return red;
    }
    else if((green > red)&&(green > blue))
    {
        green = 2;
        return green;
    }
    else if((blue > red)&&(blue > green))
    {
        blue = 3;
        return blue;
    }
    else
    {
        return 0;
    }
}

/**
* Implemente un método que verifique si la imagen es oscura. Una imagen es oscura si más 
del 60% de sus pixeles tienen todos sus componentes RGB menores a 10.

* Método que verifica si la imagen es oscura. 
* Una imagen es oscura si más del 60% de sus pixeles tienen componentes RGB menores a 10.
*/
public boolean esOscuraLaImagen()
{
    int contador=0;
    for(int i = 0; i < alto; i++)
    {
        for(int j = 0; j < ancho; j++)
        {
            Color color = bitmap[i][j];
            if (color.getRed()<10 && color.getGreen()<10 && color.getBlue()<10){
                contador++;
            }
        }
        
    }
    
    double brightness = (contador/(alto*ancho))*100;
    if(brightness>60){ return true; }
    else { return false; }
}

/**
* Escriba un método que sea capaz de rotar una imagen 90 grados a la derecha.
* Rota la imagen 90 grados hacia la derecha
*/
public void rotar90ALaDerecha()
{
    int cols = bitmap[0].length;   // cols
    int rows = bitmap.length;     // rows
    
    Color NewImage[][]= new Color[cols][rows];
    int z=rows-1;
    for(int i = 0; i < rows; i++,z--) { //row
        for(int j = 0; j < cols; j++) { //col
            NewImage[j][z] = bitmap[i][j];
        }
    }
    
    alto=cols;
    ancho=rows;
    bitmap = NewImage;
}