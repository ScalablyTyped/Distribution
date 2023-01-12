package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasTaskState extends StObject {
  
  var change: TaskType
  
  var eventTask: Boolean
  
  var macroTask: Boolean
  
  var microTask: Boolean
}
object HasTaskState {
  
  inline def apply(change: TaskType, eventTask: Boolean, macroTask: Boolean, microTask: Boolean): HasTaskState = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], eventTask = eventTask.asInstanceOf[js.Any], macroTask = macroTask.asInstanceOf[js.Any], microTask = microTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasTaskState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasTaskState] (val x: Self) extends AnyVal {
    
    inline def setChange(value: TaskType): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setEventTask(value: Boolean): Self = StObject.set(x, "eventTask", value.asInstanceOf[js.Any])
    
    inline def setMacroTask(value: Boolean): Self = StObject.set(x, "macroTask", value.asInstanceOf[js.Any])
    
    inline def setMicroTask(value: Boolean): Self = StObject.set(x, "microTask", value.asInstanceOf[js.Any])
  }
}
