//Clase Prenda
public class Prenda{

TipoPrenda tipoPrenda;
String materialPrenda;
Color colorPrincipal;
Color colorSecundario;

//constructor
Prenda(TipoPrenda tipoPrenda, String materialPrenda, Color colorPrincipal, Color colorSecundario ){

    this.tipoPrenda = tipoPrenda;
    this.materialPrenda = materialPrenda;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;  
    }

}

//Clase TipoPrenda
public class TipoPrenda{
    Categoria categoria;
    
    //constructor
    Categoria(Categoria categoria){
        this.categoria = categoria;
    }

}

//Enum Categoria
public enum Cateogria{
    PARTESUPERIOR, 
    PARTEINFERIOR, 
    CALZADO, 
    ACCESORIO
}

//Enum Color -> no se si se usa enum ya que no conozco todos los colores que una prenda puede tener... puede que se use clase para esto?
public enum Color{
    BLANCO,
    NEGRO,
    VERDE,
    ROJO,
    AZUL
}