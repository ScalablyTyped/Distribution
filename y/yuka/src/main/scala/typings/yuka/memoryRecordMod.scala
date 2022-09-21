package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryRecordMod {
  
  @JSImport("yuka/src/perception/memory/MemoryRecord", "MemoryRecord")
  @js.native
  /**
    * Constructs a new memory record.
    *
    * @param [entity=null] - The game entity that is represented by this memory record.
    */
  open class MemoryRecord () extends StObject {
    def this(entity: GameEntity) = this()
    
    /**
      * The game entity that is represented by this memory record.
      */
    var entity: GameEntity | Null = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Marks the position where the opponent was last sensed.
      */
    var lastSensedPosition: Vector3 = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * Records the time the entity became visible. Useful in combination with a reaction time in order to prevent immediate actions.
      * @default -Infinity
      */
    var timeBecameVisible: Double = js.native
    
    /**
      * Records the time the entity was last sensed (e.g. seen or heard). Used to determine
      * if a game entity can "remember" this record or not.
      * @default -Infinity
      */
    var timeLastSensed: Double = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Whether this game entity is visible or not.
      * @default false
      */
    var visible: Boolean = js.native
  }
}
