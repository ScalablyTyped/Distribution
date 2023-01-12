package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreGameEntityMod.GameEntity
import typings.yuka.srcCoreTelegramMod.Telegram
import typings.yuka.yukaStrings.active
import typings.yuka.yukaStrings.completed
import typings.yuka.yukaStrings.failed
import typings.yuka.yukaStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGoalGoalMod {
  
  @JSImport("yuka/src/goal/Goal", "Goal")
  @js.native
  open class Goal[T /* <: GameEntity */] () extends StObject {
    def this(owner: T) = this()
    
    /**
      * Executed when this goal is activated.
      */
    def activate(): Unit = js.native
    
    /**
      * Ensures the goal is activated if it is inactive.
      */
    def activateIfInactive(): this.type = js.native
    
    /**
      * Returns true if the status of this goal is *ACTIVE*.
      */
    def active(): Boolean = js.native
    
    /**
      * Returns true if the status of this goal is *COMPLETED*.
      */
    def completed(): Boolean = js.native
    
    /**
      * Executed in each simulation step.
      */
    def execute(): Unit = js.native
    
    /**
      * Returns true if the status of this goal is *FAILED*.
      */
    def failed(): Boolean = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Goals can handle messages. Many don't though, so this defines a default behavior.
      *
      * @param telegram - The telegram with the message data.
      * @return Whether the message was processed or not.
      */
    def handleMessage(telegram: Telegram): Boolean = js.native
    
    /**
      * Returns true if the status of this goal is *INACTIVE*.
      */
    def inactive(): Boolean = js.native
    
    /**
      * The owner of this goal.
      */
    var owner: T | Null = js.native
    
    /**
      * Ensures the goal is replanned if it has failed.
      */
    def replanIfFailed(): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * The status of this goal.
      * @default {@link StatusTypes.INACTIVE}
      */
    var status: GoalStatus = js.native
    
    /**
      * Executed when this goal is satisfied.
      */
    def terminate(): Unit = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  /* static members */
  object Goal {
    
    @JSImport("yuka/src/goal/Goal", "Goal.STATUS")
    @js.native
    val STATUS: StatusTypes = js.native
  }
  
  type GoalStatus = String
  
  trait StatusTypes extends StObject {
    
    // the goal has been activated and will be processed each update step
    val ACTIVE: active
    
    // the goal has completed and will be removed on the next update
    val COMPLETED: completed
    
    // the goal has failed and will either replan or be removed on the next update
    val FAILED: failed
    
    // the goal is waiting to be activated
    val INACTIVE: inactive
  }
  object StatusTypes {
    
    inline def apply(): StatusTypes = {
      val __obj = js.Dynamic.literal(ACTIVE = "active", COMPLETED = "completed", FAILED = "failed", INACTIVE = "inactive")
      __obj.asInstanceOf[StatusTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusTypes] (val x: Self) extends AnyVal {
      
      inline def setACTIVE(value: active): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
      
      inline def setCOMPLETED(value: completed): Self = StObject.set(x, "COMPLETED", value.asInstanceOf[js.Any])
      
      inline def setFAILED(value: failed): Self = StObject.set(x, "FAILED", value.asInstanceOf[js.Any])
      
      inline def setINACTIVE(value: inactive): Self = StObject.set(x, "INACTIVE", value.asInstanceOf[js.Any])
    }
  }
}
