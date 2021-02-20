package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoneJsStrings {
  
  @js.native
  sealed trait canceling extends TaskState
  @scala.inline
  def canceling: canceling = "canceling".asInstanceOf[canceling]
  
  @js.native
  sealed trait eventTask extends TaskType
  @scala.inline
  def eventTask: eventTask = "eventTask".asInstanceOf[eventTask]
  
  @js.native
  sealed trait macroTask extends TaskType
  @scala.inline
  def macroTask: macroTask = "macroTask".asInstanceOf[macroTask]
  
  @js.native
  sealed trait microTask extends TaskType
  @scala.inline
  def microTask: microTask = "microTask".asInstanceOf[microTask]
  
  @js.native
  sealed trait notScheduled extends TaskState
  @scala.inline
  def notScheduled: notScheduled = "notScheduled".asInstanceOf[notScheduled]
  
  @js.native
  sealed trait running extends TaskState
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait scheduled extends TaskState
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait scheduling extends TaskState
  @scala.inline
  def scheduling: scheduling = "scheduling".asInstanceOf[scheduling]
  
  @js.native
  sealed trait unknown extends TaskState
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}
