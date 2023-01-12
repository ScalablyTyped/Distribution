package typings.yuka

import typings.yuka.srcMathAabbMod.AABB
import typings.yuka.srcMathBoundingSphereMod.BoundingSphere
import typings.yuka.srcMathBvhMod.BVH
import typings.yuka.srcMathConvexHullMod.ConvexHull
import typings.yuka.srcMathMatrix4Mod.Matrix4
import typings.yuka.srcMathObbMod.OBB
import typings.yuka.srcMathPlaneMod.Plane
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathRayMod {
  
  @JSImport("yuka/src/math/Ray", "Ray")
  @js.native
  /**
    * Constructs a new ray with the given values.
    *
    * @param [origin=Vector3(0,0,0)] - The origin of the ray.
    * @param [direction=Vector3(0,0,0)] - The direction of the ray.
    */
  open class Ray () extends StObject {
    def this(origin: Vector3) = this()
    def this(origin: Unit, direction: Vector3) = this()
    def this(origin: Vector3, direction: Vector3) = this()
    
    /**
      * Transforms this ray by the given 4x4 matrix.
      *
      * @param m - The 4x4 matrix.
      * @return A reference to this ray.
      */
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    /**
      * Computes a position on the ray according to the given t value
      * and stores the result in the given 3D vector. The t value has a range of
      * [0, Infinity] where 0 means the position is equal with the origin of the ray.
      *
      * @param t - A scalar value representing a position on the ray.
      * @param result - The result vector.
      * @return The result vector.
      */
    def at(t: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Copies all values from the given ray to this ray.
      *
      * @param ray - The ray to copy.
      */
    def copy(ray: Ray): this.type = js.native
    
    /**
      * The direction of the ray.
      */
    var direction: Vector3 = js.native
    
    /**
      * Returns true if the given ray is deep equal with this ray.
      *
      * @param ray - The ray to test.
      * @return The result of the equality test.
      */
    def equals(ray: Ray): Boolean = js.native
    
    /**
      * Performs a ray/AABB intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param aabb - An AABB.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectAABB(aabb: AABB, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/BVH intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param bvh - A BVH.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectBVH(bvh: BVH, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/sphere intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param sphere - A bounding sphere.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectBoundingSphere(sphere: BoundingSphere, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/convex hull intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      * The implementation is based on "Fast Ray-Convex Polyhedron Intersection"
      * by Eric Haines, GRAPHICS GEMS II
      *
      * @param convexHull - A convex hull.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectConvexHull(convexHull: ConvexHull, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/OBB intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param obb - An orientend bounding box.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectOBB(obb: OBB, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/plane intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param plane - A plane.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectPlane(plane: Plane, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/triangle intersection test and stores the intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param triangle - A triangle.
      * @param backfaceCulling - Whether back face culling is active or not.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectTriangle(triangle: Triangle, backfaceCulling: Boolean, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/AABB intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param aabb - An axis-aligned bounding box.
      * @return Whether there is an intersection or not.
      */
    def intersectsAABB(aabb: AABB): Boolean = js.native
    
    /**
      * Performs a ray/BVH intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param bvh - A BVH.
      * @return Whether there is an intersection or not.
      */
    def intersectsBVH(bvh: BVH): Boolean = js.native
    
    /**
      * Performs a ray/sphere intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param sphere - A bounding sphere.
      * @return Whether there is an intersection or not.
      */
    def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
    
    /**
      * Performs a ray/convex hull intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param convexHull - A convex hull.
      * @return Whether there is an intersection or not.
      */
    def intersectsConvexHull(convexHull: ConvexHull): Boolean = js.native
    
    /**
      * Performs a ray/OBB intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param obb - An orientend bounding box.
      * @return Whether there is an intersection or not.
      */
    def intersectsOBB(obb: OBB): Boolean = js.native
    
    /**
      * Performs a ray/plane intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param plane - A plane.
      * @return Whether there is an intersection or not.
      */
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    /**
      * The origin of the ray.
      */
    var origin: Vector3 = js.native
    
    /**
      * Sets the given values to this ray.
      *
      * @param origin - The origin of the ray.
      * @param direction - The direction of the ray.
      */
    def set(origin: Vector3, direction: Vector3): this.type = js.native
  }
  
  trait Triangle extends StObject {
    
    /**
      * The first vertex position.
      */
    var a: Vector3
    
    /**
      * The second vertex position.
      */
    var b: Vector3
    
    /**
      * The third vertex position.
      */
    var c: Vector3
  }
  object Triangle {
    
    inline def apply(a: Vector3, b: Vector3, c: Vector3): Triangle = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Triangle] (val x: Self) extends AnyVal {
      
      inline def setA(value: Vector3): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Vector3): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Vector3): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    }
  }
}
