package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcMathPolygonMod.Polygon
import typings.yuka.srcMathVector3Mod.Vector3
import typings.yuka.srcPartitioningCellMod.Cell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPartitioningCellSpacePartitioningMod {
  
  @JSImport("yuka/src/partitioning/CellSpacePartitioning", "CellSpacePartitioning")
  @js.native
  open class CellSpacePartitioning protected () extends StObject {
    /**
      * Constructs a new spatial index with the given values.
      *
      * @param width - The width of the entire spatial index.
      * @param height - The height of the entire spatial index.
      * @param depth - The depth of the entire spatial index.
      * @param cellsX - The amount of cells along the x-axis.
      * @param cellsY - The amount of cells along the y-axis.
      * @param cellsZ - The amount of cells along the z-axis.
      */
    def this(width: Double, height: Double, depth: Double, cellsX: Double, cellsY: Double, cellsZ: Double) = this()
    
    /**
      * Adds an entity to a specific partition.
      *
      * @param entity - The entity to add.
      * @param index - The partition index.
      */
    def addEntityToPartition(entity: GameEntity, index: Double): this.type = js.native
    
    /**
      * Adds a polygon to the spatial index. A polygon is approximated with an AABB.
      *
      * @param polygon - The polygon to add.
      */
    def addPolygon(polygon: Polygon): this.type = js.native
    
    /**
      * The list of partitions.
      */
    var cells: js.Array[Cell] = js.native
    
    /**
      * The amount of cells along the x-axis.
      */
    var cellsX: Double = js.native
    
    /**
      * The amount of cells along the y-axis.
      */
    var cellsY: Double = js.native
    
    /**
      * The amount of cells along the z-axis.
      */
    var cellsZ: Double = js.native
    
    /**
      * The depth of the entire spatial index.
      */
    var depth: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Computes the partition index for the given position vector.
      *
      * @param position - The given position.
      * @returns The partition index.
      */
    def getIndexForPosition(position: Vector3): Double = js.native
    
    /**
      * The height of the entire spatial index.
      */
    var height: Double = js.native
    
    /**
      * Removes all entities from all partitions.
      */
    def makeEmpty(): this.type = js.native
    
    /**
      * Performs a query to the spatial index according the the given position and
      * radius. The method approximates the query position and radius with an AABB and
      * then performs an intersection test with all non-empty cells in order to determine
      * relevant partitions. Stores the result in the given result array.
      *
      * @param position - The given query position.
      * @param radius - The given query radius.
      * @param result - The result array.
      */
    def query(position: Vector3, radius: Double, result: js.Array[GameEntity]): js.Array[GameEntity] = js.native
    
    /**
      * Removes an entity from a specific partition.
      *
      * @param entity - The entity to remove.
      * @param index - The partition index.
      */
    def removeEntityFromPartition(entity: GameEntity, index: Double): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Updates the partitioning index of a given game entity.
      *
      * @param entity - The entity to update.
      * @param [currentIndex] - The current partition index of the entity (default: -1).
      * @return The new partitioning index for the given game entity.
      */
    def updateEntity(entity: GameEntity): Double = js.native
    def updateEntity(entity: GameEntity, currentIndex: Double): Double = js.native
    
    /**
      * The width of the entire spatial index.
      */
    var width: Double = js.native
  }
}
