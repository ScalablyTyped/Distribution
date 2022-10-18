package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcMathVector3Mod.Vector3
import typings.yuka.srcSteeringSteeringBehaviorMod.SteeringBehavior
import typings.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringSteeringManagerMod {
  
  @JSImport("yuka/src/steering/SteeringManager", "SteeringManager")
  @js.native
  open class SteeringManager protected () extends StObject {
    /**
      * Constructs a new steering manager.
      *
      * @param vehicle - The vehicle that owns this steering manager.
      */
    def this(vehicle: Vehicle) = this()
    
    /**
      * Adds the given steering behavior to this steering manager.
      *
      * @param behavior - The steering behavior to add.
      */
    def add(behavior: SteeringBehavior): this.type = js.native
    
    /**
      * A list of all steering behaviors.
      */
    val behaviors: js.Array[SteeringBehavior] = js.native
    
    /**
      * Calculates the steering forces for all active steering behaviors and
      * combines it into a single result force. This method is called in
      * {@link Vehicle#update}.
      *
      * @param delta - The time delta.
      * @param result - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(delta: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Clears the internal state of this steering manager.
      */
    def clear(): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Registers a custom type for deserialization. When calling {@link SteeringManager#fromJSON}
      * the steering manager is able to pick the correct constructor in order to create custom
      * steering behavior.
      *
      * @param type - The name of the behavior type.
      * @param constructor - The constructor function.
      */
    def registerType(`type`: String, constructor: js.Function0[SteeringBehavior]): this.type = js.native
    
    /**
      * Removes the given steering behavior from this steering manager.
      *
      * @param behavior - The steering behavior to remove.
      */
    def remove(behavior: SteeringBehavior): this.type = js.native
    
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
    
    /**
      * The vehicle that owns this steering manager.
      */
    var vehicle: Vehicle = js.native
  }
}
