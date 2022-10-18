package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreTelegramMod {
  
  @JSImport("yuka/src/core/Telegram", "Telegram")
  @js.native
  open class Telegram protected () extends StObject {
    /**
      * Constructs a new telegram object.
      *
      * @param sender - The sender.
      * @param receiver - The receiver.
      * @param message - The actual message.
      * @param delay - A time value in millisecond used to delay the message dispatching.
      * @param data - An object for custom data.
      */
    def this(sender: GameEntity, receiver: GameEntity, message: String, delay: Double, data: js.Object) = this()
    
    /** An object for custom data. */
    var data: js.Object = js.native
    
    /** A time value in millisecond used to delay the message dispatching. */
    var delay: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /** The actual message. */
    var message: String = js.native
    
    /** The receiver. */
    var receiver: GameEntity = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /** The sender. */
    var sender: GameEntity = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
