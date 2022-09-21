package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.stateMod.State
import typings.yuka.telegramMod.Telegram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMachineMod {
  
  @JSImport("yuka/src/fsm/StateMachine", "StateMachine")
  @js.native
  /**
    * Constructs a new state machine with the given values.
    *
    * @param [owner=null] - The owner of this state machine.
    */
  open class StateMachine[T /* <: GameEntity */] () extends StObject {
    def this(owner: T) = this()
    
    /**
      * Adds a new state with the given ID to the state machine.
      *
      * @param id - The ID of the state.
      * @param state - The state.
      */
    def add(id: String, state: State[T]): this.type = js.native
    
    /**
      * Performs a state change to the state defined by its ID.
      *
      * @param id - The ID of the state.
      */
    def changeTo(id: String): this.type = js.native
    
    /**
      * The current state of the game entity.
      */
    var currentState: State[T] | Null = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns the state for the given ID.
      *
      * @param id - The ID of the state.
      */
    def get(id: String): State[T] = js.native
    
    /**
      * This state logic is called every time the state machine is updated.
      */
    var globalState: State[T] | Null = js.native
    
    /**
      * Tries to dispatch the massage to the current or global state and returns true
      * if the message was processed successfully.
      *
      * @param telegram - The telegram with the message data.
      * @return Whether the message was processed or not.
      */
    def handleMessage(telegram: Telegram): Boolean = js.native
    
    /**
      * Returns true if this FSM is in the given state.
      *
      * @return Whether this FSM is in the given state or not.
      */
    def in(id: String): Boolean = js.native
    
    /**
      * The game entity that owns this state machine.
      */
    var owner: T | Null = js.native
    
    /**
      * The previous state of the game entity.
      */
    var previousState: State[T] | Null = js.native
    
    /**
      * Registers a custom type for deserialization. When calling {@link StateMachine#fromJSON}
      * the state machine is able to pick the correct constructor in order to create custom states.
      *
      * @param type - The name of the state type.
      * @param constructor - The constructor function.
      */
    def registerType(`type`: String, constructor: js.Function0[State[T]]): this.type = js.native
    
    /**
      * Removes a state via its ID from the state machine.
      *
      * @param id - The ID of the state.
      */
    def remove(id: String): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, T]): this.type = js.native
    
    /**
      * Returns to the previous state.
      */
    def revert(): this.type = js.native
    
    /**
      * A map with all states of the state machine.
      */
    val states: Map[String, State[T]] = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Updates the internal state of the FSM. Usually called by {@link GameEntity#update}.
      */
    def update(): this.type = js.native
  }
}
