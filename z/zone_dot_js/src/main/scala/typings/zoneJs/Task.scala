package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Task extends js.Object {
  
  /**
    * Function which needs to be executed by the Task after the [Zone.currentTask] has been set to
    * the current task.
    */
  var callback: js.Function = js.native
  
  /**
    * Represents the default work which needs to be done to un-schedule the Task from the VM. Not all
    * Tasks are cancelable, and therefore this method is optional.
    *
    * A zone may chose to intercept this function and perform its own un-scheduling.
    */
  var cancelFn: js.UndefOr[js.Function1[/* task */ this.type, Unit]] = js.native
  
  /**
    * Cancel the scheduling request. This method can be called from `ZoneSpec.onScheduleTask` to
    * cancel the current scheduling interception. Once canceled the task can be discarded or
    * rescheduled using `Zone.scheduleTask` on a different zone.
    */
  def cancelScheduleRequest(): Unit = js.native
  
  /**
    * Task specific options associated with the current task. This is passed to the `scheduleFn`.
    */
  var data: js.UndefOr[TaskData] = js.native
  
  /**
    * The Function to be used by the VM upon entering the [Task]. This function will delegate to
    * [Zone.runTask] and delegate to `callback`.
    */
  var invoke: js.Function = js.native
  
  /**
    * Number of times the task has been executed, or -1 if canceled.
    */
  var runCount: Double = js.native
  
  /**
    * Represents the default work which needs to be done to schedule the Task by the VM.
    *
    * A zone may choose to intercept this function and perform its own scheduling.
    */
  var scheduleFn: js.UndefOr[js.Function1[/* task */ this.type, Unit]] = js.native
  
  /**
    * Debug string representing the API which requested the scheduling of the task.
    */
  var source: String = js.native
  
  /**
    * Task state: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, `unknown`.
    */
  var state: TaskState = js.native
  
  /**
    * Task type: `microTask`, `macroTask`, `eventTask`.
    */
  var `type`: TaskType = js.native
  
  /**
    * @type {Zone} The zone which will be used to invoke the `callback`. The Zone is captured
    * at the time of Task creation.
    */
  val zone: Zone = js.native
}
object Task {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelScheduleRequest(value: () => Unit): Self = this.set("cancelScheduleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvoke(value: js.Function): Self = this.set("invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCount(value: Double): Self = this.set("runCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TaskState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TaskType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZone(value: Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFn(value: Task => Unit): Self = this.set("cancelFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancelFn: Self = this.set("cancelFn", js.undefined)
    
    @scala.inline
    def setData(value: TaskData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setScheduleFn(value: Task => Unit): Self = this.set("scheduleFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScheduleFn: Self = this.set("scheduleFn", js.undefined)
  }
}
