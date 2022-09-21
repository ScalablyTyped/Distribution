package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.matrix4Mod.Matrix4
import typings.yuka.planeMod.Plane
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundingSphereMod {
  
  @JSImport("yuka/src/math/BoundingSphere", "BoundingSphere")
  @js.native
  /**
    * Constructs a new bounding sphere with the given values.
    *
    * @param [center=Vector(0,0,0)] - The center position of the bounding sphere.
    * @param [radius=0] - The radius of the bounding sphere.
    */
  open class BoundingSphere () extends StObject {
    def this(center: Vector3) = this()
    def this(center: Unit, radius: Double) = this()
    def this(center: Vector3, radius: Double) = this()
    
    /**
      * Transforms this bounding sphere with the given 4x4 transformation matrix.
      *
      * @param matrix - The 4x4 transformation matrix.
      */
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    /**
      * The center position of the bounding sphere.
      * @default Vector(0,0,0)
      */
    var center: Vector3 = js.native
    
    /**
      * Ensures the given point is inside this bounding sphere and stores
      * the result in the given vector.
      *
      * @param point - A point in 3D space.
      * @param result - The result vector.
      * @return The result vector.
      */
    def clampPoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given point is inside this bounding sphere.
      *
      * @param point - A point in 3D space.
      * @return The result of the containments test.
      */
    def containsPoint(point: Vector3): Boolean = js.native
    
    /**
      * Copies all values from the given bounding sphere to this bounding sphere.
      *
      * @param sphere - The bounding sphere to copy.
      */
    def copy(sphere: BoundingSphere): this.type = js.native
    
    /**
      * Returns true if the given bounding sphere is deep equal with this bounding sphere.
      *
      * @param sphere - The bounding sphere to test.
      * @return The result of the equality test.
      */
    def equals(sphere: BoundingSphere): Boolean = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Computes a bounding sphere that encloses the given set of points.
      *
      * @param points - An array of 3D vectors representing points in 3D space.
      */
    def fromPoints(points: js.Array[Vector3]): this.type = js.native
    
    /**
      * Returns the normal for a given point on this bounding sphere's surface.
      *
      * @param point - The point on the surface
      * @param result - The result vector.
      * @return The result vector.
      */
    def getNormalFromSurfacePoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given bounding sphere intersects this bounding sphere.
      *
      * @param sphere - The bounding sphere to test.
      * @return The result of the intersection test.
      */
    def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
    
    /**
      * Returns true if the given plane intersects this bounding sphere.
      *
      * Reference: Testing Sphere Against Plane in Real-Time Collision Detection
      * by Christer Ericson (chapter 5.2.2)
      *
      * @param plane - The plane to test.
      * @return The result of the intersection test.
      */
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    /**
      * The radius of the bounding sphere.
      * @default 0
      */
    var radius: Double = js.native
    
    /**
      * Sets the given values to this bounding sphere.
      *
      * @param center - The center position of the bounding sphere.
      * @param radius - The radius of the bounding sphere.
      */
    def set(center: Vector3, radius: Double): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
