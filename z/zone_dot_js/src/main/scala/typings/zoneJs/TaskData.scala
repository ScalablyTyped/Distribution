package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
@js.native
trait TaskData extends StObject {
  
  /**
    * Delay in milliseconds when the Task will run.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * identifier returned by the native setTimeout.
    */
  var handleId: js.UndefOr[Double] = js.native
  
  /**
    * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
    */
  var isPeriodic: js.UndefOr[Boolean] = js.native
}
object TaskData {
  
  @scala.inline
  def apply(): TaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskData]
  }
  
  @scala.inline
  implicit class TaskDataMutableBuilder[Self <: TaskData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setHandleId(value: Double): Self = StObject.set(x, "handleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleIdUndefined: Self = StObject.set(x, "handleId", js.undefined)
    
    @scala.inline
    def setIsPeriodic(value: Boolean): Self = StObject.set(x, "isPeriodic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPeriodicUndefined: Self = StObject.set(x, "isPeriodic", js.undefined)
  }
}
