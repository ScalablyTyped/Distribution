package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoneJsStrings {
  
  @js.native
  sealed trait canceling
    extends StObject
       with TaskState
  inline def canceling: canceling = "canceling".asInstanceOf[canceling]
  
  @js.native
  sealed trait eventTask
    extends StObject
       with TaskType
  inline def eventTask: eventTask = "eventTask".asInstanceOf[eventTask]
  
  @js.native
  sealed trait macroTask
    extends StObject
       with TaskType
  inline def macroTask: macroTask = "macroTask".asInstanceOf[macroTask]
  
  @js.native
  sealed trait microTask
    extends StObject
       with TaskType
  inline def microTask: microTask = "microTask".asInstanceOf[microTask]
  
  @js.native
  sealed trait notScheduled
    extends StObject
       with TaskState
  inline def notScheduled: notScheduled = "notScheduled".asInstanceOf[notScheduled]
  
  @js.native
  sealed trait running
    extends StObject
       with TaskState
  inline def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait scheduled
    extends StObject
       with TaskState
  inline def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait scheduling
    extends StObject
       with TaskState
  inline def scheduling: scheduling = "scheduling".asInstanceOf[scheduling]
  
  @js.native
  sealed trait unknown
    extends StObject
       with TaskState
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
