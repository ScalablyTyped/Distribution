package typings.yuka

import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcTriggerTriggerRegionMod.TriggerRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTriggerTriggerMod {
  
  @JSImport("yuka/src/trigger/Trigger", "Trigger")
  @js.native
  /**
    * Constructs a new trigger with the given values.
    *
    * @param [region] - The region of the trigger.
    */
  open class Trigger () extends GameEntity {
    def this(region: TriggerRegion) = this()
    
    /**
      * This method is called per simulation step for all game entities. If the game
      * entity touches the region of the trigger, the respective action is executed.
      *
      * @param entity - The entity to test
      */
    def check(entity: GameEntity): this.type = js.native
    
    /**
      * This method is called when the trigger should execute its action.
      * Must be implemented by all concrete triggers.
      *
      * @param entity - The entity that touched the trigger region.
      */
    def execute(entity: GameEntity): Trigger = js.native
    
    /**
      * The region of the trigger.
      */
    var region: TriggerRegion = js.native
    
    /**
      * Registers a custom type for deserialization. When calling {@link Trigger#fromJSON}
      * the trigger is able to pick the correct constructor in order to create custom
      * trigger regions.
      *
      * @param type - The name of the trigger region.
      * @param constructor - The constructor function.
      */
    def registerType(`type`: String, constructor: js.Function0[TriggerRegion]): this.type = js.native
    
    /**
      * Updates the region of this trigger. Called by the {@link EntityManager} per
      * simulation step.
      *
      * @return A reference to this trigger.
      */
    def updateRegion(): this.type = js.native
  }
}
