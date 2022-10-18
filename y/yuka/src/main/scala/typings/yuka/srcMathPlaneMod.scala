package typings.yuka

import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathPlaneMod {
  
  @JSImport("yuka/src/math/Plane", "Plane")
  @js.native
  /**
    * Constructs a new plane with the given values.
    *
    * @param [normal=Vector3( 0, 0, 1 )] - The normal vector of the plane.
    * @param [constant=0] - The distance of the plane from the origin.
    */
  open class Plane () extends StObject {
    def this(normal: Vector3) = this()
    def this(normal: Unit, constant: Double) = this()
    def this(normal: Vector3, constant: Double) = this()
    
    /**
      * The distance of the plane from the origin.
      */
    var constant: Double = js.native
    
    /**
      * Copies all values from the given plane to this plane.
      *
      * @param plane - The plane to copy.
      */
    def copy(plane: Plane): this.type = js.native
    
    /**
      * Computes the signed distance from the given 3D vector to this plane.
      * The sign of the distance indicates the half-space in which the points lies.
      * Zero means the point lies on the plane.
      *
      * @param point - A point in 3D space.
      * @return The signed distance.
      */
    def distanceToPoint(point: Vector3): Double = js.native
    
    /**
      * Returns true if the given plane is deep equal with this plane.
      *
      * @param plane - The plane to test.
      * @return The result of the equality test.
      */
    def equals(plane: Plane): Boolean = js.native
    
    /**
      * Sets the values of the plane from three given coplanar points.
      *
      * @param a - A coplanar point.
      * @param b - A coplanar point.
      * @param c - A coplanar point.
      */
    def fromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): this.type = js.native
    
    /**
      * Sets the values of the plane from the given normal vector and a coplanar point.
      *
      * @param normal - A normalized vector.
      * @param point - A coplanar point.
      */
    def fromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): this.type = js.native
    
    /**
      * Performs a plane/plane intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * Reference: Intersection of Two Planes in Real-Time Collision Detection by Christer Ericson (chapter 5.4.4)
      *
      * @param plane - The plane to test.
      * @param result - The result vector.
      */
    def intersectPlane(plane: Plane, result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given plane intersects this plane.
      *
      * @param plane - The plane to test.
      * @return The result of the intersection test.
      */
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    /**
      * The normal vector of the plane.
      */
    var normal: Vector3 = js.native
    
    /**
      * Projects the given point onto the plane. The result is written
      * to the given vector.
      *
      * @param point - The point to project onto the plane.
      * @param result - The projected point.
      * @return The projected point.
      */
    def projectPoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Sets the given values to this plane.
      *
      * @param normal - The normal vector of the plane.
      * @param constant - The distance of the plane from the origin.
      */
    def set(normal: Vector3, constant: Double): this.type = js.native
  }
}
