package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "PursuitBehavior")
@js.native
/**
  * Constructs a new pursuit behavior.
  *
  * @param [evader] - The agent to pursue.
  * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the evader.
  */
open class PursuitBehavior ()
  extends typings.yuka.yukaMod.PursuitBehavior {
  def this(evader: typings.yuka.movingEntityMod.MovingEntity) = this()
  def this(evader: Null, predictionFactor: Double) = this()
  def this(evader: Unit, predictionFactor: Double) = this()
  def this(evader: typings.yuka.movingEntityMod.MovingEntity, predictionFactor: Double) = this()
}
