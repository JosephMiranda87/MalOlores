/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParallelInheritanceHierarchies.Before;

/**
 *
 * @author USUARIO
 */
abstract class FiguraAntes { }
class Circulo extends FiguraAntes { }
class Cuadrado extends FiguraAntes { }

abstract class FiguraRenderer { }
class CirculoRenderer extends FiguraRenderer { }
class CuadradoRenderer extends FiguraRenderer { }

/*
Cada vez que se crea una subclase en una jerarquía, 
también debes crear una subclase correspondiente en otra jerarquía. Es señal de que ambas jerarquías deberían estar acopladas de forma diferente.
 */