package typings.yuka

import typings.yuka.srcMathPolygonMod.Polygon
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathHalfEdgeMod {
  
  @JSImport("yuka/src/math/HalfEdge", "HalfEdge")
  @js.native
  /**
    * Constructs a new half-edge.
    *
    * @param [vertex=Vector3(0,0,0)] - The vertex of this half-edge. It represents the head/destination of the respective full edge.
    */
  open class HalfEdge () extends StObject {
    def this(vertex: Vector3) = this()
    
    /**
      * Computes the direction of this half edge. The method assumes the half edge
      * has a valid reference to a previous half edge.
      *
      * @param result - The result vector.
      * @return The result vector.
      */
    def getDirection(result: Vector3): Vector3 = js.native
    
    /**
      * Returns the head of this half-edge.
      * That's a reference to the own vertex.
      *
      * @return The head vertex.
      */
    def head(): Vector3 = js.native
    
    /**
      * Computes the length of this half-edge.
      *
      * @return The length of this half-edge.
      */
    def length(): Double = js.native
    
    /**
      * Links the given opponent half edge with this one.
      *
      * @param edge - The opponent edge to link.
      */
    def linkOpponent(edge: HalfEdge): HalfEdge = js.native
    
    /**
      * A reference to the next half-edge.
      */
    var next: HalfEdge | Null = js.native
    
    /**
      * A reference to its polygon/face.
      */
    var polygon: Polygon | Null = js.native
    
    /**
      * A reference to the previous half-edge.
      */
    var prev: HalfEdge | Null = js.native
    
    /**
      * Computes the squared length of this half-edge.
      *
      * @return The squared length of this half-edge.
      */
    def squaredLength(): Double = js.native
    
    /**
      * Returns the tail of this half-edge.
      * That's a reference to the previous half-edge vertex.
      *
      * @return The tail vertex.
      */
    def tail(): Vector3 | Null = js.native
    
    /**
      * A reference to the opponent half-edge.
      */
    var twin: HalfEdge | Null = js.native
    
    /**
      * The vertex of this half-edge. It represents the head/destination of the respective full edge.
      */
    var vertex: Vector3 = js.native
  }
}
