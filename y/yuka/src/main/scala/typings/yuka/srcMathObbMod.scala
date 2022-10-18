package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcMathAabbMod.AABB
import typings.yuka.srcMathBoundingSphereMod.BoundingSphere
import typings.yuka.srcMathMatrix3Mod.Matrix3
import typings.yuka.srcMathPlaneMod.Plane
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathObbMod {
  
  @JSImport("yuka/src/math/OBB", "OBB")
  @js.native
  /**
    * Constructs a new OBB with the given values.
    *
    * @param [center=Vector3(0,0,0)] - The center of this OBB.
    * @param [halfSizes=Vector3(0,0,0)] - The half sizes of the OBB (defines its width, height and depth).
    * @param [rotation=Matrix()] - The rotation of this OBB.
    */
  open class OBB () extends StObject {
    def this(center: Vector3) = this()
    def this(center: Unit, halfSizes: Vector3) = this()
    def this(center: Vector3, halfSizes: Vector3) = this()
    def this(center: Unit, halfSizes: Unit, rotation: Matrix3) = this()
    def this(center: Unit, halfSizes: Vector3, rotation: Matrix3) = this()
    def this(center: Vector3, halfSizes: Unit, rotation: Matrix3) = this()
    def this(center: Vector3, halfSizes: Vector3, rotation: Matrix3) = this()
    
    var center: Vector3 = js.native
    
    /**
      * Ensures the given point is inside this OBB and stores
      * the result in the given vector.
      *
      * Reference: Closest Point on OBB to Point in Real-Time Collision Detection
      * by Christer Ericson (chapter 5.1.4)
      *
      * @param point - A point in 3D space.
      * @param result - The result vector.
      * @return The result vector.
      */
    def clampPoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given point is inside this OBB.
      *
      * @param point - A point in 3D space.
      * @return Whether the given point is inside this OBB or not.
      */
    def containsPoint(point: Vector3): Boolean = js.native
    
    /**
      * Copies all values from the given OBB to this OBB.
      *
      * @param obb - The OBB to copy.
      */
    def copy(obb: OBB): this.type = js.native
    
    /**
      * Returns true if the given OBB is deep equal with this OBB.
      *
      * @param obb - The OBB to test.
      * @return The result of the equality test.
      */
    def equals(obb: OBB): Boolean = js.native
    
    /**
      * Computes the OBB from an AABB.
      *
      * @param aabb - The AABB.
      */
    def fromAABB(aabb: AABB): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      * @return A reference to this OBB.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Computes the minimum enclosing OBB for the given set of points. The method is an
      * implementation of {@link http://gamma.cs.unc.edu/users/gottschalk/main.pdf Collision Queries using Oriented Bounding Boxes}
      * by Stefan Gottschalk.
      * According to the dissertation, the quality of the fitting process varies from
      * the respective input. This method uses the best approach by computing the
      * covariance matrix based on the triangles of the convex hull (chapter 3.4.3).
      *
      * However, the implementation is susceptible to {@link https://en.wikipedia.org/wiki/Regular_polygon regular polygons}
      * like cubes or spheres. For such shapes, it's recommended to verify the quality
      * of the produced OBB. Consider to use an AABB or bounding sphere if the result
      * is not satisfying.
      *
      * @param points - An array of 3D vectors representing points in 3D space.
      */
    def fromPoints(points: js.Array[Vector3]): this.type = js.native
    
    /**
      * Computes the size (width, height, depth) of this OBB and stores it into the given vector.
      *
      * @param result - The result vector.
      * @return The result vector.
      */
    def getSize(result: Vector3): Vector3 = js.native
    
    var halfSizes: Vector3 = js.native
    
    /**
      * Returns true if the given AABB intersects this OBB.
      *
      * @param aabb - The AABB to test.
      * @return The result of the intersection test.
      */
    def intersectsAABB(aabb: AABB): Boolean = js.native
    
    /**
      * Returns true if the given bounding sphere intersects this OBB.
      *
      * @param sphere - The bounding sphere to test.
      * @return The result of the intersection test.
      */
    def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
    
    /**
      * Returns true if the given OBB intersects this OBB.
      *
      * Reference: OBB-OBB Intersection in Real-Time Collision Detection
      * by Christer Ericson (chapter 4.4.1)
      *
      * @param obb - The OBB to test.
      * @param [epsilon=Number.EPSILON] - The epsilon (tolerance) value.
      * @return The result of the intersection test.
      */
    def intersectsOBB(obb: OBB): Boolean = js.native
    def intersectsOBB(obb: OBB, epsilon: Double): Boolean = js.native
    
    /**
      * Returns true if the given plane intersects this OBB.
      *
      * Reference: Testing Box Against Plane in Real-Time Collision Detection
      * by Christer Ericson (chapter 5.2.3)
      *
      * @param plane - The plane to test.
      * @return The result of the intersection test.
      */
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    var rotation: Matrix3 = js.native
    
    /**
      * Sets the given values to this OBB.
      *
      * @param center - The center of this OBB
      * @param halfSizes - The half sizes of the OBB (defines its width, height and depth).
      * @param rotation - The rotation of this OBB.
      */
    def set(center: Vector3, halfSizes: Vector3, rotation: Matrix3): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
