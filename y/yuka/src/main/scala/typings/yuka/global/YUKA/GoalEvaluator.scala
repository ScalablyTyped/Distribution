package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.GoalEvaluator")
@js.native
/**
  * Constructs a new goal evaluator.
  *
  * @param characterBias - Can be used to adjust the preferences of agents.
  */
open class GoalEvaluator[T /* <: typings.yuka.gameEntityMod.GameEntity */] ()
  extends typings.yuka.mod.GoalEvaluator[T] {
  def this(characterBias: Double) = this()
}
