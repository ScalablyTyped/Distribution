package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcTriggerTriggerMod.Trigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTriggerTriggerRegionMod {
  
  @JSImport("yuka/src/trigger/TriggerRegion", "TriggerRegion")
  @js.native
  open class TriggerRegion () extends StObject {
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Returns true if the bounding volume of the given game entity touches/intersects
      * the trigger region. Must be implemented by all concrete trigger regions.
      *
      * @param entity - The entity to test.
      */
    def touching(entity: GameEntity): Boolean = js.native
    
    /**
      * Updates this trigger region. Must be implemented by all concrete trigger regions.
      *
      * @param trigger - The trigger that owns this region.
      */
    def update(trigger: Trigger): this.type = js.native
  }
}
