package typings.yuka

import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcGoalGoalMod.Goal
import typings.yuka.srcGoalGoalMod.GoalStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGoalCompositeGoalMod {
  
  @JSImport("yuka/src/goal/CompositeGoal", "CompositeGoal")
  @js.native
  /**
    * Constructs a new composite goal.
    *
    * @param owner - The owner of this composite goal.
    */
  open class CompositeGoal[T /* <: GameEntity */] () extends Goal[T] {
    def this(owner: T) = this()
    
    /**
      * Adds a goal as a sub goal to this instance.
      *
      * @param goal - The sub goal to add.
      */
    def addSubgoal(goal: Goal[T]): this.type = js.native
    
    /**
      * Removes all sub goals and ensures {@link Goal#terminate} is called for each sub goal.
      */
    def clearSubgoals(): this.type = js.native
    
    /**
      * Returns the current sub goal. If no sub goals are defined, *null* is returned.
      *
      * @return The current sub goal.
      */
    def currentSubgoal(): Goal[T] | Null = js.native
    
    /**
      * Executes the current sub goal of this composite goal.
      *
      * @return The status of this composite sub goal.
      */
    def executeSubgoals(): GoalStatus = js.native
    
    /**
      * Returns true if this composite goal has sub goals.
      *
      * @return Whether the composite goal has sub goals or not.
      */
    def hasSubgoals(): Boolean = js.native
    
    /**
      * Removes a sub goal from this instance.
      *
      * @param goal - The sub goal to remove.
      */
    def removeSubgoal(goal: Goal[T]): this.type = js.native
    
    /**
      * A list of sub goals.
      */
    val subgoals: js.Array[Goal[T]] = js.native
  }
}
