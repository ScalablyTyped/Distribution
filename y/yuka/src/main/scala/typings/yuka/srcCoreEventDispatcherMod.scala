package typings.yuka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreEventDispatcherMod {
  
  @JSImport("yuka/src/core/EventDispatcher", "EventDispatcher")
  @js.native
  /**
    * Constructs a new event dispatcher.
    */
  open class EventDispatcher () extends StObject {
    
    /**
      * Adds an event listener for the given event type.
      *
      * @param type - The event type.
      * @param listener - The event listener to add.
      */
    def addEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
    
    /**
      * Dispatches an event to all respective event listeners.
      *
      * @param event - The event object.
      */
    def dispatchEvent(event: EventInterface): Unit = js.native
    
    /**
      * Returns true if the given event listener is set for the given event type.
      *
      * @param type - The event type.
      * @param listener - The event listener to test.
      * @return Whether the given event listener is set for the given event type or not.
      */
    def hasEventListener(`type`: String, listener: ListenerFunction): Boolean = js.native
    
    /**
      * Removes the given event listener for the given event type.
      *
      * @param type - The event type.
      * @param listener - The event listener to remove.
      */
    def removeEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
  }
  
  trait DispatchedEventInterface
    extends StObject
       with EventInterface {
    
    var target: EventDispatcher
  }
  object DispatchedEventInterface {
    
    inline def apply(target: EventDispatcher, `type`: String): DispatchedEventInterface = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchedEventInterface]
    }
    
    extension [Self <: DispatchedEventInterface](x: Self) {
      
      inline def setTarget(value: EventDispatcher): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventInterface extends StObject {
    
    var `type`: String
  }
  object EventInterface {
    
    inline def apply(`type`: String): EventInterface = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventInterface]
    }
    
    extension [Self <: EventInterface](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ListenerFunction = js.Function1[/* event */ DispatchedEventInterface, Unit]
}
