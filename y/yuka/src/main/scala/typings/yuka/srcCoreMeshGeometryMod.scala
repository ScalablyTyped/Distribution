package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcMathAabbMod.AABB
import typings.yuka.srcMathBoundingSphereMod.BoundingSphere
import typings.yuka.srcMathMatrix4Mod.Matrix4
import typings.yuka.srcMathRayMod.Ray
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreMeshGeometryMod {
  
  @JSImport("yuka/src/core/MeshGeometry", "MeshGeometry")
  @js.native
  /**
    * Constructs a new mesh geometry.
    *
    * @param [vertices=Float32Array(0)] - The vertex buffer (Float32Array).
    * @param [indices=null] - The index buffer (Uint16Array/Uint32Array).
    */
  open class MeshGeometry () extends StObject {
    def this(vertices: js.typedarray.Float32Array) = this()
    def this(vertices: js.typedarray.Float32Array, indices: js.typedarray.Uint16Array) = this()
    def this(vertices: js.typedarray.Float32Array, indices: js.typedarray.Uint32Array) = this()
    def this(vertices: Unit, indices: js.typedarray.Uint16Array) = this()
    def this(vertices: Unit, indices: js.typedarray.Uint32Array) = this()
    
    /**
      * An AABB enclosing the geometry.
      */
    var aabb: AABB = js.native
    
    /**
      *  Whether back face culling is active or not. Only relevant for raycasting.
      * @default true
      */
    var backfaceCulling: Boolean = js.native
    
    /**
      * A bounding sphere enclosing the geometry.
      */
    var boundingSphere: BoundingSphere = js.native
    
    /**
      * Computes the internal bounding volumes of this mesh geometry.
      */
    def computeBoundingVolume(): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * The index buffer.
      */
    var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array | Null = js.native
    
    /**
      * Performs a ray intersection test with the geometry of the obstacle and stores
      * the intersection point in the given result vector. If no intersection is detected,
      * *null* is returned.
      *
      * @param ray - The ray to test.
      * @param worldMatrix - The matrix that transforms the geometry to world space.
      * @param closest - Whether the closest intersection point should be computed or not.
      * @param intersectionPoint - The intersection point.
      * @param [normal=null] - The normal vector of the respective triangle.
      * @return The result vector.
      */
    def intersectRay(ray: Ray, worldMatrix: Matrix4, closest: Boolean, intersectionPoint: Vector3): Vector3 = js.native
    def intersectRay(ray: Ray, worldMatrix: Matrix4, closest: Boolean, intersectionPoint: Vector3, normal: Vector3): Vector3 = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Returns a new geometry without containing indices. If the geometry is already
      * non-indexed, the method performs no changes.
      *
      * @return The new non-indexed geometry.
      */
    def toTriangleSoup(): this.type = js.native
    
    /**
      * The vertex buffer.
      */
    var vertices: js.typedarray.Float32Array = js.native
  }
}
