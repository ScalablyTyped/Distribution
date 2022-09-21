package typings.yuka

import typings.yuka.cellSpacePartitioningMod.CellSpacePartitioning
import typings.yuka.edgeMod.Edge
import typings.yuka.graphMod.Graph
import typings.yuka.nodeMod.Node
import typings.yuka.polygonMod.Polygon
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMeshMod {
  
  @JSImport("yuka/src/navigation/navmesh/NavMesh", "NavMesh")
  @js.native
  open class NavMesh () extends StObject {
    
    /**
      * This method can be used to restrict the movement of a game entity on the navigation mesh.
      * Instead of preventing any form of translation when a game entity hits a border edge, the
      * movement is clamped along the contour of the navigation mesh. The computational overhead
      * of this method for complex navigation meshes can be reduced by using a spatial index.
      *
      * @param currentRegion - The current convex region of the game entity.
      * @param startPosition - The original start position of the entity for the current simulation step.
      * @param endPosition - The original end position of the entity for the current simulation step.
      * @param clampPosition - The clamped position of the entity for the current simulation step.
      * @return The new convex region the game entity is in.
      */
    def clampMovement(currentRegion: Polygon, startPosition: Vector3, endPosition: Vector3, clampPosition: Vector3): Polygon = js.native
    
    /**
      * Clears the internal state of this navigation mesh.
      */
    def clear(): this.type = js.native
    
    /**
      * The tolerance value for the containment test.
      * @default 1
      */
    var epsilonContainsTest: Double = js.native
    
    /**
      * The tolerance value for the coplanar test.
      * @default 1e-3
      */
    var epsilonCoplanarTest: Double = js.native
    
    /**
      * Returns the shortest path that leads from the given start position to the end position.
      * The computational overhead of this method for complex navigation meshes can greatly
      * reduced by using a spatial index.
      *
      * @param from - The start/source position.
      * @param to - The end/destination position.
      * @return The shortest path as an array of points.
      */
    def findPath(from: Vector3, to: Vector3): js.Array[Vector3] = js.native
    
    /**
      * Creates the navigation mesh from an array of convex polygons.
      *
      * @param polygons - An array of convex polygons.
      */
    def fromPolygons(polygons: js.Array[Polygon]): this.type = js.native
    
    /**
      * Returns the closest convex region for the given point in 3D space.
      *
      * @param point - A point in 3D space.
      * @return The closest convex region.
      */
    def getClosestRegion(point: Vector3): Polygon = js.native
    
    /**
      * Returns the node index for the given region. The index represents
      * the navigation node of a region in the navigation graph.
      *
      * @param region - The convex region.
      * @return The respective node index.
      */
    def getNodeIndex(region: Polygon): Double = js.native
    
    /**
      * Returns at random a convex region from the navigation mesh.
      *
      * @return The convex region.
      */
    def getRandomRegion(): Polygon = js.native
    
    /**
      * Returns the region that contains the given point. The computational overhead
      * of this method for complex navigation meshes can be reduced by using a spatial index.
      * If no convex region contains the point, *null* is returned.
      *
      * @param point - A point in 3D space.
      * @param [epsilon=1e-3] - Tolerance value for the containment test.
      * @return The convex region that contains the point.
      */
    def getRegionForPoint(point: Vector3): Polygon = js.native
    def getRegionForPoint(point: Vector3, epsilon: Double): Polygon = js.native
    
    /**
      * The internal navigation graph of this navigation mesh representing neighboring polygons.
      */
    var graph: Graph[Node, Edge] = js.native
    
    /**
      * Whether convex regions should be merged or not.
      * @default true
      */
    var mergeConvexRegions: Boolean = js.native
    
    /**
      * The list of convex regions.
      */
    var regions: js.Array[Polygon] = js.native
    
    /**
      * A reference to a spatial index.
      * @default null
      */
    var spatialIndex: CellSpacePartitioning | Null = js.native
    
    /**
      * Updates the spatial index by assigning all convex regions to the
      * partitions of the spatial index.
      */
    def updateSpatialIndex(): this.type = js.native
  }
}
