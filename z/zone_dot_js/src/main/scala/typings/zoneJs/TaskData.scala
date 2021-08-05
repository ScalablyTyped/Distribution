package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
trait TaskData extends StObject {
  
  /**
    * Delay in milliseconds when the Task will run.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * identifier returned by the native setTimeout.
    */
  var handleId: js.UndefOr[Double] = js.undefined
  
  /**
    * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
    */
  var isPeriodic: js.UndefOr[Boolean] = js.undefined
}
object TaskData {
  
  inline def apply(): TaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskData]
  }
  
  extension [Self <: TaskData](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHandleId(value: Double): Self = StObject.set(x, "handleId", value.asInstanceOf[js.Any])
    
    inline def setHandleIdUndefined: Self = StObject.set(x, "handleId", js.undefined)
    
    inline def setIsPeriodic(value: Boolean): Self = StObject.set(x, "isPeriodic", value.asInstanceOf[js.Any])
    
    inline def setIsPeriodicUndefined: Self = StObject.set(x, "isPeriodic", js.undefined)
  }
}
