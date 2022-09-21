package typings.yuka

import typings.yuka.aabbMod.AABB
import typings.yuka.meshGeometryMod.MeshGeometry
import typings.yuka.rayMod.Ray
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bvhMod {
  
  @JSImport("yuka/src/math/BVH", "BVH")
  @js.native
  /**
    * Constructs a new BVH.
    *
    * @param [branchingFactor=2] - The branching factor.
    * @param [primitivesPerNode=1] - The minimum amount of primitives per BVH node.
    * @param [depth=10] - The maximum hierarchical depth.
    */
  open class BVH () extends StObject {
    def this(branchingFactor: Double) = this()
    def this(branchingFactor: Double, primitivesPerNode: Double) = this()
    def this(branchingFactor: Unit, primitivesPerNode: Double) = this()
    def this(branchingFactor: Double, primitivesPerNode: Double, depth: Double) = this()
    def this(branchingFactor: Double, primitivesPerNode: Unit, depth: Double) = this()
    def this(branchingFactor: Unit, primitivesPerNode: Double, depth: Double) = this()
    def this(branchingFactor: Unit, primitivesPerNode: Unit, depth: Double) = this()
    
    /**
      * The branching factor (how many nodes per level).
      * @default 2
      */
    var branchingFactor: Double = js.native
    
    /**
      * The maximum hierarchical depth.
      * @default 10
      */
    var depth: Double = js.native
    
    /**
      * Computes a BVH for the given mesh geometry.
      *
      * @param geometry - The mesh geometry.
      */
    def fromMeshGeometry(geometry: MeshGeometry): this.type = js.native
    
    /**
      * The minimum amount of primitives per BVH node.
      * @default 10
      */
    var primitivesPerNode: Double = js.native
    
    /**
      * The root BVH node.
      * @default null
      */
    var root: BVHNode | Null = js.native
    
    /**
      * Executes the given callback for each node of the BVH.
      *
      * @param callback - The callback to execute.
      */
    def traverse(callback: BVHNodeTraverseCallback): this.type = js.native
  }
  
  @JSImport("yuka/src/math/BVH", "BVHNode")
  @js.native
  /**
    * Constructs a BVH node.
    */
  open class BVHNode () extends StObject {
    
    /**
      * The bounding volume of this BVH node.
      */
    var boundingVolume: AABB = js.native
    
    /**
      * Builds this BVH node. That means the respective bounding volume
      * is computed and the node's primitives are distributed under new child nodes.
      * This only happens if the maximum hierarchical depth is not yet reached and
      * the node does contain enough primitives required for a split.
      *
      * @param branchingFactor - The branching factor.
      * @param primitivesPerNode - The minimum amount of primitives per BVH node.
      * @param maxDepth - The maximum  hierarchical depth.
      * @param currentDepth - The current hierarchical depth.
      */
    def build(branchingFactor: Double, primitivesPerNode: Double, maxDepth: Double, currentDepth: Double): this.type = js.native
    
    /**
      * The centroids of the node's triangles.
      * Only filled for leaf nodes.
      */
    var centroids: js.Array[Double] = js.native
    
    /**
      * The child BVH nodes.
      */
    var children: js.Array[BVHNode] = js.native
    
    /**
      * Computes the AABB for this BVH node.
      */
    def computeBoundingVolume(): this.type = js.native
    
    /**
      * Computes the split axis. Right now, only the cardinal axes
      * are potential split axes.
      *
      * @return The split axis.
      */
    def computeSplitAxis(): Vector3 = js.native
    
    /**
      * Returns the depth of this BVH node in its hierarchy.
      *
      * @return The hierarchical depth of this BVH node.
      */
    def getDepth(): Double = js.native
    
    /**
      * Performs a ray/BVH node intersection test and stores the closest intersection point
      * to the given 3D vector. If no intersection is detected, *null* is returned.
      *
      * @param ray - The ray.
      * @param result - The result vector.
      * @return The result vector.
      */
    def intersectRay(ray: Ray, result: Vector3): Vector3 = js.native
    
    /**
      * Performs a ray/BVH node intersection test. Returns either true or false if
      * there is a intersection or not.
      *
      * @param ray - The ray.
      * @return Whether there is an intersection or not.
      */
    def intersectsRay(ray: Ray): Boolean = js.native
    
    /**
      * Returns true if this BVH node is a leaf node.
      *
      * @return Whether this BVH node is a leaf node or not.
      */
    def leaf(): Boolean = js.native
    
    /**
      * The parent BVH node.
      * @default null
      */
    var parent: BVHNode | Null = js.native
    
    /**
      * The primitives (triangles) of this BVH node.
      * Only filled for leaf nodes.
      */
    var primitives: js.Array[Double] = js.native
    
    /**
      * Returns true if this BVH node is a root node.
      *
      * @return Whether this BVH node is a root node or not.
      */
    def root(): Boolean = js.native
    
    /**
      * Splits the node and distributes node's primitives over new child nodes.
      *
      * @param branchingFactor - The branching factor.
      */
    def split(branchingFactor: Double): this.type = js.native
    
    /**
      * Executes the given callback for this BVH node and its ancestors.
      *
      * @param callback - The callback to execute.
      */
    def traverse(callback: BVHNodeTraverseCallback): this.type = js.native
  }
  
  type BVHNodeTraverseCallback = js.Function1[/* node */ BVHNode, Unit]
}
