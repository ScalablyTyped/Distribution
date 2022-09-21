package typings.yuka

import typings.yuka.movingEntityMod.MovingEntity
import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evadeBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/EvadeBehavior", "EvadeBehavior")
  @js.native
  /**
    * Constructs a new evade behavior.
    *
    * @param [pursuer] - The agent to evade from.
    * @param [panicDistance] - The agent only flees from the pursuer if it is inside this radius.
    * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the pursuer.
    */
  open class EvadeBehavior () extends SteeringBehavior {
    def this(pursuer: MovingEntity) = this()
    def this(pursuer: Unit, panicDistance: Double) = this()
    def this(pursuer: MovingEntity, panicDistance: Double) = this()
    def this(pursuer: Unit, panicDistance: Double, predictionFactor: Double) = this()
    def this(pursuer: Unit, panicDistance: Unit, predictionFactor: Double) = this()
    def this(pursuer: MovingEntity, panicDistance: Double, predictionFactor: Double) = this()
    def this(pursuer: MovingEntity, panicDistance: Unit, predictionFactor: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The agent only flees from the pursuer if it is inside this radius.
      * @default 10
      */
    var panicDistance: Double = js.native
    
    /**
      * This factor determines how far the vehicle predicts the movement of the pursuer.
      * @default 1
      */
    var predictionFactor: Double = js.native
    
    /**
      * The agent to evade from.
      * @default null
      */
    var pursuer: MovingEntity | Null = js.native
  }
}
