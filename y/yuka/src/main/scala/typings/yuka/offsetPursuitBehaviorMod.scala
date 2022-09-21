package typings.yuka

import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetPursuitBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/OffsetPursuitBehavior", "OffsetPursuitBehavior")
  @js.native
  /**
    * Constructs a new offset pursuit behavior.
    *
    * @param [leader] - The leader vehicle.
    * @param [offset] - The offset from the leader.
    */
  open class OffsetPursuitBehavior () extends SteeringBehavior {
    def this(leader: Vehicle) = this()
    def this(leader: Unit, offset: Vector3) = this()
    def this(leader: Vehicle, offset: Vector3) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The leader vehicle.
      */
    var leader: Vehicle = js.native
    
    /**
      * The offset from the leader.
      */
    var offset: Vector3 = js.native
  }
}
