package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.PursuitBehavior")
@js.native
/**
  * Constructs a new pursuit behavior.
  *
  * @param [evader] - The agent to pursue.
  * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the evader.
  */
open class PursuitBehavior ()
  extends typings.yuka.mod.PursuitBehavior {
  def this(evader: typings.yuka.srcCoreMovingEntityMod.MovingEntity) = this()
  def this(evader: Null, predictionFactor: Double) = this()
  def this(evader: Unit, predictionFactor: Double) = this()
  def this(evader: typings.yuka.srcCoreMovingEntityMod.MovingEntity, predictionFactor: Double) = this()
}
