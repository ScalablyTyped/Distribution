package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "GoalEvaluator")
@js.native
/**
  * Constructs a new goal evaluator.
  *
  * @param characterBias - Can be used to adjust the preferences of agents.
  */
open class GoalEvaluator[T /* <: typings.yuka.srcCoreGameEntityMod.GameEntity */] ()
  extends typings.yuka.srcYukaMod.GoalEvaluator[T] {
  def this(characterBias: Double) = this()
}
