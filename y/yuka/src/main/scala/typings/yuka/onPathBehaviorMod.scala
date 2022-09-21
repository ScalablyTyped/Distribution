package typings.yuka

import typings.yuka.pathMod.Path
import typings.yuka.steeringBehaviorMod.SteeringBehavior
import typings.yuka.vector3Mod.Vector3
import typings.yuka.vehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onPathBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/OnPathBehavior", "OnPathBehavior")
  @js.native
  /**
    * Constructs a new on path behavior.
    *
    * @param [path] - The path to stay close to.
    * @param [radius] - Defines the width of the path. With a smaller radius, the vehicle will have to follow the path more closely.
    * @param [predictionFactor] - Determines how far the behavior predicts the movement of the vehicle.
    */
  open class OnPathBehavior () extends SteeringBehavior {
    def this(path: Path) = this()
    def this(path: Unit, radius: Double) = this()
    def this(path: Path, radius: Double) = this()
    def this(path: Unit, radius: Double, predictionFactor: Double) = this()
    def this(path: Unit, radius: Unit, predictionFactor: Double) = this()
    def this(path: Path, radius: Double, predictionFactor: Double) = this()
    def this(path: Path, radius: Unit, predictionFactor: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /** The path to stay close to. */
    var path: Path = js.native
    
    /**
      * Determines how far the behavior predicts the movement of the vehicle.
      * @default 1
      */
    var predictionFactor: Double = js.native
    
    /**
      * Defines the width of the path. With a smaller radius, the vehicle will have to follow the path more closely.
      * @default 0.1
      */
    var radius: Double = js.native
  }
}
