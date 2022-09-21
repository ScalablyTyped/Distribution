package typings.yuka

import typings.yuka.aabbMod.AABB
import typings.yuka.halfEdgeMod.HalfEdge
import typings.yuka.polygonMod.Polygon
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyhedronMod {
  
  @JSImport("yuka/src/math/Polyhedron", "Polyhedron")
  @js.native
  /**
    * Constructs a new polyhedron.
    */
  open class Polyhedron () extends StObject {
    
    /**
      * The centroid of this polyhedron.
      */
    var centroid: Vector3 = js.native
    
    /**
      * Computes the centroid of this polyhedron. Assumes its faces have valid centroids.
      */
    def computeCentroid(): this.type = js.native
    
    /**
      * Computes unique edges of this polyhedron. Assumes {@link Polyhedron#faces}
      * is properly set.
      */
    def computeUniqueEdges(): this.type = js.native
    
    /**
      * Computes unique vertices of this polyhedron. Assumes {@link Polyhedron#faces} is properly set.
      */
    def computeUniqueVertices(): this.type = js.native
    
    /**
      * A list of unique edges (no opponent half edges).
      */
    var edges: js.Array[HalfEdge] = js.native
    
    /**
      * The faces of this polyhedron.
      */
    var faces: js.Array[Polygon] = js.native
    
    /**
      * Configures this polyhedron so it does represent the given AABB.
      */
    def fromAABB(aabb: AABB): this.type = js.native
    
    /**
      * A list of unique vertices.
      */
    var vertices: js.Array[Vector3] = js.native
  }
}
