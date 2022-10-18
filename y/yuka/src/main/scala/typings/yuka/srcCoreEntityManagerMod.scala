package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcCoreGameEntityMod.GameEntityConstructor
import typings.yuka.srcPartitioningCellSpacePartitioningMod.CellSpacePartitioning
import typings.yuka.srcTriggerTriggerMod.Trigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreEntityManagerMod {
  
  @JSImport("yuka/src/core/EntityManager", "EntityManager")
  @js.native
  /**
    * Constructs a new entity manager.
    */
  open class EntityManager () extends StObject {
    
    /**
      * Adds a game entity to this entity manager.
      *
      * @param entity - The game entity to add.
      */
    def add(entity: GameEntity): this.type = js.native
    
    /**
      * Clears the internal state of this entity manager.
      */
    def clear(): this.type = js.native
    
    /**
      * A list of {@link GameEntity game entities}.
      */
    val entities: js.Array[GameEntity] = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns an entity by the given name. If no game entity is found, *null*
      * is returned. This method should be used once (e.g. at {@link GameEntity#start})
      * and the result should be cached for later use.
      *
      * @param name - The name of the game entity.
      * @return The found game entity.
      */
    def getEntityByName(name: String): GameEntity | Null = js.native
    
    /**
      * Processes a single trigger.
      *
      * @param trigger - The trigger to process.
      */
    def processTrigger(trigger: Trigger): this.type = js.native
    
    /**
      * Registers a custom type for deserialization. When calling {@link EntityManager#fromJSON}
      * the entity manager is able to pick the correct constructor in order to create custom
      * game entities.
      *
      * @param type - The name of the entity type.
      * @param constructor - The constructor function.
      */
    def registerType(`type`: String, constructor: GameEntityConstructor): this.type = js.native
    
    /**
      * Removes a game entity from this entity manager.
      *
      * @param entity - The game entity to remove.
      */
    def remove(entity: GameEntity): this.type = js.native
    
    /**
      * Interface for game entities so they can send messages to other game entities.
      *
      * @param sender - The sender.
      * @param receiver - The receiver.
      * @param message - The actual message.
      * @param delay - A time value in millisecond used to delay the message dispatching.
      * @param data - An object for custom data.
      */
    def sendMessage(sender: GameEntity, receiver: GameEntity, message: String, delay: Double, data: js.Object): this.type = js.native
    
    /**
      * A reference to a spatial index.
      * @default null
      */
    var spatialIndex: CellSpacePartitioning | Null = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * The central update method of this entity manager. Updates all
      * game entities and delayed messages.
      *
      * @param delta - The time delta.
      */
    def update(delta: Double): this.type = js.native
    
    /**
      * Updates a single entity.
      *
      * @param entity - The game entity to update.
      * @param delta - The time delta.
      */
    def updateEntity(entity: GameEntity, delta: Double): this.type = js.native
    
    /**
      * Updates the neighborhood of a single game entity.
      *
      * @param entity - The game entity to update.
      */
    def updateNeighborhood(entity: GameEntity): this.type = js.native
  }
}
