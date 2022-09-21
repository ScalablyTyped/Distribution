package typings.yuka

import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object obstacleAvoidanceBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/ObstacleAvoidanceBehavior", "ObstacleAvoidanceBehavior")
  @js.native
  /**
    * Constructs a new obstacle avoidance behavior.
    *
    * @param [obstacles] - An Array with obstacle of type {@link GameEntity}.
    */
  open class ObstacleAvoidanceBehavior () extends SteeringBehavior {
    def this(obstacles: js.Array[GameEntity]) = this()
    
    /**
      * This factor determines how much the vehicle decelerates if an intersection occurs.
      * @default 0.2
      */
    var brakingWeight: Double = js.native
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * Minimum length of the detection box used for intersection tests.
      * @default 4
      */
    var dBoxMinLength: Double = js.native
    
    /**
      * An Array with obstacle of type {@link GameEntity}.
      */
    var obstacles: js.Array[GameEntity] = js.native
  }
}
