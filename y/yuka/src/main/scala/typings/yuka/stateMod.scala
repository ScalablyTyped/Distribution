package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.telegramMod.Telegram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("yuka/src/fsm/State", "State")
  @js.native
  open class State[T /* <: GameEntity */] () extends StObject {
    
    /**
      * This method is called once during a state transition when the {@link StateMachine} makes
      * this state active.
      *
      * @param owner - The game entity that represents the execution context of this state.
      */
    def enter(owner: T): Unit = js.native
    
    /**
      * This method is called per simulation step if this state is active.
      *
      * @param owner - The game entity that represents the execution context of this state.
      */
    def execute(owner: T): Unit = js.native
    
    /**
      * This method is called once during a state transition when the {@link StateMachine} makes
      * this state inactive.
      *
      * @param owner - The game entity that represents the execution context of this state.
      */
    def exit(owner: T): Unit = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * This method is called when messaging between game entities occurs.
      *
      * @param owner - The game entity that represents the execution context of this state.
      * @param telegram - A data structure containing the actual message.
      * @return Whether the message was processed or not.
      */
    def onMessage(owner: T, telegram: Telegram): Boolean = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, T]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
