package typings.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "EvadeBehavior")
@js.native
/**
  * Constructs a new evade behavior.
  *
  * @param [pursuer] - The agent to evade from.
  * @param [panicDistance] - The agent only flees from the pursuer if it is inside this radius.
  * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the pursuer.
  */
open class EvadeBehavior ()
  extends typings.yuka.srcSteeringBehaviorsEvadeBehaviorMod.EvadeBehavior {
  def this(pursuer: typings.yuka.srcCoreMovingEntityMod.MovingEntity) = this()
  def this(pursuer: Unit, panicDistance: Double) = this()
  def this(pursuer: typings.yuka.srcCoreMovingEntityMod.MovingEntity, panicDistance: Double) = this()
  def this(pursuer: Unit, panicDistance: Double, predictionFactor: Double) = this()
  def this(pursuer: Unit, panicDistance: Unit, predictionFactor: Double) = this()
  def this(
    pursuer: typings.yuka.srcCoreMovingEntityMod.MovingEntity,
    panicDistance: Double,
    predictionFactor: Double
  ) = this()
  def this(
    pursuer: typings.yuka.srcCoreMovingEntityMod.MovingEntity,
    panicDistance: Unit,
    predictionFactor: Double
  ) = this()
}
