package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "GoalEvaluator")
@js.native
/**
  * Constructs a new goal evaluator.
  *
  * @param characterBias - Can be used to adjust the preferences of agents.
  */
open class GoalEvaluator[T /* <: typings.yuka.gameEntityMod.GameEntity */] ()
  extends typings.yuka.goalEvaluatorMod.GoalEvaluator[T] {
  def this(characterBias: Double) = this()
}
