package typings.yuka

import typings.yuka.srcMathVector3Mod.Vector3
import typings.yuka.srcSteeringSteeringBehaviorMod.SteeringBehavior
import typings.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringBehaviorsCohesionBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/CohesionBehavior", "CohesionBehavior")
  @js.native
  /**
    * Constructs a new cohesion behavior.
    */
  open class CohesionBehavior () extends SteeringBehavior {
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
  }
}
