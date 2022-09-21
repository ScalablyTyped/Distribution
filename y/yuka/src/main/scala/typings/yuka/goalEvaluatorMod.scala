package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.gameEntityMod.GameEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object goalEvaluatorMod {
  
  @JSImport("yuka/src/goal/GoalEvaluator", "GoalEvaluator")
  @js.native
  /**
    * Constructs a new goal evaluator.
    *
    * @param characterBias - Can be used to adjust the preferences of agents.
    */
  open class GoalEvaluator[T /* <: GameEntity */] () extends StObject {
    def this(characterBias: Double) = this()
    
    /**
      * Calculates the desirability. It's a score between 0 and 1 representing the desirability
      * of a goal. This goal is considered as a top level strategy of the agent like *Explore* or
      * *AttackTarget*. Must be implemented by all concrete goal evaluators.
      *
      * @param owner - The owner of this goal evaluator.
      * @return The desirability.
      */
    def calculateDesirability(owner: T): Double = js.native
    
    /**
      * Can be used to adjust the preferences of agents. When the desirability score
      * for a goal has been evaluated, it is multiplied by this value.
      * @default 1
      */
    var characterBias: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Executed if this goal evaluator produces the highest desirability. Must be implemented
      * by all concrete goal evaluators.
      *
      * @param owner - The owner of this goal evaluator.
      */
    def setGoal(owner: T): Unit = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
