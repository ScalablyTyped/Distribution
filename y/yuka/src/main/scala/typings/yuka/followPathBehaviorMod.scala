package typings.yuka

import typings.yuka.pathMod.Path
import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object followPathBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/FollowPathBehavior", "FollowPathBehavior")
  @js.native
  /**
    * Constructs a new follow path behavior.
    *
    * @param [path] - The path to follow.
    * @param [nextWaypointDistance] - The distance the agent seeks for the next waypoint.
    */
  open class FollowPathBehavior () extends SteeringBehavior {
    def this(path: Path) = this()
    def this(path: Unit, nextWaypointDistance: Double) = this()
    def this(path: Path, nextWaypointDistance: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The distance the agent seeks for the next waypoint.
      * @default 1
      */
    var nextWaypointDistance: Double = js.native
    
    /** The path to follow. */
    var path: Path = js.native
  }
}
