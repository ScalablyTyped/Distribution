package typings.yuka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTaskTaskMod {
  
  @JSImport("yuka/src/task/Task", "Task")
  @js.native
  open class Task () extends StObject {
    
    /**
      * This method represents the actual unit of work.
      * Must be implemented by all concrete tasks.
      */
    def execute(): Unit = js.native
  }
}
