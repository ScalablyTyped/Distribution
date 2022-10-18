package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcMathAabbMod.AABB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPartitioningCellMod {
  
  @JSImport("yuka/src/partitioning/Cell", "Cell")
  @js.native
  /**
    * Constructs a new cell with the given values.
    *
    * @param [aabb] - The bounding volume of the cell.
    */
  open class Cell () extends StObject {
    def this(aabb: AABB) = this()
    
    /**
      * The bounding volume of the cell.
      */
    var aabb: AABB = js.native
    
    /**
      * Adds an entry to this cell.
      */
    def add(entry: GameEntity): this.type = js.native
    
    /**
      * Returns true if this cell is empty.
      */
    def empty(): Boolean = js.native
    
    /**
      * The list of entries which belong to this cell.
      */
    val entries: js.Array[GameEntity] = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns true if the given AABB intersects the internal bounding volume of this cell.
      */
    def intersects(aabb: AABB): Boolean = js.native
    
    /**
      * Removes all entries from this cell.
      */
    def makeEmpty(): this.type = js.native
    
    /**
      * Removes an entry from this cell.
      */
    def remove(entry: GameEntity): this.type = js.native
    
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
  }
}
