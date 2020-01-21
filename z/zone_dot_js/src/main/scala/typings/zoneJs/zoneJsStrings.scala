package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object zoneJsStrings {
  @js.native
  sealed trait canceling extends TaskState
  
  @js.native
  sealed trait eventTask extends TaskType
  
  @js.native
  sealed trait macroTask extends TaskType
  
  @js.native
  sealed trait microTask extends TaskType
  
  @js.native
  sealed trait notScheduled extends TaskState
  
  @js.native
  sealed trait running extends TaskState
  
  @js.native
  sealed trait scheduled extends TaskState
  
  @js.native
  sealed trait scheduling extends TaskState
  
  @js.native
  sealed trait unknown extends TaskState
  
  @scala.inline
  def canceling: canceling = "canceling".asInstanceOf[canceling]
  @scala.inline
  def eventTask: eventTask = "eventTask".asInstanceOf[eventTask]
  @scala.inline
  def macroTask: macroTask = "macroTask".asInstanceOf[macroTask]
  @scala.inline
  def microTask: microTask = "microTask".asInstanceOf[microTask]
  @scala.inline
  def notScheduled: notScheduled = "notScheduled".asInstanceOf[notScheduled]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  @scala.inline
  def scheduling: scheduling = "scheduling".asInstanceOf[scheduling]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

