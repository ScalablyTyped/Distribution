package typings.yuka

import typings.yuka.srcCoreMovingEntityMod.MovingEntity
import typings.yuka.srcMathVector3Mod.Vector3
import typings.yuka.srcSteeringSteeringBehaviorMod.SteeringBehavior
import typings.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringBehaviorsInterposeBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/InterposeBehavior", "InterposeBehavior")
  @js.native
  /**
    * Constructs a new interpose behavior.
    *
    * @param [entity1] - The first agent.
    * @param [entity2] - The second agent.
    * @param [deceleration] - The amount of deceleration.
    */
  open class InterposeBehavior () extends SteeringBehavior {
    def this(entity1: MovingEntity) = this()
    def this(entity1: Unit, entity2: MovingEntity) = this()
    def this(entity1: MovingEntity, entity2: MovingEntity) = this()
    def this(entity1: Unit, entity2: Unit, deceleration: Double) = this()
    def this(entity1: Unit, entity2: MovingEntity, deceleration: Double) = this()
    def this(entity1: MovingEntity, entity2: Unit, deceleration: Double) = this()
    def this(entity1: MovingEntity, entity2: MovingEntity, deceleration: Double) = this()
    
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
      * The first agent.
      * @default null
      */
    var entity1: MovingEntity = js.native
    
    /**
      * The second agent.
      * @default null
      */
    var entity2: MovingEntity = js.native
  }
}
