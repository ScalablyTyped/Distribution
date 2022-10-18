package typings.yuka

import typings.yuka.srcMathHalfEdgeMod.HalfEdge
import typings.yuka.srcMathPlaneMod.Plane
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathPolygonMod {
  
  @JSImport("yuka/src/math/Polygon", "Polygon")
  @js.native
  /**
    * Constructs a new polygon.
    */
  open class Polygon () extends StObject {
    
    /**
      * The centroid of this polygon.
      */
    val centroid: Vector3 = js.native
    
    /**
      * Computes the centroid for this polygon.
      */
    def computeCentroid(): this.type = js.native
    
    /**
      * Returns true if the polygon contains the given point.
      *
      * @param point - The point to test.
      * @param epsilon - A tolerance value.
      * @return Whether this polygon contain the given point or not.
      */
    def contains(point: Vector3): Boolean = js.native
    def contains(point: Vector3, epsilon: Double): Boolean = js.native
    
    /**
      * Returns true if the polygon is convex.
      *
      * @param ccw - Whether the winding order is CCW or not.
      * @return Whether this polygon is convex or not.
      */
    def convex(): Boolean = js.native
    def convex(ccw: Boolean): Boolean = js.native
    
    /**
      * Returns true if the polygon is coplanar.
      *
      * @param [epsilon=1e-3] - A tolerance value.
      * @return Whether this polygon is coplanar or not.
      */
    def coplanar(): Boolean = js.native
    def coplanar(epsilon: Double): Boolean = js.native
    
    /**
      * Computes the signed distance from the given 3D vector to this polygon. The method
      * uses the polygon's plane abstraction in order to compute this value.
      *
      * @param point - A point in 3D space.
      * @return The signed distance from the given point to this polygon.
      */
    def distanceToPoint(point: Vector3): Double = js.native
    
    /**
      * A reference to the first half-edge of this polygon.
      */
    val edge: HalfEdge | Null = js.native
    
    /**
      * Creates the polygon based on the given array of points in 3D space.
      * The method assumes the contour (the sequence of points) is defined
      * in CCW order.
      *
      * @param points - The array of points.
      */
    def fromContour(points: js.Array[Vector3]): this.type = js.native
    
    /**
      * Determines the contour (sequence of points) of this polygon and
      * stores the result in the given array.
      *
      * @param result - The result array.
      * @return The result array.
      */
    def getContour(result: js.Array[Vector3]): js.Array[Vector3] = js.native
    
    /**
      * A plane abstraction of this polygon.
      */
    val plane: Plane = js.native
  }
}
