package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.memoryRecordMod.MemoryRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memorySystemMod {
  
  @JSImport("yuka/src/perception/memory/MemorySystem", "MemorySystem")
  @js.native
  /**
    * Constructs a new memory system.
    *
    * @param [owner=null] - The game entity that owns this memory system.
    */
  open class MemorySystem () extends StObject {
    def this(owner: GameEntity) = this()
    
    /**
      * Removes all memory records from the memory system.
      */
    def clear(): this.type = js.native
    
    /**
      * Creates a memory record for the given game entity.
      *
      * @param entity - The game entity.
      */
    def createRecord(entity: GameEntity): this.type = js.native
    
    /**
      * Deletes the memory record for the given game entity.
      *
      * @param entity - The game entity.
      */
    def deleteRecord(entity: GameEntity): this.type = js.native
    
    /**
      * The game entity that owns this memory system.
      */
    var entity: GameEntity | Null = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns the memory record of the given game entity.
      *
      * @param entity - The game entity.
      * @return The memory record for this game entity.
      */
    def getRecord(entity: GameEntity): js.UndefOr[MemoryRecord] = js.native
    
    /**
      * Determines all valid memory record and stores the result in the given array.
      *
      * @param currentTime - The current elapsed time.
      * @param result - The result array.
      * @return The result array.
      */
    def getValidMemoryRecords(currentTime: Double, result: js.Array[MemoryRecord]): js.Array[MemoryRecord] = js.native
    
    /**
      * Returns true if there is a memory record for the given game entity.
      *
      * @param entity - The game entity.
      * @return Whether the game entity has a memory record or not.
      */
    def hasRecord(entity: GameEntity): Boolean = js.native
    
    /**
      * Represents the duration of the game entities short term memory in seconds.
      * When a bot requests a list of all recently sensed game entities, this value
      * is used to determine if the bot is able to remember a game entity or not.
      * @default 1
      */
    var memorySpan: Double = js.native
    
    /**
      * Used to simulate memory of sensory events. It contains {@link MemoryRecord memory records}
      * of all relevant game entities in the environment. The records are usually update by
      * the owner of the memory system.
      */
    var records: js.Array[MemoryRecord] = js.native
    
    /**
      * Same as {@link MemorySystem#records} but used for fast access via the game entity.
      */
    var recordsMap: Map[GameEntity, MemoryRecord] = js.native
    
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
