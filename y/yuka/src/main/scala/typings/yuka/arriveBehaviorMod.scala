package typings.yuka

import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arriveBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/ArriveBehavior", "ArriveBehavior")
  @js.native
  /**
    * Constructs a new arrive behavior.
    *
    * @param [target] - The target vector.
    * @param [deceleration] - The amount of deceleration.
    * @param [tolerance] - A tolerance value in world units to prevent the vehicle from overshooting its target.
    */
  open class ArriveBehavior () extends SteeringBehavior {
    def this(target: Vector3) = this()
    def this(target: Unit, deceleration: Double) = this()
    def this(target: Vector3, deceleration: Double) = this()
    def this(target: Unit, deceleration: Double, tolerance: Double) = this()
    def this(target: Unit, deceleration: Unit, tolerance: Double) = this()
    def this(target: Vector3, deceleration: Double, tolerance: Double) = this()
    def this(target: Vector3, deceleration: Unit, tolerance: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The amount of deceleration.
      * @default 3
      */
    var deceleration: Double = js.native
    
    /**
      * The target vector.
      * @default 0,0,0
      */
    var target: Vector3 = js.native
    
    /**
      * A tolerance value in world units to prevent the vehicle from overshooting its target.
      * @default 0
      */
    var tolerance: Double = js.native
  }
}
