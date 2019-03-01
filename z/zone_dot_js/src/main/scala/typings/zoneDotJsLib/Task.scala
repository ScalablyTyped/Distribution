package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Task extends js.Object {
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
  var cancelFn: js.UndefOr[js.Function1[/* task */ Task, scala.Unit]] = js.undefined
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
  var runCount: scala.Double
  /**
    * Represents the default work which needs to be done to schedule the Task by the VM.
    *
    * A zone may choose to intercept this function and perform its own scheduling.
    */
  var scheduleFn: js.UndefOr[js.Function1[/* task */ Task, scala.Unit]] = js.undefined
  /**
    * Debug string representing the API which requested the scheduling of the task.
    */
  var source: java.lang.String
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
  /**
    * Cancel the scheduling request. This method can be called from `ZoneSpec.onScheduleTask` to
    * cancel the current scheduling interception. Once canceled the task can be discarded or
    * rescheduled using `Zone.scheduleTask` on a different zone.
    */
  def cancelScheduleRequest(): scala.Unit
}

object Task {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: js.Function0[scala.Unit],
    invoke: js.Function,
    runCount: scala.Double,
    source: java.lang.String,
    state: TaskState,
    `type`: TaskType,
    zone: Zone,
    cancelFn: js.Function1[/* task */ Task, scala.Unit] = null,
    data: TaskData = null,
    scheduleFn: js.Function1[/* task */ Task, scala.Unit] = null
  ): Task = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("cancelScheduleRequest")(cancelScheduleRequest)
    __obj.updateDynamic("invoke")(invoke)
    __obj.updateDynamic("runCount")(runCount)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("zone")(zone)
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(cancelFn)
    if (data != null) __obj.updateDynamic("data")(data)
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(scheduleFn)
    __obj.asInstanceOf[Task]
  }
}

