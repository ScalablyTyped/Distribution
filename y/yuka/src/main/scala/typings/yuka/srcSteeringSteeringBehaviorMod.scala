package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcMathVector3Mod.Vector3
import typings.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringSteeringBehaviorMod {
  
  @JSImport("yuka/src/steering/SteeringBehavior", "SteeringBehavior")
  @js.native
  open class SteeringBehavior () extends StObject {
    
    /**
      * Whether this steering behavior is active or not.
      * @default true
      */
    var active: Boolean = js.native
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @param delta - The time delta.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3, delta: Double): Vector3 = js.native
    
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
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Can be used to tweak the amount that a steering force contributes to the total steering force.
      * @default 1
      */
    var weight: Double = js.native
  }
}
