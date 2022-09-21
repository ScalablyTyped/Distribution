package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.telegramMod.Telegram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDispatcherMod {
  
  @JSImport("yuka/src/core/MessageDispatcher", "MessageDispatcher")
  @js.native
  /**
    * Constructs a new message dispatcher.
    */
  open class MessageDispatcher () extends StObject {
    
    /**
      * Clears the internal state of this message dispatcher.
      */
    def clear(): this.type = js.native
    
    /**
      * A list of delayed telegrams.
      */
    val delayedTelegrams: js.Array[Telegram] = js.native
    
    /**
      * Delivers the message to the receiver.
      *
      * @param telegram - The telegram to deliver.
      */
    def deliver(telegram: Telegram): this.type = js.native
    
    /**
      * Receives the raw telegram data and decides how to dispatch the telegram (with or without delay).
      *
      * @param sender - The sender.
      * @param receiver - The receiver.
      * @param message - The actual message.
      * @param delay - A time value in millisecond used to delay the message dispatching.
      * @param data - An object for custom data.
      */
    def dispatch(sender: GameEntity, receiver: GameEntity, message: String, delay: Double, data: js.Object): this.type = js.native
    
    /**
      * Used to process delayed messages.
      *
      * @param delta - The time delta.
      */
    def dispatchDelayedMessages(delta: Double): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
