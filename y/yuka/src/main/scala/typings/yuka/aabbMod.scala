package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.boundingSphereMod.BoundingSphere
import typings.yuka.matrix4Mod.Matrix4
import typings.yuka.planeMod.Plane
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aabbMod {
  
  @JSImport("yuka/src/math/AABB", "AABB")
  @js.native
  /**
    * Constructs a new AABB with the given values.
    *
    * @param [min=Vector(0,0,0)] - The minimum bounds of the AABB.
    * @param [max=Vector(0,0,0)] - The maximum bounds of the AABB.
    */
  open class AABB () extends StObject {
    def this(min: Vector3) = this()
    def this(min: Unit, max: Vector3) = this()
    def this(min: Vector3, max: Vector3) = this()
    
    /**
      * Transforms this AABB with the given 4x4 transformation matrix.
      *
      * @param matrix - The 4x4 transformation matrix.
      */
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    /**
      * Ensures the given point is inside this AABB and stores
      * the result in the given vector.
      *
      * @param point - A point in 3D space.
      * @param result - The result vector.
      * @return The result vector.
      */
    def clampPoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given point is inside this AABB.
      *
      * @param point - A point in 3D space.
      * @return The result of the containment test.
      */
    def containsPoint(point: Vector3): Boolean = js.native
    
    /**
      * Copies all values from the given AABB to this AABB.
      *
      * @param aabb - The AABB to copy.
      */
    def copy(aabb: AABB): this.type = js.native
    
    /**
      * Returns true if the given AABB is deep equal with this AABB.
      *
      * @param aabb - The AABB to test.
      * @return The result of the equality test.
      */
    def equals(aabb: AABB): Boolean = js.native
    
    /**
      * Expands this AABB by the given point. So after this method call,
      * the given point lies inside the AABB.
      *
      * @param point - A point in 3D space.
      */
    def expand(point: Vector3): this.type = js.native
    
    /**
      * Sets the values of the AABB from the given center and size vector.
      *
      * @param center - The center point of the AABB.
      * @param size - The size of the AABB per axis.
      */
    def fromCenterAndSize(center: Vector3, size: Vector3): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Computes an AABB that encloses the given set of points.
      *
      * @param points - An array of 3D vectors representing points in 3D space.
      */
    def fromPoints(points: js.Array[Vector3]): this.type = js.native
    
    /**
      * Computes the center point of this AABB and stores it into the given vector.
      *
      * @param result - The result vector.
      * @return The result vector.
      */
    def getCenter(result: Vector3): Vector3 = js.native
    
    /**
      * Returns the normal for a given point on this AABB's surface.
      *
      * @param point - The point on the surface
      * @param result - The result vector.
      * @return The result vector.
      */
    def getNormalFromSurfacePoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Computes the size (width, height, depth) of this AABB and stores it into the given vector.
      *
      * @param result - The result vector.
      * @return The result vector.
      */
    def getSize(result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given AABB intersects this AABB.
      *
      * @param aabb - The AABB to test.
      * @return The result of the intersection test.
      */
    def intersectsAABB(aabb: AABB): Boolean = js.native
    
    /**
      * Returns true if the given bounding sphere intersects this AABB.
      *
      * @param sphere - The bounding sphere to test.
      * @return The result of the intersection test.
      */
    def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
    
    /**
      * Returns true if the given plane intersects this AABB.
      *
      * Reference: Testing Box Against Plane in Real-Time Collision Detection
      * by Christer Ericson (chapter 5.2.3)
      *
      * @param plane - The plane to test.
      * @return The result of the intersection test.
      */
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    /**
      * The maximum bounds of the AABB.
      */
    var max: Vector3 = js.native
    
    /**
      * The minimum bounds of the AABB.
      */
    var min: Vector3 = js.native
    
    /**
      * Sets the given values to this AABB.
      *
      * @param min - The minimum bounds of the AABB.
      * @param max - The maximum bounds of the AABB.
      */
    def set(min: Vector3, max: Vector3): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
