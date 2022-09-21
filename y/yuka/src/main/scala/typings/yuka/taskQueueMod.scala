package typings.yuka

import typings.yuka.anon.Timeout
import typings.yuka.taskMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueMod {
  
  @JSImport("yuka/src/task/TaskQueue", "TaskQueue")
  @js.native
  /**
    * Constructs a new task queue.
    */
  open class TaskQueue () extends StObject {
    
    /**
      * Adds the given task to the task queue.
      *
      * @param task - The task to add.
      */
    def enqueue(task: Task): this.type = js.native
    
    /**
      * Used to control the asynchronous processing.
      * - timeout: After this amount of time (in ms), a scheduled task is executed even if
      * doing so risks causing a negative performance impact (e.g. bad frame time).
      */
    val options: Timeout = js.native
    
    /**
      * A list of pending tasks.
      */
    val tasks: js.Array[Task] = js.native
    
    /**
      * Updates the internal state of the task queue. Should be called
      * per simulation step.
      */
    def update(): this.type = js.native
  }
}
