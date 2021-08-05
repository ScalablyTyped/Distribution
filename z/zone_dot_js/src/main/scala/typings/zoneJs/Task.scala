package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents work which is executed with a clean stack.
  *
  * Tasks are used in Zones to mark work which is performed on clean stack frame. There are three
  * kinds of task. [MicroTask], [MacroTask], and [EventTask].
  *
  * A JS VM can be modeled as a [MicroTask] queue, [MacroTask] queue, and [EventTask] set.
  *
  * - [MicroTask] queue represents a set of tasks which are executing right after the current stack
  *   frame becomes clean and before a VM yield. All [MicroTask]s execute in order of insertion
  *   before VM yield and the next [MacroTask] is executed.
  * - [MacroTask] queue represents a set of tasks which are executed one at a time after each VM
  *   yield. The queue is ordered by time, and insertions can happen in any location.
  * - [EventTask] is a set of tasks which can at any time be inserted to the end of the [MacroTask]
  *   queue. This happens when the event fires.
  *
  */
trait Task extends StObject {
  
  /**
    * Function which needs to be executed by the Task after the [Zone.currentTask] has been set to
    * the current task.
    */
  var callback: js.Function
  
  /**
    * Represents the default work which needs to be done to un-schedule the Task from the VM. Not all
    * Tasks are cancelable, and therefore this method is optional.
    *
    * A zone may chose to intercept this function and perform its own un-scheduling.
    */
  var cancelFn: js.UndefOr[js.Function1[/* task */ this.type, Unit]] = js.undefined
  
  /**
    * Cancel the scheduling request. This method can be called from `ZoneSpec.onScheduleTask` to
    * cancel the current scheduling interception. Once canceled the task can be discarded or
    * rescheduled using `Zone.scheduleTask` on a different zone.
    */
  def cancelScheduleRequest(): Unit
  
  /**
    * Task specific options associated with the current task. This is passed to the `scheduleFn`.
    */
  var data: js.UndefOr[TaskData] = js.undefined
  
  /**
    * The Function to be used by the VM upon entering the [Task]. This function will delegate to
    * [Zone.runTask] and delegate to `callback`.
    */
  var invoke: js.Function
  
  /**
    * Number of times the task has been executed, or -1 if canceled.
    */
  var runCount: Double
  
  /**
    * Represents the default work which needs to be done to schedule the Task by the VM.
    *
    * A zone may choose to intercept this function and perform its own scheduling.
    */
  var scheduleFn: js.UndefOr[js.Function1[/* task */ this.type, Unit]] = js.undefined
  
  /**
    * Debug string representing the API which requested the scheduling of the task.
    */
  var source: String
  
  /**
    * Task state: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, `unknown`.
    */
  var state: TaskState
  
  /**
    * Task type: `microTask`, `macroTask`, `eventTask`.
    */
  var `type`: TaskType
  
  /**
    * @type {Zone} The zone which will be used to invoke the `callback`. The Zone is captured
    * at the time of Task creation.
    */
  val zone: Zone
}
object Task {
  
  inline def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: TaskType,
    zone: Zone
  ): Task = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCancelFn(value: Task => Unit): Self = StObject.set(x, "cancelFn", js.Any.fromFunction1(value))
    
    inline def setCancelFnUndefined: Self = StObject.set(x, "cancelFn", js.undefined)
    
    inline def setCancelScheduleRequest(value: () => Unit): Self = StObject.set(x, "cancelScheduleRequest", js.Any.fromFunction0(value))
    
    inline def setData(value: TaskData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setInvoke(value: js.Function): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setRunCount(value: Double): Self = StObject.set(x, "runCount", value.asInstanceOf[js.Any])
    
    inline def setScheduleFn(value: Task => Unit): Self = StObject.set(x, "scheduleFn", js.Any.fromFunction1(value))
    
    inline def setScheduleFnUndefined: Self = StObject.set(x, "scheduleFn", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: TaskType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
