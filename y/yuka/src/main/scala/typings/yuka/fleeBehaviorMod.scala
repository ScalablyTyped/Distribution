package typings.yuka

import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fleeBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/FleeBehavior", "FleeBehavior")
  @js.native
  /**
    * Constructs a new flee behavior.
    *
    * @param [target] - The target vector.
    * @param [panicDistance] - The agent only flees from the target if it is inside this radius.
    */
  open class FleeBehavior () extends SteeringBehavior {
    def this(target: Vector3) = this()
    def this(target: Unit, panicDistance: Double) = this()
    def this(target: Vector3, panicDistance: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The agent only flees from the target if it is inside this radius.
      * @default 10
      */
    var panicDistance: Double = js.native
    
    /**
      * The target vector.
      * @default 0,0,0
      */
    var target: Vector3 = js.native
  }
}
