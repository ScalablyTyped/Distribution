package typings.yuka

import typings.yuka.compositeGoalMod.CompositeGoal
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.goalEvaluatorMod.GoalEvaluator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinkMod {
  
  @JSImport("yuka/src/goal/Think", "Think")
  @js.native
  /**
    * Constructs a new *Think* object.
    *
    * @param owner - The owner of this instance.
    */
  open class Think[T /* <: GameEntity */] () extends CompositeGoal[T] {
    def this(owner: T) = this()
    
    /**
      * Adds the given goal evaluator to this instance.
      *
      * @param evaluator - The goal evaluator to add.
      */
    def addEvaluator(evaluator: GoalEvaluator[T]): this.type = js.native
    
    /**
      * This method represents the top level decision process of an agent.
      * It iterates through each goal evaluator and selects the one that
      * has the highest score as the current goal.
      *
      * @return A reference to this instance.
      */
    def arbitrate(): this.type = js.native
    
    /**
      * A list of goal evaluators.
      */
    val evaluators: js.Array[GoalEvaluator[T]] = js.native
    
    /**
      * Registers a custom type for deserialization. When calling {@link Think#fromJSON}
      * this instance is able to pick the correct constructor in order to create custom
      * goals or goal evaluators.
      *
      * @param type - The name of the goal or goal evaluator.
      * @param constructor - The constructor function.
      */
    def registerType(`type`: String, constructor: js.Function0[GoalEvaluator[T]]): this.type = js.native
    
    /**
      * Removes the given goal evaluator from this instance.
      *
      * @param evaluator - The goal evaluator to remove.
      */
    def removeEvaluator(evaluator: GoalEvaluator[T]): this.type = js.native
  }
}
